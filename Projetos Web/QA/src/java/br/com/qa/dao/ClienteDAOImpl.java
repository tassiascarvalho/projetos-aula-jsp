/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.dao;


import br.com.qa.model.Cliente;
import br.com.qa.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ClienteDAOImpl implements GenericDAO {

    private Connection conn;

    public ClienteDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {

        Cliente cliente = (Cliente) object;

        PreparedStatement stmt = null;
        String sql = "INSERT INTO cliente (rgcliente, "
                + "cidadecliente, "
                + "quantidadedependentescliente, "
                + "idpessoa)"
                + " VALUES (?, ?, ?, ?);";

        try {
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getRgCliente());
            stmt.setString(2, cliente.getCidadeCliente());
            stmt.setInt(3, cliente.getQuantidadeDependentesCliente());

            try {
                //PessoaDAOImpl pessoadao = new PessoaDAOImpl();
                //stmt.setInt(4, pessoadao.cadastrar(cliente));
                stmt.setInt(4, new PessoaDAOImpl().cadastrar(cliente));
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar Pessoa!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }

            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Cliente!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT p.*, c.*"
                + " FROM pessoa p, cliente c"
                + " WHERE p.idpessoa = c.idpessoa"
                + " ORDER BY p.nomepessoa;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdPessoa(rs.getInt("idpessoa"));
                cliente.setNomePessoa(rs.getString("nomepessoa"));
                cliente.setCpfPessoa(rs.getString("cpfpessoa"));
                cliente.setLoginPessoa(rs.getString("loginpessoa"));
                cliente.setSenhaPessoa(rs.getString("senhapessoa"));
                cliente.setTipoPessoa(rs.getString("tipopessoa"));
                cliente.setIdCliente(rs.getInt("idcliente"));
                cliente.setRgCliente(rs.getString("rgcliente"));
                cliente.setCidadeCliente(rs.getString("cidadecliente"));
                cliente.setQuantidadeDependentesCliente(rs.getInt("quantidadedependentescliente"));
                resultado.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Cliente!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM cliente"
                + " WHERE idpessoa = ? ;"
                + " COMMIT;"
                + " DELETE FROM pessoa"
                + " WHERE idpessoa = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.setInt(2, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao excluir Cliente!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
       ResultSet rs = null;
       PreparedStatement stmt = null;
       //instancia nosso objeto para carregar as informações
       Cliente oCliente = null;
       
       String sql = "SELECT * FROM CLIENTE C, PESSOA P"
               + "  WHERE C.IDPESSOA = P.IDPESSOA"
               + "  AND C.IDPESSOA = ?";
       
       try{
           stmt = conn.prepareStatement(sql);
           stmt.setInt(1, idObject);
           rs = stmt.executeQuery();
           
           if(rs.next()){
               oCliente = new Cliente();
               oCliente.setIdPessoa(rs.getInt("idpessoa"));
               oCliente.setNomePessoa(rs.getString("nomepessoa"));
               oCliente.setCpfPessoa(rs.getString("cpfpessoa"));
               oCliente.setLoginPessoa(rs.getString("loginpessoa"));
               oCliente.setSenhaPessoa(rs.getString("senhapessoa"));
               oCliente.setTipoPessoa(rs.getString("tipopessoa"));
               oCliente.setIdCliente(rs.getInt("idcliente"));
               oCliente.setRgCliente(rs.getString("rgcliente"));
               oCliente.setCidadeCliente(rs.getString("cidadecliente"));
               oCliente.setQuantidadeDependentesCliente(rs.getInt("quantidadedependentescliente"));
         }
       }catch(SQLException ex){
           System.out.println("Problemas ao carregar cliente \n Erro:" + ex.getMessage());
           ex.printStackTrace();
       }finally{
           try{
               ConnectionFactory.closeConnection(conn, stmt, rs);
           }catch(Exception ex){
               System.out.println("Erro ao fechar conexão \n Erro: "+ ex.getMessage());
               ex.printStackTrace();
           }
       }
       return oCliente;
    }

    @Override
    public Boolean alterar(Object object) {
       Cliente oCliente =(Cliente) object;
       PreparedStatement stmt = null;
       
       String sql= "UPDATE cliente SET "
               + " rgcliente = ?,"
               + " cidadecliente = ?,"
               + " quantidadedependentescliente = ?"
               + " WHERE idpessoa = ?";
       
       try{
           stmt = conn.prepareStatement(sql);
           
           stmt.setString(1, oCliente.getRgCliente());
           stmt.setString(2, oCliente.getCidadeCliente());
           stmt.setInt(3, oCliente.getQuantidadeDependentesCliente());
           stmt.setInt(4, oCliente.getIdPessoa());
           
           try{
               if(new PessoaDAOImpl().alterar(oCliente)){
                   stmt.executeUpdate();
                   return true;
               }else{
                   return false;
               }                   
           }catch(Exception ex){
                System.out.println("Problemas ao alterar pessoa \n "+ ex.getMessage());
                ex.printStackTrace();
                return false;
           }
           
       }catch(Exception ex){
           System.out.println("Problemas ao alterar Cliente \n Erro:" + ex.getMessage());
           ex.printStackTrace();
           return false;
       }finally{
           try{
               ConnectionFactory.closeConnection(conn, stmt);
           }catch(Exception ex){
               System.out.println("Problemas ao fechar conexão \n Erro: "+ ex.getMessage());
               ex.printStackTrace();
           }
       }
       
       
       
    }

}
