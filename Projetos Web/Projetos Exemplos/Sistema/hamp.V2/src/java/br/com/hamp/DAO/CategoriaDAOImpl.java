
package br.com.hamp.DAO;

import br.com.hamp.model.Categoria;
import br.com.hamp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.fileupload.FileItem;

/**
 *
 * @author Douglas
 */
public class CategoriaDAOImpl implements GenericDAO{

     private Connection conn;

    public CategoriaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    @Override
    public Boolean cadastrar(Object object) {
        Categoria categoria = (Categoria) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO categoria (descricao_categoria, nome_categoria) values (?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricaoCategoria());
            stmt.setString(2, categoria.getNomeCategoria());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
           System.err.println("Problemas ao cadastrar Categoria!Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false; 
        }finally{
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.err.println("Problemas ao fechar conexão!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        String sql = "select pa.* from categoria pa order by pa.nome_categoria;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Categoria categoria =  new Categoria();
                categoria.setIdCategoria(rs.getInt("id_categoria"));
                categoria.setDescricaoCategoria(rs.getString("descricao_categoria"));
                categoria.setNomeCategoria(rs.getString("nome_categoria"));
                resultado.add(categoria);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Categoria.!Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar conexão!Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;

        
    }

    @Override
    public void excluir(Integer idObject) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM categoria where id_categoria = ?";
        try {
            stmt =  conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (SQLException ex) {
             System.out.println("Problemas ao excluir Categoria! Erro: "+ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
              ConnectionFactory.closeConnection(conn, stmt);
          }catch(Exception ex){
              System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:"+ex.getMessage());
              ex.printStackTrace();
          }
        }
        
    }

    @Override
    public Object carregar(int idObject) {
         PreparedStatement stmt = null; 
        ResultSet rs = null;
        Categoria categoria = null;
        String sql = "select c.* from categoria c where c.id_categoria=?;";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if(rs.next()){
                categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("id_categoria"));
                categoria.setNomeCategoria(rs.getString("nome_categoria"));
                categoria.setDescricaoCategoria(rs.getString("descricao_categoria"));
            }
        }catch(SQLException ex){
          System.out.println("Problemas ao carregar Categoria! Erro:" + ex.getMessage());
          ex.printStackTrace();
        }finally{
          try{
              ConnectionFactory.closeConnection(conn, stmt, rs);
          }catch(Exception ex){
              System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:"+ex.getMessage());
              ex.printStackTrace();
          }
      }
      return categoria;
    }

    @Override
    public Boolean alterar(Object object) {
      Categoria categoria = (Categoria) object;
        PreparedStatement stmt = null; 
        String sql = "update categoria set nome_categoria=?, descricao_categoria=? where id_categoria=?;";
        try{ 
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.setString(2, categoria.getDescricaoCategoria());
            stmt.setInt(3, categoria.getIdCategoria());
            stmt.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println("Problemas ao alterar Categoria! Erro: "+ex.getMessage()); 
            ex.printStackTrace(); 
            return false;
        }finally{ 
            try{
                ConnectionFactory.closeConnection(conn, stmt);
            }catch(Exception ex){
                System.out.println("Problema ao fechar os parâmetros de conexão! Erro: "+ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

   
    
}
