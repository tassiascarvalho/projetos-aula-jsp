package br.com.formulario.dao;

import br.com.formulario.model.Administrador;
import br.com.formulario.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.resource.spi.AdministeredObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tassia
 */
public class AdministradorDAOImpl {

    private Connection conn;

    public AdministradorDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.abrirconexao();
            System.out.println("Conectado com Sucesso");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Administrador logarAdm(String usuario, String senha) {
        PreparedStatement stmt = null; //Manipular SQL
        ResultSet rs = null;
        Administrador oAdministrador = null;

        String sql = "select * from administrador"
                + " where usuarioadministrador = ?"
                + " and senhaadministrador = ?";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            //Se o usuário estiver correto, retorna os dados e instancia o objeto no java
            if(rs.next()){
                oAdministrador = new Administrador();
                
                oAdministrador.setIdAdministrador(rs.getInt("idadministrador"));
                oAdministrador.setNomeAdministrador(rs.getString("nomeadministrador"));
                oAdministrador.setUsuarioAdministrador("usuarioadministrador");                
            }            
        }catch(SQLException ex){
            System.out.println("Problemas ao Logar Administrador Erro"+ ex.getMessage());
            ex.printStackTrace();
        }finally{
            try{
                ConnectionFactory.fechar(conn, stmt, rs);
            }catch(Exception ex){
                System.out.println("Problemas ao fechar conexao Erro"+ ex.getMessage());
                ex.printStackTrace();
            }
        }
        return oAdministrador;
    }

}
