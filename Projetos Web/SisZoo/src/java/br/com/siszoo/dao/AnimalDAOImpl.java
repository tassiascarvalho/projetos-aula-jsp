/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.dao;

import br.com.siszoo.model.Animal;
import br.com.siszoo.model.Especie;
import br.com.siszoo.util.ConnectionFactory;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class AnimalDAOImpl implements GenericDAO {
    
    private Connection conn;

    public AnimalDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Animal animal = (Animal) object;
        
        PreparedStatement stmt = null;
        String sql = "INSERT INTO animal (nome_animal, data_nascimento_animal, peso_animal, id_especie)"
                + " VALUES (?, ?, ?, ?);";
        
        Date data1 = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");      
        formatador.format(data1);
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, animal.getNomeAnimal());
            stmt.setDate(2, new java.sql.Date(data1.getTime()));
            stmt.setDouble(3, animal.getPesoAnimal());
            stmt.setInt(4, animal.getEspecie().getIdEspecie());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao cadastrar Animal!"
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

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT a.* , e.nome_especie"
                + " FROM animal a, especie e"
                + " WHERE e.id_especie = a.id_especie"
                + " ORDER BY a.nome_animal;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Animal animal = new Animal();
                animal.setIdAnimal(rs.getInt("id_animal"));
                animal.setNomeAnimal(rs.getString("nome_animal"));
                animal.setDataNascimentoAnimal(rs.getDate("data_nascimento_animal"));
                animal.setPesoAnimal(rs.getDouble("peso_animal"));
                
                /*Integer idEspecie = rs.getInt("id_especie");
                Especie especie = new Especie(idEspecie);
                animal.setEspecie(especie);*/
                
                Especie especie = new Especie(rs.getString("nome_especie"));
                animal.setEspecie(especie);
                
                resultado.add(animal);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Animal!"
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
        String sql = "DELETE FROM animal"
                + " WHERE id_animal = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("Erro ao excluir Animal!"
                    + "\n Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros da conexão!"
                        + "\n Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    };

    @Override
    public Object carregar(int idObject) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Animal animal = null;
        String sql = "SELECT a.*, e.id_especie, e.nome_especie"
                + " FROM animal a, especie e"
                + " WHERE a.id_especie = e.id_especie"
                + " AND a.id_animal = ? ;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                animal = new Animal();
                animal.setIdAnimal(rs.getInt("id_animal"));
                animal.setNomeAnimal(rs.getString("nome_animal"));
                animal.setDataNascimentoAnimal(rs.getDate("data_nascimento_animal"));
                animal.setPesoAnimal(rs.getDouble("peso_animal"));
                
                Especie especie = new Especie(rs.getInt("id_especie"));
                animal.setEspecie(especie);
                
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Animal!"
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
        return animal;
    }

    @Override
    public Boolean alterar(Object object) {
        Animal animal = (Animal) object;
        PreparedStatement stmt = null;
        String sql = "UPDATE animal SET"
                + " nome_animal = ?,"
                + " data_nascimento_animal = ?,"
                + " peso_animal = ?,"
                + " id_especie = ?"
                + " WHERE id_animal = ? ; ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, animal.getNomeAnimal());
            stmt.setDate(2, new java.sql.Date(animal.getDataNascimentoAnimal().getTime()));
            stmt.setDouble(3, animal.getPesoAnimal());
            stmt.setInt(4, animal.getEspecie().getIdEspecie());
            stmt.setInt(5, animal.getIdAnimal());
            
            //stmt.setInt(5, animal.getEspecie().getIdEspecie());
            stmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao alterar Animal!"
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
