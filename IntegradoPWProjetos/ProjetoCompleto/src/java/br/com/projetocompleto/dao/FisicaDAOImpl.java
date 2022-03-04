/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import br.com.projetocompleto.model.Fisica;
import br.com.projetocompleto.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Tassia
 */
public class FisicaDAOImpl implements GenericDAO {

    //Criar Conexão
    Connection conn;

    public FisicaDAOImpl() throws Exception {
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
        Fisica oFisica = (Fisica) object;
        String sql = "INSERT INTO fisica "
                + "(cpffisica, apelidofisica, idpessoa)"
                + " values(?,?,?);";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, oFisica.getCpfFisica());
            stmt.setString(2, oFisica.getApelidoFisica());
            
            try{
                //É aqui que acontece a associação
                PessoaDAOImpl dao = new PessoaDAOImpl();
                stmt.setInt(3, dao.cadastrar(oFisica));
            }catch(Exception ex){
                System.out.println("Erro ao cadastrar Pessoa"
                        + ex.getMessage());
                ex.printStackTrace();
            }
            
            stmt.execute();
            return true;
        }catch(Exception ex){            
            System.out.println("Erro ao cadastrar Fisica Erro: " 
                    + ex.getMessage());
            ex.printStackTrace();
            return false;
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, null);
            }catch(Exception ex){            
            System.out.println("Erro ao Fechar ConexãoErro: " 
                    + ex.getMessage());
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
