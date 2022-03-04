/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.dao;

import br.com.pwbook.model.Publicacao;
import br.com.pwbook.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class PublicacaoDAOImpl implements GenericDAO {
    
    //Nesta classe é implementado os métodos do Publicação
    private Connection conn;

    public PublicacaoDAOImpl() throws Exception {
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
        Publicacao oPublicacao = (Publicacao) object;
        String sql= "insert into publicacao "
                + " (datapublicacao, textopublicacao, "
                + " tipopublicacao, idusuario)"
                + " VALUES (?,?,?,?);";        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(oPublicacao.getDataPublicacao().getTime()));
            stmt.setString(2, oPublicacao.getTextoPublicacao());
            stmt.setInt(3, oPublicacao.getTipoPublicacao());
            ///Como fazer quando tem associação
            stmt.setInt(4, oPublicacao.getUsuario().getIdUsuario());
            
            stmt.execute();
            return true;
        }catch (Exception ex) {   /*Dicaaaaaa - Copiar do catch para baixo e mudar apenas a MSG*/
            System.out.println("Erro cadastrarPublicacaoDAOIMPL \n Erro:" + ex.getMessage());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
