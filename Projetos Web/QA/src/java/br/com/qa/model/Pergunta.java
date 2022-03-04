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
public class Pergunta {
    private Integer idPergunta;
    private String descricaoPergunta;
    //Aconteceu uma associação com a classe de dependencia
    private Categoria categoria;

    public Pergunta() {
    }

    public Pergunta(Integer idPergunta, String descricaoPergunta, Categoria categoria) {
        this.idPergunta = idPergunta;
        this.descricaoPergunta = descricaoPergunta;
        this.categoria = categoria;
    }

    /**
     * @return the idPergunta
     */
    public Integer getIdPergunta() {
        return idPergunta;
    }

    /**
     * @param idPergunta the idPergunta to set
     */
    public void setIdPergunta(Integer idPergunta) {
        this.idPergunta = idPergunta;
    }

    /**
     * @return the descricaoPergunta
     */
    public String getDescricaoPergunta() {
        return descricaoPergunta;
    }

    /**
     * @param descricaoPergunta the descricaoPergunta to set
     */
    public void setDescricaoPergunta(String descricaoPergunta) {
        this.descricaoPergunta = descricaoPergunta;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    

}
