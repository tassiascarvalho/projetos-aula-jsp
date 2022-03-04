/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.model;

/**
 *
 * @author Tassia
 */
public class Jogo {
    private Integer idJogo;
    private Integer qtdAcertos;
    private Integer qtdErros;
    private Pessoa pessoa;

    public Jogo() {
    }

    public Jogo(Integer idJogo, Integer qtdAcertos, Integer qtdErros, Pessoa pessoa) {
        this.idJogo = idJogo;
        this.qtdAcertos = qtdAcertos;
        this.qtdErros = qtdErros;
        this.pessoa = pessoa;
    }

    /**
     * @return the idJogo
     */
    public Integer getIdJogo() {
        return idJogo;
    }

    /**
     * @param idJogo the idJogo to set
     */
    public void setIdJogo(Integer idJogo) {
        this.idJogo = idJogo;
    }

    /**
     * @return the qtdAcertos
     */
    public Integer getQtdAcertos() {
        return qtdAcertos;
    }

    /**
     * @param qtdAcertos the qtdAcertos to set
     */
    public void setQtdAcertos(Integer qtdAcertos) {
        this.qtdAcertos = qtdAcertos;
    }

    /**
     * @return the qtdErros
     */
    public Integer getQtdErros() {
        return qtdErros;
    }

    /**
     * @param qtdErros the qtdErros to set
     */
    public void setQtdErros(Integer qtdErros) {
        this.qtdErros = qtdErros;
    }

    /**
     * @return the usuario
     */
    public Pessoa getUsuario() {
        return pessoa;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
