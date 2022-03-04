/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.model;

/**
 *
 * @author Aluno
 */
public class Administrador {
    private Integer idAdministrador;
    private String nomeAdministrador;
    private String cpfAdministrador;
    private String loginAdministrador;
    private String senhaAdministrador;

    public Administrador() {
    }

    public Administrador(Integer idAdministrador, String nomeAdministrador, String cpfAdministrador, String loginAdministrador, String senhaAdministrador) {
        this.idAdministrador = idAdministrador;
        this.nomeAdministrador = nomeAdministrador;
        this.cpfAdministrador = cpfAdministrador;
        this.loginAdministrador = loginAdministrador;
        this.senhaAdministrador = senhaAdministrador;
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNomeAdministrador() {
        return nomeAdministrador;
    }

    public void setNomeAdministrador(String nomeAdministrador) {
        this.nomeAdministrador = nomeAdministrador;
    }

    public String getCpfAdministrador() {
        return cpfAdministrador;
    }

    public void setCpfAdministrador(String cpfAdministrador) {
        this.cpfAdministrador = cpfAdministrador;
    }

    public String getLoginAdministrador() {
        return loginAdministrador;
    }

    public void setLoginAdministrador(String loginAdministrador) {
        this.loginAdministrador = loginAdministrador;
    }

    public String getSenhaAdministrador() {
        return senhaAdministrador;
    }

    public void setSenhaAdministrador(String senhaAdministrador) {
        this.senhaAdministrador = senhaAdministrador;
    }
}
