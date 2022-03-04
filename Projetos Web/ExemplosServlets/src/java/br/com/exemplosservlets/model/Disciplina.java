/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exemplosservlets.model;

/**
 *
 * @author Tassia
 */
public class Disciplina {

    private Integer idDisciplina;
    private String nomeDisciplina;
    private String descricaoDisciplina;
    private String ementaDisciplina;

    //Construtor cheio
    public Disciplina(Integer idDisciplina, String nomeDisciplina, String descricaoDisciplina, String ementaDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.descricaoDisciplina = descricaoDisciplina;
        this.ementaDisciplina = ementaDisciplina;
    }

    //Construtor   
    public Disciplina() {
    }

    /**
     * @return the idDisciplina
     */
    public Integer getidDisciplina() {
        return idDisciplina;
    }

    /**
     * @param idDisciplina the idDisciplina to set
     */
    public void setidDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getnomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setnomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the descricaoDisciplina
     */
    public String getdescricaoDisciplina() {
        return descricaoDisciplina;
    }

    /**
     * @param descricaoDisciplina the descricaoDisciplina to set
     */
    public void setdescricaoDisciplina(String descricaoDisciplina) {
        this.descricaoDisciplina = descricaoDisciplina;
    }

    /**
     * @return the ementaDisciplina
     */
    public String getementaDisciplina() {
        return ementaDisciplina;
    }

    /**
     * @param ementaDisciplina the ementaDisciplina to set
     */
    public void setementaDisciplina(String ementaDisciplina) {
        this.ementaDisciplina = ementaDisciplina;
    }

}
