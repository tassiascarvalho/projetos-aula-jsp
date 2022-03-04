/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupa.dao;

import br.com.projetoupa.model.Sala;
import br.com.projetoupa.model.Sala;
import br.com.projetoupa.util.ConnectionFactory;
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
public class SalaDAOImpl implements GenericDAO{

    
     private Connection conn; 
    
    public SalaDAOImpl() throws Exception {        
           try {
            this.conn = ConnectionFactory.abrirconexao(); 
            //Realiza a Conexão
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    
    
    
    
    @Override
    public Boolean cadastrar(Object object) {
        //Instância o objeto com os dados que virão do Servlet.
        Sala oSala = (Sala) object;
        //stmt indica que haverá manipulação de dados
        PreparedStatement stmt = null;
        //Cria a variavel para armazenar o código sql
        String sql = "insert into sala ("
                +" numerosala) "
                +" values(?); ";
        try {
            //O stmt utiliza a conexão criada, e prepara o SQL com o stmt
            stmt = conn.prepareStatement(sql);
            //Atribui os valores para os parametros (?)
            stmt.setInt(1, oSala.getNumeroSala());
            
            //Executa o SQL, sem retorno
            stmt.execute();
            //Se tudo der certo e conectar ocorre a inserção 
            //o método retorna true
            return true;
        } catch (Exception ex) {
            //Caso aconteça erro durante a inserção de dados executa
            //os comandos do catch que exibirá os erros
            System.out.println("Erro ao cadastrar Sala!"
                    + " \n Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            //independentemente se der certo ou errado é necessário fechar a conexão com o BD
            try {
                ConnectionFactory.fechar(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os "
                        + "parâmetros da conexão! "
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Object> listar() {
         PreparedStatement stmt = null;
        //rs utilizado para armazenar os dados 
        //recebidos do BD
        ResultSet rs = null;
        //Para criar uma lista no forma array
        List<Object> resultado = new ArrayList<>();
        
        String sql="Select * from sala";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                //Instancia o objeto para recuperar a informação 
                //registro a registro                
                Sala oSala = new Sala();
                //Recupera atributo por atributo
                oSala.setIdSala(rs.getInt("idsala"));
                oSala.setNumeroSala(rs.getInt("numerosala"));
                
                //Adiciona o registro a list<object> para retorno
                resultado.add(oSala);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Sala!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.fechar(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros "
                        + "de conexão!"
                        + "\n Erro: " + ex.getMessage());
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
