/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.model;

/**
 *
 * @author Tassia
 */
public class Pessoa {
    private Integer idPessoa;
    private String nomePessoa;
    private String emailPessoa;
    private String tassiaPessoa;
    
    //gerar construtores e encapsular campos

    public Pessoa() {
    }

    public Pessoa(Integer idPessoa, String nomePessoa, String emailPessoa, String tassiaPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.tassiaPessoa = tassiaPessoa;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getTassiaPessoa() {
        return tassiaPessoa;
    }

    public void setTassiaPessoa(String tassiaPessoa) {
        this.tassiaPessoa = tassiaPessoa;
    }

    
    
    
    
    
    
}
