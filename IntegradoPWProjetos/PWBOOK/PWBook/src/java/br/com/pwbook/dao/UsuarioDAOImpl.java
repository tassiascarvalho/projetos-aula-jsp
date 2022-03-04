/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.dao;

import br.com.pwbook.model.Usuario;
import br.com.pwbook.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class UsuarioDAOImpl implements GenericDAO {
    //Nesta classe é implementado os métodos do Usuario

    private Connection conn;

    public UsuarioDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        //Instância o objeto com os dados que virão do Servlet
        Usuario oUsuario = (Usuario) object;
        PreparedStatement stmt = null;

        String sql = "insert into usuario("
                + "nomeusuario,"
                + "datanascimentousuario,"
                + "emailusuario,"
                + "senhausuario,"
                + "telefoneusuario,"
                + "generousuario,"
                + "caminhofotousuario,"
                + "sinteseusuario,"
                + "caminhocapausuario,"
                + "tiposeguidorusuario)"
                + "values(?,?,?,?,?,?,?,?,?,?);";

        try {
            //O stmt utilizou a conexão, preparou o sql
            stmt = conn.prepareStatement(sql);
            //Abaixo passamos os parametros seguindo a ordem dos campos
            stmt.setString(1, oUsuario.getNomeUsuario());
            stmt.setDate(2, new java.sql.Date(oUsuario.getDataNascimentoUsuario().getTime()));
            stmt.setString(3, oUsuario.getEmailUsuario());
            stmt.setString(4, oUsuario.getSenhaUsuario());
            stmt.setString(5, oUsuario.getTelefoneUsuario());
            stmt.setString(6, oUsuario.getGeneroUsuario());
            stmt.setString(7, oUsuario.getCaminhofotoUsuario());
            stmt.setString(8, oUsuario.getSinteseUsuario());
            stmt.setString(9, oUsuario.getCaminhocapaUsuario());
            stmt.setString(10, oUsuario.getTiposeguidorUsuario());
            //Executa o SQL já com os parametros
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro cadastrarUsuarioDAOIMPL \n Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {//O finally sempre é executado, neste caso fecha a conexão
            try {
                ConnectionFactory.fecharconexao(conn, stmt);//Fecha a conexão?
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parâmetros de conexão"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        PreparedStatement stmt = null;//Manipula o sql
        ResultSet rs = null;//Armazena os dados de retorno sql
        //Será utilizado para converter o rs em list para 
        //ser exibido na JSP
        List<Object> resultado = new ArrayList<>();
        //SQL que irá fazer a busca
        String sql = "select * from usuario";

        try {
            stmt = conn.prepareStatement(sql);
            //dados
            rs = stmt.executeQuery();

            while (rs.next()) {
                //vazio
                Usuario oUsuario = new Usuario();

                oUsuario.setIdUsuario(rs.getInt("idusuario"));
                oUsuario.setNomeUsuario(rs.getString("nomeusuario"));
                oUsuario.setDataNascimentoUsuario(rs.getDate("datanascimentousuario"));
                oUsuario.setEmailUsuario(rs.getString("emailusuario"));
                oUsuario.setSenhaUsuario(rs.getString("senhausuario"));
                oUsuario.setTelefoneUsuario(rs.getString("telefoneusuario"));
                oUsuario.setGeneroUsuario(rs.getString("generousuario"));
                oUsuario.setCaminhofotoUsuario(rs.getString("caminhofotousuario"));
                oUsuario.setSinteseUsuario(rs.getString("sinteseusuario"));
                oUsuario.setCaminhocapaUsuario(rs.getString("caminhocapausuario"));
                oUsuario.setTiposeguidorUsuario(rs.getString("tiposeguidorusuario"));

                resultado.add(oUsuario);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao Listar(UsuarioDAOImpl) "
                    + "\n Erro:" + ex.getMessage());
        } finally {
            //Se a consultar der certo ou errado precisa fechar a conexão
            try {
                ConnectionFactory.fecharconexao(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão "
                        + "\n Erro:" + ex.getMessage());
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        //As declarações dos atributos que nós vamos utilizar
        PreparedStatement stmt = null;
        String sql = "delete from usuario where idusuario =?;";
        //Dentro do try é onde acontece a mágica, que nós chamamos as funções
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {//Caso der errado
            System.out.println("Problemas ao ExcluirUsuario(dao) \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {//é executado de qualquer forma para fechar a conexão
            try {
                ConnectionFactory.fecharconexao(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt= null;
        ResultSet rs= null;
        Usuario oUsuario = null;
        
        String sql="SELECT * FROM usuario WHERE idusuario = ?;";
        
        try{
            //coloca o sql dentro stmt
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if(rs.next()){
                oUsuario = new Usuario();
                oUsuario.setIdUsuario(rs.getInt("idusuario"));
                oUsuario.setNomeUsuario(rs.getString("nomeusuario"));
                oUsuario.setDataNascimentoUsuario(rs.getDate("datanascimentousuario"));
                oUsuario.setEmailUsuario(rs.getString("emailusuario"));
                oUsuario.setSenhaUsuario(rs.getString("senhausuario"));
                oUsuario.setTelefoneUsuario(rs.getString("telefoneusuario"));
                oUsuario.setGeneroUsuario(rs.getString("generousuario"));
                oUsuario.setCaminhofotoUsuario(rs.getString("caminhofotousuario"));
                oUsuario.setSinteseUsuario(rs.getString("sinteseusuario"));
                oUsuario.setCaminhocapaUsuario(rs.getString("caminhocapausuario"));
                oUsuario.setTiposeguidorUsuario(rs.getString("tiposeguidorusuario"));                
            }
        }catch(SQLException ex){
            System.out.println("Problemas ao carregar usuario \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally {//é executado de qualquer forma para fechar a conexão
            try {
                ConnectionFactory.fecharconexao(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }  
        return oUsuario;
    }

    @Override
    public Boolean alterar(Object object) {
        PreparedStatement stmt = null;
        Usuario oUsuario  = (Usuario) object;
        
        String sql = "UPDATE usuario SET "
                + "nomeusuario=?,"
                + "datanascimentousuario=?,"
                + "emailusuario=?,"
                + "senhausuario=?,"
                + "telefoneusuario=?,"
                + "generousuario=?,"
                + "caminhofotousuario=?,"
                + "sinteseusuario=?,"
                + "caminhocapausuario=?,"
                + "tiposeguidorusuario=? "
                + "WHERE idusuario = ?;";
        
        try{
            stmt = conn.prepareStatement(sql);
            //Abaixo passamos os parametros seguindo a ordem dos campos
            stmt.setString(1, oUsuario.getNomeUsuario());
            stmt.setDate(2, new java.sql.Date(oUsuario.getDataNascimentoUsuario().getTime()));
            stmt.setString(3, oUsuario.getEmailUsuario());
            stmt.setString(4, oUsuario.getSenhaUsuario());
            stmt.setString(5, oUsuario.getTelefoneUsuario());
            stmt.setString(6, oUsuario.getGeneroUsuario());
            stmt.setString(7, oUsuario.getCaminhofotoUsuario());
            stmt.setString(8, oUsuario.getSinteseUsuario());
            stmt.setString(9, oUsuario.getCaminhocapaUsuario());
            stmt.setString(10, oUsuario.getTiposeguidorUsuario());
            stmt.setInt(11, oUsuario.getIdUsuario());
            //Executa o SQL já com os parametros
            stmt.executeUpdate();
            return true;
        }catch (Exception ex) {
            System.out.println("Erro alterarUsuarioDAOIMPL \n Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {//O finally sempre é executado, neste caso fecha a conexão
            try {
                ConnectionFactory.fecharconexao(conn, stmt);//Fecha a conexão?
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parâmetros de conexão"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

}
