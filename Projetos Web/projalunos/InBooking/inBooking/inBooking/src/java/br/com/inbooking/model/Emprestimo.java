package br.com.inbooking.model;

import java.util.Date;

public class Emprestimo {
    private Integer idEmprestimo;
    private Integer id_Acervo;
    private Integer id_ClientePessoa;
    private Integer id_FuncionarioPessoa;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String statusEmprestimo;

    public Emprestimo() {
    }

    public Emprestimo(Integer idEmprestimo, Integer id_Acervo, Integer id_ClientePessoa, Integer id_FuncionarioPessoa, Date dataEmprestimo, Date dataDevolucao, String statusEmprestimo) {
        this.idEmprestimo = idEmprestimo;
        this.id_Acervo = id_Acervo;
        this.id_ClientePessoa = id_ClientePessoa;
        this.id_FuncionarioPessoa = id_FuncionarioPessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.statusEmprestimo = statusEmprestimo;
    }

    public Integer getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Integer idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Integer getId_Acervo() {
        return id_Acervo;
    }

    public void setId_Acervo(Integer id_Acervo) {
        this.id_Acervo = id_Acervo;
    }

    public Integer getId_ClientePessoa() {
        return id_ClientePessoa;
    }

    public void setId_ClientePessoa(Integer id_ClientePessoa) {
        this.id_ClientePessoa = id_ClientePessoa;
    }

    public Integer getId_FuncionarioPessoa() {
        return id_FuncionarioPessoa;
    }

    public void setId_FuncionarioPessoa(Integer id_FuncionarioPessoa) {
        this.id_FuncionarioPessoa = id_FuncionarioPessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }
}
