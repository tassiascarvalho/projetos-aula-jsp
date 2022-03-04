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
public class Animal {
    private Integer idAnimal;
    private String nomeAnimal;
    private Date dataNascimentoAnimal;
    private Double pesoAnimal;
    private Especie especie;

    public Animal() {
    }
    
    /*Criar nessa ordem:
    Model,
    DAOImpl,
    View,
    Servlet,
    e o CRUD um por um,
    Create,
    Retrieve,
    Update,
    Delete*/

    public Animal(Integer idAnimal, String nomeAnimal, Date dataNascimentoAnimal, Double pesoAnimal, Integer idEspecie, Especie especie) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.dataNascimentoAnimal = dataNascimentoAnimal;
        this.pesoAnimal = pesoAnimal;
        this.especie = especie;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public Date getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }

    public void setDataNascimentoAnimal(Date dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }

    public Double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(Double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
