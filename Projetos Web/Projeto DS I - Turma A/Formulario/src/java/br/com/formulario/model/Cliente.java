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
public class Cliente {

    private String nomeCliente;
    private String rgCliente;
    private String cpfCliente;
    private String cidadeCliente;
    private String generoCliente;

    public Cliente(String nomeCliente, String rgCliente, String cpfCliente, String cidadeCliente, String generoCliente) {
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.cpfCliente = cpfCliente;
        this.cidadeCliente = cidadeCliente;
        this.generoCliente = generoCliente;
    }

    public Cliente() {
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the rgCliente
     */
    public String getRgCliente() {
        return rgCliente;
    }

    /**
     * @param rgCliente the rgCliente to set
     */
    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    /**
     * @return the cpfCliente
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * @param cpfCliente the cpfCliente to set
     */
    public void setCpfCliente(String cpfCliente) {
        if(cpfCliente != null)        
            this.cpfCliente = cpfCliente;
        else
            System.out.println("CPF Obrigatório");
    }

    /**
     * @return the cidadeCliente
     */
    public String getCidadeCliente() {
        return cidadeCliente;
    }

    /**
     * @param cidadeCliente the cidadeCliente to set
     */
    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    /**
     * @return the generoCliente
     */
    public String getGeneroCliente() {
        return generoCliente;
    }

    /**
     * @param generoCliente the generoCliente to set
     */
    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }
    
    

    

    
}
