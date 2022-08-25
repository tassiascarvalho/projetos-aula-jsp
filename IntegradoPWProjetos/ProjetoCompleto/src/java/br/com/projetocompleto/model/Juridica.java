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
public class Juridica extends Pessoa{
    private Integer idJuridica;
    private String cnpjJuridica;
    private String representanteJuridica;
    
    //Adicionar construtor vazio
    //Adicionar construtor cheio
    //Adicionar getters e setters

    public Juridica() {
    }

    public Juridica(Integer idJuridica) {
        this.idJuridica = idJuridica;
    }

    public Juridica(Integer idJuridica, String nomePessoa) {
        super(nomePessoa);
        this.idJuridica = idJuridica;
    }

    
    
    public Juridica(Integer idJuridica, String cnpjJuridica, String representanteJuridica) {
        this.idJuridica = idJuridica;
        this.cnpjJuridica = cnpjJuridica;
        this.representanteJuridica = representanteJuridica;
    }

    public Juridica(Integer idJuridica, String cnpjJuridica, String representanteJuridica, Integer idPessoa, String nomePessoa, String emailPessoa, String tassiaPessoa, String senhaPessoa) {
        super(idPessoa, nomePessoa, emailPessoa, tassiaPessoa, senhaPessoa);
        this.idJuridica = idJuridica;
        this.cnpjJuridica = cnpjJuridica;
        this.representanteJuridica = representanteJuridica;
    }

   
    

    public Integer getIdJuridica() {
        return idJuridica;
    }

    public void setIdJuridica(Integer idJuridica) {
        this.idJuridica = idJuridica;
    }

    public String getCnpjJuridica() {
        return cnpjJuridica;
    }

    public void setCnpjJuridica(String cnpjJuridica) {
        this.cnpjJuridica = cnpjJuridica;
    }

    public String getRepresentanteJuridica() {
        return representanteJuridica;
    }

    public void setRepresentanteJuridica(String representanteJuridica) {
        this.representanteJuridica = representanteJuridica;
    }
    
    
    
    
}
