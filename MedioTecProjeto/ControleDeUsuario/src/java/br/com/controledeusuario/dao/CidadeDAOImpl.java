/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.dao;

import br.com.controledeusuario.model.Cidade;
import br.com.controledeusuario.model.Estado;
import br.com.controledeusuario.util.ConnectionFactory;
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
public class CidadeDAOImpl implements GenericDAO {

    private Connection conn;

    public CidadeDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    @Override
    public Boolean cadastrar(Object object) {
        PreparedStatement stmt = null;
        Cidade oCidade = (Cidade) object;
        String sql = "INSERT INTO cidade("
                + " nomecidade, idestado)"
                + " VALUES(?, ?)";        
        try{
            stmt= conn.prepareStatement(sql);
            stmt.setString(1, oCidade.getNomeCidade());
            stmt.setInt(2, oCidade.getEstado().getIdEstado());
            stmt.execute();
            return true;
        }catch (SQLException ex) {//Caso dê problema
            System.out.println("Problemas ao cadastrar cidade \n Erro:" + ex.getMessage());
            ex.printStackTrace();
            //Se der algum erro retornar falso.
            return false;
        } finally {//Executa de qualquer forma       
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão \n Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs= null;
        String sql = "SELECT idcidade, nomecidade, siglaestado, nomeestado"
                + " from estado, cidade where cidade.idestado = estado.idestado ";       
        try{
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cidade oCidade = new Cidade();
                oCidade.setIdCidade(rs.getInt("idcidade"));
                oCidade.setNomeCidade(rs.getString("nomecidade"));
                //Adicionar construtor com os atributos especificos na classe Estado
                oCidade.setEstado( new Estado(rs.getString("nomeestado"), rs.getString("siglaestado")));
                
                resultado.add(oCidade);                
            }
        }catch (SQLException ex) {
            System.out.println("Erro ao Listar Cidade \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            //Fecha a conexão
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao fechar parametros de conexao \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
