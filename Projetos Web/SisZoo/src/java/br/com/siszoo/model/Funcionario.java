/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siszoo.model;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa {
    
    private Integer idFuncionario;
    private Double salarioFuncionario;
    private Date dataAdmissaoFuncionario;

    public Funcionario() {
    }

    public Funcionario(Integer idFuncionario, Double salarioFuncionario, Date dataAdmissaoFuncionario, Integer idPessoa, String nomePessoa, String cpfPessoa, String loginPessoa, String senhaPessoa, String tipoPessoa) {
        super(idPessoa, nomePessoa, cpfPessoa, loginPessoa, senhaPessoa, tipoPessoa);
        this.idFuncionario = idFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.dataAdmissaoFuncionario = dataAdmissaoFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Date getDataAdmissaoFuncionario() {
        return dataAdmissaoFuncionario;
    }

    public void setDataAdmissaoFuncionario(Date dataAdmissaoFuncionario) {
        this.dataAdmissaoFuncionario = dataAdmissaoFuncionario;
    }
}
