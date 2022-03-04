/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupa.model;

/**
 *
 * @author Tassia
 */
public class Sala {

    private Integer idSala;
    private Integer numeroSala;

    public Sala() {
    }

    public Sala(Integer idSala, Integer numeroSala) {
        this.idSala = idSala;
        this.numeroSala = numeroSala;
    }

    /**
     * @return the idSala
     */
    public Integer getIdSala() {
        return idSala;
    }

    /**
     * @param idSala the idSala to set
     */
    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    /**
     * @return the numeroSala
     */
    public Integer getNumeroSala() {
        return numeroSala;
    }

    /**
     * @param numeroSala the numeroSala to set
     */
    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

}
