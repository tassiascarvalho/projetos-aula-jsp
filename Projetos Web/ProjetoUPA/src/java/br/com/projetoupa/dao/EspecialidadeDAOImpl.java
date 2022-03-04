/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupa.dao;

import br.com.projetoupa.model.Especialidade;
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
public class EspecialidadeDAOImpl implements GenericDAO {

    //Quando a classe DAOImpl é criada, 
    //a  primeira ação que deve ser realizada é a conexão com o BD
    private Connection conn; //Váriavel que armazenara a conexão

    //metodo construtor
    public EspecialidadeDAOImpl() throws Exception {
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
        Especialidade oEspecialidade = (Especialidade) object;
        //stmt indica que haverá manipulação de dados
        PreparedStatement stmt = null;
        //Cria a variavel para armazenar o código sql
        String sql = "insert into especialidade ("
                +" descricaoespecialidade, "
                +" nomeespecialidade)"
                +" values(?,?); ";
        try {
            //O stmt utiliza a conexão criada, e prepara o SQL com o stmt
            stmt = conn.prepareStatement(sql);
            //Atribui os valores para os parametros (?)
            stmt.setString(1, oEspecialidade.getDescricaoEspecialidade());
            stmt.setString(2, oEspecialidade.getNomeEspecialidade());
            //Executa o SQL, sem retorno
            stmt.execute();
            //Se tudo der certo e conectar ocorre a inserção 
            //o método retorna true
            return true;
        } catch (Exception ex) {
            //Caso aconteça erro durante a inserção de dados executa
            //os comandos do catch que exibirá os erros
            System.out.println("Erro ao cadastrar Especialidade!"
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
        
        String sql="Select * from especialidade";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                //Instancia o objeto para recuperar a informação 
                //registro a registro                
                Especialidade oEspecialidade = new Especialidade();
                //Recupera atributo por atributo
                oEspecialidade.setIdEspecialidade(rs.getInt("idespecialidade"));
                oEspecialidade.setNomeEspecialidade
                           (rs.getString("nomeespecialidade"));
                oEspecialidade.setDescricaoEspecialidade
                          (rs.getString("descricaoespecialidade"));
                
                //Adiciona o registro a list<object> para retorno
                resultado.add(oEspecialidade);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Especialidade!"
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
