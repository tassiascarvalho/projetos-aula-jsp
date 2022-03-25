/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controledeusuario.model;

import java.util.Date;

/**
 *
 * @author Tassia
 */
public class Pessoa {
    private Integer idPessoa;
    private String cpf;
    private String nome;
    private Date datanascimento;
    private String login;
    private String senha;
    private Cidade cidade;

    public Pessoa() {
    }

    public Pessoa(Integer idPessoa, String cpf, String nome, Date datanascimento, String login, String senha, Cidade cidade) {
        this.idPessoa = idPessoa;
        this.cpf = cpf;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.login = login;
        this.senha = senha;
        this.cidade = cidade;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
   
}
