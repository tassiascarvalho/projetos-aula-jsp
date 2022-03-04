/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.model;

import java.util.Date;
/**
 *
 * @author Tassia
 */
public class Usuario {
    private Integer idUsuario;
    private String nomeUsuario;
    private Date dataNascimentoUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private String telefoneUsuario;
    private String generoUsuario;
    private String caminhofotoUsuario;
    private String sinteseUsuario;
    private String caminhocapaUsuario;
    private String tiposeguidorUsuario;
    
    //Criar construtor
    //Botão Direito >>> Inserir Código > Construtor
    //Criar um espaço na memoria vazio    
    public Usuario() {
    }
    
    //Criar um espaço com os atributos    
    public Usuario(Integer idUsuario, String nomeUsuario, Date dataNascimentoUsuario, String emailUsuario, String senhaUsuario, String telefoneUsuario, String generoUsuario, String caminhofotoUsuario, String sinteseUsuario, String caminhocapaUsuario, String tiposeguidorUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimentoUsuario = dataNascimentoUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.generoUsuario = generoUsuario;
        this.caminhofotoUsuario = caminhofotoUsuario;
        this.sinteseUsuario = sinteseUsuario;
        this.caminhocapaUsuario = caminhocapaUsuario;
        this.tiposeguidorUsuario = tiposeguidorUsuario;
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    //Encapsular os campos
    //Botão Direitor >>>Refatorar >>> Encapsular Campos >>Selecionar tudo

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @return the dataNascimentoUsuairio
     */
    public Date getDataNascimentoUsuario() {
        return dataNascimentoUsuario;
    }

    /**
     * @param dataNascimentoUsuario the dataNascimentoUsuario to set
     */
    public void setDataNascimentoUsuario(Date dataNascimentoUsuario) {
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    /**
     * @return the emailUsuario
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * @param emailUsuario the emailUsuario to set
     */
    public void setEmailUsuario(String emailUsuario) {
        //criptografia
        this.emailUsuario = emailUsuario;
    }

    /**
     * @return the senhaUsuario
     */
    public String getSenhaUsuario() {
        //descriptografia
        return senhaUsuario;
    }

    /**
     * @param senhaUsuario the senhaUsuario to set
     */
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    /**
     * @return the telefoneUsuario
     */
    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    /**
     * @param telefoneUsuario the telefoneUsuario to set
     */
    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    /**
     * @return the generoUsuario
     */
    public String getGeneroUsuario() {
        return generoUsuario;
    }

    /**
     * @param generoUsuario the generoUsuario to set
     */
    public void setGeneroUsuario(String generoUsuario) {
        this.generoUsuario = generoUsuario;
    }

    /**
     * @return the caminhofotoUsuario
     */
    public String getCaminhofotoUsuario() {
        return caminhofotoUsuario;
    }

    /**
     * @param caminhofotoUsuario the caminhofotoUsuario to set
     */
    public void setCaminhofotoUsuario(String caminhofotoUsuario) {
        this.caminhofotoUsuario = caminhofotoUsuario;
    }

    /**
     * @return the sinteseUsuario
     */
    public String getSinteseUsuario() {
        return sinteseUsuario;
    }

    /**
     * @param sinteseUsuario the sinteseUsuario to set
     */
    public void setSinteseUsuario(String sinteseUsuario) {
        this.sinteseUsuario = sinteseUsuario;
    }

    /**
     * @return the caminhocapaUsuario
     */
    public String getCaminhocapaUsuario() {
        return caminhocapaUsuario;
    }

    /**
     * @param caminhocapaUsuario the caminhocapaUsuario to set
     */
    public void setCaminhocapaUsuario(String caminhocapaUsuario) {
        this.caminhocapaUsuario = caminhocapaUsuario;
    }

    /**
     * @return the tiposeguidorUsuario
     */
    public String getTiposeguidorUsuario() {
        return tiposeguidorUsuario;
    }

    /**
     * @param tiposeguidorUsuario the tiposeguidorUsuario to set
     */
    public void setTiposeguidorUsuario(String tiposeguidorUsuario) {
        this.tiposeguidorUsuario = tiposeguidorUsuario;
    }
    
    

    
    

}
