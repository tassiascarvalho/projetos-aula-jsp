/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Br.com.ComboBox.DAO;

import Br.com.ComboBox.MODEL.EstadoMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstadoDAO {

    Connection c;
    PreparedStatement stmt;
    String sql;

    public List<EstadoMODEL> ListarEstado() {

        List<EstadoMODEL> retorno = new ArrayList<>();

        sql = "Select * from estado order by (nome_estado) asc ";

        c = new Conexao().getConnection();

        try {
            stmt = c.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                EstadoMODEL item = new EstadoMODEL();

                item.setCod_Estado(rs.getInt("id_estado"));
                item.setNome_Estado(rs.getString("nome_estado"));
                item.setSigla_Estado(rs.getString("sigla_estado"));

                retorno.add(item);
            }

        } catch (SQLException ex) {

            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return retorno;
    }

}
