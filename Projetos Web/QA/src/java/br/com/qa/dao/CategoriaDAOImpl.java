/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.dao;

import br.com.qa.model.Categoria;
import br.com.qa.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*@author Tassia*/
//Tem a dependência dos métodos contidos na GenericDAO
public class CategoriaDAOImpl implements GenericDAO {

    //Quando a classe DAOImpl é criada, 
    //a  primeira ação que deve ser realizada é a conexão com o BD
    private Connection conn; //Váriavel que armazenará a conexão

    public CategoriaDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.conectar(); //Realiza a Conexão
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        //Instância o objeto com os dados que virão do Servlet.
        Categoria categoria = (Categoria) object;
        //stmt indica que haverá manipulação de dados
        PreparedStatement stmt = null;
        //Cria a variavel para armazenar o código sql
        String sql = "insert into categoria "
                + "(descricaocategoria) "
                + "values(?); ";
        try {
            //O stmt utiliza a conexão criada, e prepara o SQL com o stmt
            stmt = conn.prepareStatement(sql);
            //Atribui os valores para os parametros (?)
            stmt.setString(1, categoria.getDescricaoCategoria());
            //Executa o SQL, sem retorno
            stmt.execute();
            //Se tudo der certo, e conectar ocorrer a inserção o método retorna true
            return true;
        } catch (Exception ex) {
            //Caso aconteça erro durante a inserção de dados executa os comandos do catch
            //que exibirá os erros
            System.out.println("Erro ao cadastrar Categoria! \n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            //independentemente se der certo ou errado é necessário fechar a conexão com o BD
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão! \n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Object> resultado = new ArrayList<>();

        String sql = "SELECT * FROM Categoria";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idcategoria"));
                categoria.setDescricaoCategoria(rs.getString("descricaocategoria"));

                resultado.add(categoria);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Categoria!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return resultado;
    }

    @Override
    public void excluir(int idObject) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM categoria"
                + " WHERE idcategoria = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao "
                    + "excluir Categoria!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.
                        closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao"
                        + "fechar os parâmetros da "
                        + "conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
     }

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Categoria categoria = null;
        String sql = "SELECT * FROM categoria"
                + " WHERE idcategoria = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("idcategoria"));
                categoria.setDescricaoCategoria(rs.getString("descricaocategoria"));                
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar "
                    + "Categoria! \n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(
                                            conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return categoria;
    }

    @Override
    public Boolean alterar(Object object) {
        Categoria categoria = (Categoria) object;
        PreparedStatement stmt = null;
        String sql = "update categoria SET"
                + " descricaocategoria = ? "
                + " WHERE idcategoria = ? ; ";
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, categoria.getDescricaoCategoria());
            stmt.setInt(2, categoria.getIdCategoria());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao alterar "
                    + "Categoria!"
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
}
