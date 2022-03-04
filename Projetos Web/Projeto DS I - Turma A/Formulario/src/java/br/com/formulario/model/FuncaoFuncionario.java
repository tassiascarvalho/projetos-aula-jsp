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
public class FuncaoFuncionario {
    private Integer idFuncaoFuncionario;    
    private String nomeFuncaoFuncionario;
    private String descricaoFuncaoFuncionario;
    private Double baseSalarialFuncaoFuncionario;

    public FuncaoFuncionario() {
    }
      
    public FuncaoFuncionario(Integer idFuncaoFuncionario, String nomeFuncaoFuncionario, String descricaoFuncaoFuncionario, Double baseSalarialFuncaoFuncionario) {
        this.idFuncaoFuncionario = idFuncaoFuncionario;
        this.nomeFuncaoFuncionario = nomeFuncaoFuncionario;
        this.descricaoFuncaoFuncionario = descricaoFuncaoFuncionario;
        this.baseSalarialFuncaoFuncionario = baseSalarialFuncaoFuncionario;
    }

    /**
     * @return the idFuncaoFuncionario
     */
    public Integer getIdFuncaoFuncionario() {
        return idFuncaoFuncionario;
    }

    /**
     * @param idFuncaoFuncionario the idFuncaoFuncionario to set
     */
    public void setIdFuncaoFuncionario(Integer idFuncaoFuncionario) {
        this.idFuncaoFuncionario = idFuncaoFuncionario;
    }

    /**
     * @return the nomeFuncaoFuncionario
     */
    public String getNomeFuncaoFuncionario() {
        return nomeFuncaoFuncionario;
    }

    /**
     * @param nomeFuncaoFuncionario the nomeFuncaoFuncionario to set
     */
    public void setNomeFuncaoFuncionario(String nomeFuncaoFuncionario) {
        this.nomeFuncaoFuncionario = nomeFuncaoFuncionario;
    }

    /**
     * @return the descricaoFuncaoFuncionario
     */
    public String getDescricaoFuncaoFuncionario() {
        return descricaoFuncaoFuncionario;
    }

    /**
     * @param descricaoFuncaoFuncionario the descricaoFuncaoFuncionario to set
     */
    public void setDescricaoFuncaoFuncionario(String descricaoFuncaoFuncionario) {
        this.descricaoFuncaoFuncionario = descricaoFuncaoFuncionario;
    }

    /**
     * @return the baseSalarialFuncaoFuncionario
     */
    public Double getBaseSalarialFuncaoFuncionario() {
        return baseSalarialFuncaoFuncionario;
    }

    /**
     * @param baseSalarialFuncaoFuncionario the baseSalarialFuncaoFuncionario to set
     */
    public void setBaseSalarialFuncaoFuncionario(Double baseSalarialFuncaoFuncionario) {
        this.baseSalarialFuncaoFuncionario = baseSalarialFuncaoFuncionario;
    }
    
    
    
    
    
    
    
}

