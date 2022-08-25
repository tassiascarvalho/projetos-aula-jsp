/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import br.com.projetocompleto.model.ItensSaida;
import br.com.projetocompleto.model.Juridica;
import br.com.projetocompleto.model.Produto;
import br.com.projetocompleto.model.Saida;
import br.com.projetocompleto.util.ConnectionFactory;
import com.sun.xml.ws.tx.at.v10.types.PrepareResponse;
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
public class ItensSaidaDAOImpl implements GenericDAO {

    //Construtor com a conexão
    Connection conn;

    public ItensSaidaDAOImpl() throws Exception {
        //Conexão
        try {
            conn = ConnectionFactory.conexao();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        PreparedStatement stmt = null;
        ItensSaida oItensSaida = (ItensSaida) object;

        String sql = "insert into itenssaida (idproduto, valorunitem, idsaida) "
                + " values (?, ?, ?);";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, oItensSaida.getoProduto().getIdProduto());
            stmt.setDouble(2, oItensSaida.getValorUnItem());
            stmt.setInt(3, oItensSaida.getoSaida().getIdSaida());
            stmt.execute();
            return true;                    
        }catch (Exception ex) {
            System.out.println("Erro ao cadastrar Item Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, null);
            } catch (Exception ex) {
                System.out.println("Erro ao Fechar ConexãoErro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }   
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Object> listarItensSaida(int idSaida){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> resultado = new ArrayList<>();
        ItensSaida oItensSaida = null;
        Produto oProduto = null;
        Juridica oJuridica= null;
        String sql = "select p.idproduto, p.nomeproduto, p.valorproduto, " +
                    "j.idjuridica, pe.nomepessoa, s.idsaida, i.qtditem, i.iditem " +
                    "from produto p, juridica j, pessoa pe, saida s, itenssaida i " +
                    "where p.idjuridica = j.idjuridica " +
                    "and j.idpessoa = pe.idpessoa and p.idproduto = i.idproduto " +
                    "and s.idsaida = i.idsaida and s.idsaida = ?;";        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idSaida);
            rs = stmt.executeQuery();            
            while(rs.next()){
                oItensSaida = new ItensSaida();
                //Instanciar separadamente
                oProduto = new Produto();
                oProduto.setIdProduto(rs.getInt("idproduto"));
                oProduto.setNomeProduto(rs.getString("nomeproduto"));
                oProduto.setValorProduto(rs.getDouble("valorproduto"));
                //Instancia o objeto Juridica
                oJuridica = new Juridica();
                oJuridica.setIdJuridica(rs.getInt("idjuridica"));
                oJuridica.setNomePessoa(rs.getString("nomepessoa"));
                oProduto.setJuridica(oJuridica);
                oItensSaida.setoProduto(oProduto);
                //Recuperar o idSaida //Criar construtor na saida marcando só o ID
                oItensSaida.setoSaida(new Saida(rs.getInt("idsaida")));
                oItensSaida.setIdItem(rs.getInt("iditem"));
                oItensSaida.setQtdItem(rs.getInt("qtditem"));
                
                resultado.add(oItensSaida);
            }
        }catch(SQLException ex){
             System.out.println("Erro ao listar ItensSaida Erro: " + ex.getMessage());
            ex.printStackTrace();
        }finally {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
