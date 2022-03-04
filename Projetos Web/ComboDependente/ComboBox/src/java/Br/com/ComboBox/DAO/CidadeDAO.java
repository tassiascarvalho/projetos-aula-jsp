/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Br.com.ComboBox.DAO;

import Br.com.ComboBox.MODEL.CidadeMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CidadeDAO {

    Connection c;
    PreparedStatement stmt;
    String sql;

    public List<CidadeMODEL> ListarCidade(int fk) {

        List<CidadeMODEL> retorno = new ArrayList<>();

        sql = "Select * from cidade where fk_estado = ? order by (nome_cidade) asc";

        c = new Conexao().getConnection();

        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, fk);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                CidadeMODEL item = new CidadeMODEL();

                item.setFk_Estado(rs.getInt("fk_estado"));
                item.setId_Cidade(rs.getInt("id_cidade"));
                item.setNome_Cidade(rs.getString("nome_cidade"));

                retorno.add(item);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());

            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = null;

        }
        return retorno;
    }
}
