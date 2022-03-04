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
public class Funcionario {
    private String nomeFuncionario;
    private String cpfFuncionario;
    private Integer idadeFuncionario;
    private String funcaoFuncionario;

    public Funcionario() {
    }

    public Funcionario(String nomeFuncionario, String cpfFuncionario, Integer idadeFuncionario, String funcaoFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.idadeFuncionario = idadeFuncionario;
        this.funcaoFuncionario = funcaoFuncionario;
    }

    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the cpfFuncionario
     */
    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    /**
     * @param cpfFuncionario the cpfFuncionario to set
     */
    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
    


    /**
     * @return the idadeFuncionario
     */
    public Integer getIdadeFuncionario() {
        return idadeFuncionario;
    }

    /**
     * @param idadeFuncionario the idadeFuncionario to set
     */
    public void setIdadeFuncionario(Integer idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    /**
     * @return the funcaoFuncionario
     */
    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    /**
     * @param funcaoFuncionario the funcaoFuncionario to set
     */
    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }

    
    
    
    
    
}
