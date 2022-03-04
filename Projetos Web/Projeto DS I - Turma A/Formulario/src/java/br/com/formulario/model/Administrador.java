/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.formulario.model;

/**
 *
 * @author Tassia
 */
public class Administrador {
    //Declaração dos atribuitos
    private Integer idAdministrador;
    private String nomeAdministrador;
    private String usuarioAdministrador;
    private String senhaAdministrador;

    public Administrador() {
    }

    public Administrador(Integer idAdministrador, String nomeAdministrador, String usuarioAdministrador, String senhaAdministrador) {
        this.idAdministrador = idAdministrador;
        this.nomeAdministrador = nomeAdministrador;
        this.usuarioAdministrador = usuarioAdministrador;
        this.senhaAdministrador = senhaAdministrador;
    }

    /**
     * @return the idAdministrador
     */
    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    /**
     * @param idAdministrador the idAdministrador to set
     */
    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    /**
     * @return the nomeAdministrador
     */
    public String getNomeAdministrador() {
        return nomeAdministrador;
    }

    /**
     * @param nomeAdministrador the nomeAdministrador to set
     */
    public void setNomeAdministrador(String nomeAdministrador) {
        this.nomeAdministrador = nomeAdministrador;
    }

    /**
     * @return the usuarioAdministrador
     */
    public String getUsuarioAdministrador() {
        return usuarioAdministrador;
    }

    /**
     * @param usuarioAdministrador the usuarioAdministrador to set
     */
    public void setUsuarioAdministrador(String usuarioAdministrador) {
        this.usuarioAdministrador = usuarioAdministrador;
    }

    /**
     * @return the senhaAdministrador
     */
    public String getSenhaAdministrador() {
        return senhaAdministrador;
    }

    /**
     * @param senhaAdministrador the senhaAdministrador to set
     */
    public void setSenhaAdministrador(String senhaAdministrador) {
        this.senhaAdministrador = senhaAdministrador;
    }    
    
}
