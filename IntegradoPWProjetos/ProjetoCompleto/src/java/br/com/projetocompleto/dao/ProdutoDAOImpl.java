/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import br.com.projetocompleto.model.Juridica;
import br.com.projetocompleto.model.Produto;
import br.com.projetocompleto.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class ProdutoDAOImpl implements GenericDAO{
    //Criar a ProdutoDAOImpl, adicionar o implements GenericDAO
    //Colocar a conexão com o BD
    Connection conn;
    
    public ProdutoDAOImpl() throws Exception {
        //Conexão
        try{
            conn = ConnectionFactory.conexao();
            System.out.println("Conectado com Sucesso");
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }        
    }
    
    
    @Override
    public Boolean cadastrar(Object object) {
        PreparedStatement stmt = null;
        Produto oProduto = (Produto) object;
        
        String sql="Insert Into produto (nomeproduto, valorproduto, idjuridica) "
                + "values(?,?,?)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oProduto.getNomeProduto());
            stmt.setDouble(2, oProduto.getValorProduto());
            stmt.setInt(3, oProduto.getJuridica().getIdJuridica()); 
            //Pega o get do objeto e depois pega o atributo
            stmt.execute();
            return true;
        }catch (Exception ex) {
            System.out.println("Erro ao cadastrar Produto Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao Fechar ConexãoErro: "
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }    
        
    }

    @Override
    public List<Object> listar() {
        ResultSet rs= null;
        PreparedStatement stmt = null;
        List<Object> resultado = new ArrayList<>();
        Produto oProduto = null;
        Juridica oJuridica = null;
        String sql="select p.idproduto, p.nomeproduto, p.valorproduto, " +
                    " j.idjuridica, pe.nomepessoa  from produto p, juridica j, pessoa pe" +
                    " where p.idjuridica = j.idjuridica  and j.idpessoa = pe.idpessoa";        
        try{
            stmt = conn.prepareStatement(sql);
            rs= stmt.executeQuery();            
            while(rs.next()){
                oProduto = new Produto();
                oProduto.setIdProduto(rs.getInt("idproduto"));
                oProduto.setNomeProduto(rs.getString("nomeproduto"));
                oProduto.setValorProduto(rs.getDouble("valorproduto"));
                //Instancia o objeto Juridica
                oJuridica = new Juridica();
                oJuridica.setIdJuridica(rs.getInt("idjuridica"));
                oJuridica.setNomePessoa(rs.getString("nomepessoa"));
                //Atribui a Pessoa Juridica ao Produto
                oProduto.setJuridica(oJuridica);                                
                resultado.add(oProduto);
            }
        }catch (Exception ex) {
            System.out.println("Erro ao listar Produto Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao Fechar ConexãoErro: "+ ex.getMessage());
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
        ResultSet rs= null;
        PreparedStatement stmt = null;        
        Produto oProduto = null;
        Juridica oJuridica = null;
        String sql="select p.idproduto, p.nomeproduto, p.valorproduto, " +
                    " j.idjuridica, pe.nomepessoa  from produto p, juridica j, pessoa pe" +
                    " where p.idjuridica = j.idjuridica  and j.idpessoa = pe.idpessoa "+
                    " and p.idproduto = ?";        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs= stmt.executeQuery();            
            if(rs.next()){
                oProduto = new Produto();
                oProduto.setIdProduto(rs.getInt("idproduto"));
                oProduto.setNomeProduto(rs.getString("nomeproduto"));
                oProduto.setValorProduto(rs.getDouble("valorproduto"));
                //Instancia o objeto Juridica
                oJuridica = new Juridica();
                oJuridica.setIdJuridica(rs.getInt("idjuridica"));
                oJuridica.setNomePessoa(rs.getString("nomepessoa"));
                //Atribui a Pessoa Juridica ao Produto
                oProduto.setJuridica(oJuridica);                                
                
            }
        }catch (Exception ex) {
            System.out.println("Erro ao carregar Produto Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Erro ao Fechar ConexãoErro: "+ ex.getMessage());
                ex.printStackTrace();
            }
        }    
        return oProduto;
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
