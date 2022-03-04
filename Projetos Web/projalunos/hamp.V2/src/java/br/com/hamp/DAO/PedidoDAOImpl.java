/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hamp.DAO;

import br.com.hamp.model.Categoria;
import br.com.hamp.model.Pedido;
import br.com.hamp.model.PessoaFisica;
import br.com.hamp.model.Produto;
import br.com.hamp.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas Costa
 */
public class PedidoDAOImpl implements GenericDAO {

    private Connection conn;

    public PedidoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object object) {
        Pedido pedido = (Pedido) object;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO pedido (id_pessoa_f, id_pessoa_j, id_produto, valor_locacao, data_inicio,"
                + "data_limite, total_dias, endereco_local, numero_local, bairro_local, "
                + "cidade_local, estado_local, pais_local, cep_local,nome_pessoa_f,telefone_pessoa_f"
                + ",cpf, email_pessoa_f, nome_pessoa_j,"
                + "razao_social,email_pessoa_j, telefone_pessoa_j, nome_produto, imagem_produto,"
                + " categoria_produto, tamanho_produto, peso_produto, cor_produto, cnpj, situacao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pedido.getIdPessoFisica());
            stmt.setInt(2, pedido.getIdpessoaJuridica());
            stmt.setInt(3, pedido.getProduto().getIdProduto());
            stmt.setString(4, pedido.getValorLocacao());
            stmt.setDate(5, new java.sql.Date(pedido.getDataInicio().getTime()));
            stmt.setDate(6, new java.sql.Date(pedido.getDataLimite().getTime()));
            stmt.setString(7, pedido.getTotalDias());
            stmt.setString(8, pedido.getEnderecoLocal());
            stmt.setString(9, pedido.getNumeroLocal());
            stmt.setString(10, pedido.getBairroLocal());
            stmt.setString(11, pedido.getCidadeLocal());
            stmt.setString(12, pedido.getEstadoLocal());
            stmt.setString(13, pedido.getPaisLocal());
            stmt.setString(14, pedido.getCepLocal());
            stmt.setString(15, pedido.getNomePessoaFisica());
            stmt.setString(16, pedido.getTelefonePessoaFisica());
            stmt.setString(17, pedido.getCpf());
            stmt.setString(18, pedido.getEmailPessoaFisica());
            stmt.setString(19, pedido.getNomePessoaJuridica());
            stmt.setString(20, pedido.getRazaoSocial());
            stmt.setString(21, pedido.getEmailPessoaJuridica());
            stmt.setString(22, pedido.getTelefonePessoaFisica());
            stmt.setString(23, pedido.getNomeProduto());
            stmt.setString(24, pedido.getImagemProduto());
            stmt.setString(25, pedido.getCategoriaPoduto());
            stmt.setString(26, pedido.getTamanhoProduto());
            stmt.setString(27, pedido.getPesoProduto());
            stmt.setString(28, pedido.getCorPredominante());
            stmt.setString(29, pedido.getCnpj());
            stmt.setString(30, "Processando pela empresa locadora");
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println("Problemas ao cadastrar PEDIDO!Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
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
        String sql = "select p.* from pedido p order by p.nome_produto;";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPessoFisica(rs.getInt("id_pessoa_f"));
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdpessoaJuridica(rs.getInt("id_pessoa_j"));
                pedido.setValorLocacao(rs.getString("valor_locacao"));
                pedido.setTotalDias(rs.getString("total_dias"));
                pedido.setDataInicio(rs.getDate("data_inicio"));
                pedido.setDataLimite(rs.getDate("data_limite"));
                pedido.setNumeroLocal(rs.getString("numero_local"));
                pedido.setBairroLocal(rs.getString("bairro_local"));
                pedido.setCidadeLocal(rs.getString("cidade_local"));
                pedido.setEstadoLocal(rs.getString("estado_local"));
                pedido.setCepLocal(rs.getString("cep_local"));
                pedido.setEnderecoLocal(rs.getString("endereco_local"));
                pedido.setNomePessoaFisica(rs.getString("nome_pessoa_f"));
                pedido.setTelefonePessoaFisica(rs.getString("telefone_pessoa_f"));
                pedido.setCpf(rs.getString("cpf"));
                pedido.setEmailPessoaFisica(rs.getString("email_pessoa_f"));
                pedido.setNomePessoaJuridica(rs.getString("nome_pessoa_j"));
                pedido.setRazaoSocial(rs.getString("razao_social"));
                pedido.setEmailPessoaJuridica(rs.getString("email_pessoa_j"));
                pedido.setTelefonePessoaJuridica(rs.getString("telefone_pessoa_j"));
                pedido.setNomeProduto(rs.getString("nome_produto"));
                pedido.setImagemProduto(rs.getString("imagem_produto"));
                pedido.setCategoriaPoduto(rs.getString("categoria_produto"));
                pedido.setTamanhoProduto(rs.getString("tamanho_produto"));
                pedido.setPesoProduto(rs.getString("peso_produto"));
                pedido.setCorPredominante(rs.getString("cor_produto"));
                pedido.setCnpj(rs.getString("cnpj"));
                pedido.setSituacaoPedido(rs.getString("situacao"));
                resultado.add(pedido);
                System.out.println("o PEDIDO ÉEEEEEEEE "+pedido.getIdPedido());
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar PEDIDO!Erro:" + ex.getMessage());
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

    public List<Object> listarPorPessoaF(int idPessoaf) {
        int idPessoaF = idPessoaf;
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select p.* from pedido p where id_pessoa_f=? order by p.id_pedido;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPessoaF);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdPessoFisica(rs.getInt("id_pessoa_f"));
                pedido.setIdpessoaJuridica(rs.getInt("id_pessoa_j"));
                pedido.setValorLocacao(rs.getString("valor_locacao"));
                pedido.setTotalDias(rs.getString("total_dias"));
                pedido.setDataInicio(rs.getDate("data_inicio"));
                pedido.setDataLimite(rs.getDate("data_limite"));
                pedido.setNumeroLocal(rs.getString("numero_local"));
                pedido.setBairroLocal(rs.getString("bairro_local"));
                pedido.setCidadeLocal(rs.getString("cidade_local"));
                pedido.setEstadoLocal(rs.getString("estado_local"));
                pedido.setCepLocal(rs.getString("cep_local"));
                pedido.setEnderecoLocal(rs.getString("endereco_local"));

                pedido.setNomePessoaFisica(rs.getString("nome_pessoa_f"));
                pedido.setTelefonePessoaFisica(rs.getString("telefone_pessoa_f"));
                pedido.setCpf(rs.getString("cpf"));
                pedido.setEmailPessoaFisica(rs.getString("email_pessoa_f"));

                pedido.setNomePessoaJuridica(rs.getString("nome_pessoa_j"));
                pedido.setRazaoSocial(rs.getString("razao_social"));
                pedido.setEmailPessoaJuridica(rs.getString("email_pessoa_j"));
                pedido.setTelefonePessoaJuridica(rs.getString("telefone_pessoa_j"));

                pedido.setNomeProduto(rs.getString("nome_produto"));
                pedido.setImagemProduto(rs.getString("imagem_produto"));
                pedido.setCategoriaPoduto(rs.getString("categoria_produto"));
                pedido.setTamanhoProduto(rs.getString("tamanho_produto"));
                pedido.setPesoProduto(rs.getString("peso_produto"));
                pedido.setCorPredominante(rs.getString("cor_produto"));
                pedido.setCnpj(rs.getString("cnpj"));
                pedido.setSituacaoPedido(rs.getString("situacao"));
                resultado.add(pedido);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar PEDIDO!Erro:" + ex.getMessage());
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

    public List<Object> listarPorPessoaJ(int idPessoaj) {
        int idPessoaJ = idPessoaj;
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select p.* from pedido p where id_pessoa_j=? order by p.id_pedido;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idPessoaJ);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setIdPessoFisica(rs.getInt("id_pessoa_f"));
                pedido.setIdpessoaJuridica(rs.getInt("id_pessoa_j"));
                pedido.setIdpessoaJuridica(rs.getInt("id_produto"));
                pedido.setValorLocacao(rs.getString("valor_locacao"));
                pedido.setTotalDias(rs.getString("total_dias"));
                pedido.setDataInicio(rs.getDate("data_inicio"));
                pedido.setDataLimite(rs.getDate("data_limite"));
                pedido.setNumeroLocal(rs.getString("numero_local"));
                pedido.setBairroLocal(rs.getString("bairro_local"));
                pedido.setCidadeLocal(rs.getString("cidade_local"));
                pedido.setEstadoLocal(rs.getString("estado_local"));
                pedido.setCepLocal(rs.getString("cep_local"));
                pedido.setEnderecoLocal(rs.getString("endereco_local"));

                pedido.setNomePessoaFisica(rs.getString("nome_pessoa_f"));
                pedido.setTelefonePessoaFisica(rs.getString("telefone_pessoa_f"));
                pedido.setCpf(rs.getString("cpf"));
                pedido.setEmailPessoaFisica(rs.getString("email_pessoa_f"));

                pedido.setNomePessoaJuridica(rs.getString("nome_pessoa_j"));
                pedido.setRazaoSocial(rs.getString("razao_social"));
                pedido.setEmailPessoaJuridica(rs.getString("email_pessoa_j"));
                pedido.setTelefonePessoaJuridica(rs.getString("telefone_pessoa_j"));

                pedido.setNomeProduto(rs.getString("nome_produto"));
                pedido.setImagemProduto(rs.getString("imagem_produto"));
                pedido.setCategoriaPoduto(rs.getString("categoria_produto"));
                pedido.setTamanhoProduto(rs.getString("tamanho_produto"));
                pedido.setPesoProduto(rs.getString("peso_produto"));
                pedido.setCorPredominante(rs.getString("cor_produto"));
                pedido.setCnpj(rs.getString("cnpj"));
                pedido.setSituacaoPedido(rs.getString("situacao"));
                resultado.add(pedido);
                System.out.println("O ID DO PEDIDO É "+ pedido.getIdPedido());
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar PEDIDO!Erro:" + ex.getMessage());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Pedido pedido = null;
        String sql = "select p.* from pedido p where p.id_pedido=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idObject);
            rs = stmt.executeQuery();
            if (rs.next()) {
                pedido = new Pedido();
                pedido.setIdPessoFisica(rs.getInt("id_pessoa_f"));
                pedido.setIdpessoaJuridica(rs.getInt("id_pessoa_j"));
                pedido.setIdpessoaJuridica(rs.getInt("id_produto"));
                pedido.setValorLocacao(rs.getString("valor_locacao"));
                pedido.setDataInicio(rs.getDate("data_inicio"));
                pedido.setDataLimite(rs.getDate("data_limite"));
                pedido.setNumeroLocal(rs.getString("numero_local"));
                pedido.setBairroLocal(rs.getString("bairro_local"));
                pedido.setCidadeLocal(rs.getString("cidade_local"));
                pedido.setEstadoLocal(rs.getString("estado_local"));
                pedido.setCepLocal(rs.getString("cep_local"));
                pedido.setEnderecoLocal(rs.getString("endereco_local"));

            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Cliente! Erro:" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return pedido;
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Boolean alterarSituacao(int idPedido, String situacao) {
        int idpedido = idPedido;
        String situ = situacao;
        PreparedStatement stmt = null;
        String sql = "update pedido set situacao=? where id_pedido=?;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, situ);
            stmt.setInt(2, idpedido);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Pedido! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problema ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        return null;
        }
    }
}
