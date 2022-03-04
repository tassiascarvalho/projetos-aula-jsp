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
public class Fisica extends Pessoa{
    private Integer idFisica;
    private String cpfFisica;
    private String apelidoFisica;

    public Fisica() {
    }

    public Fisica(Integer idFisica, String cpfFisica, String apelidoFisica) {
        this.idFisica = idFisica;
        this.cpfFisica = cpfFisica;
        this.apelidoFisica = apelidoFisica;
    }

    public Fisica(Integer idFisica, String cpfFisica, String apelidoFisica, Integer idPessoa, String nomePessoa, String emailPessoa, String tassiaPessoa) {
        super(idPessoa, nomePessoa, emailPessoa, tassiaPessoa);
        this.idFisica = idFisica;
        this.cpfFisica = cpfFisica;
        this.apelidoFisica = apelidoFisica;
    }

    public Integer getIdFisica() {
        return idFisica;
    }

    public void setIdFisica(Integer idFisica) {
        this.idFisica = idFisica;
    }

    public String getCpfFisica() {
        return cpfFisica;
    }

    public void setCpfFisica(String cpfFisica) {
        this.cpfFisica = cpfFisica;
    }

    public String getApelidoFisica() {
        return apelidoFisica;
    }

    public void setApelidoFisica(String apelidoFisica) {
        this.apelidoFisica = apelidoFisica;
    }
    
    
    
    
}
