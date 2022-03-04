package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Produto {
    
    private String codigo;
    private String descricao;
    private String marca;
    private String valor;
    private String vencimento; 
    
    
    
    
    
    
    
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @return the vencimento
     */
    public String getVencimento() {
        return vencimento;
    }
    
}
