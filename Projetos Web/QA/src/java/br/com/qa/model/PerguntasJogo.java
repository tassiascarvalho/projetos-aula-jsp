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
public class PerguntasJogo {
    private Integer idPerguntasJogo;
    private Jogo jogo;
    private Pergunta pergunta;

    public PerguntasJogo() {
    }

    public PerguntasJogo(Integer idPerguntasJogo, Jogo jogo, Pergunta pergunta) {
        this.idPerguntasJogo = idPerguntasJogo;
        this.jogo = jogo;
        this.pergunta = pergunta;
    }

    /**
     * @return the idPerguntasJogo
     */
    public Integer getIdPerguntasJogo() {
        return idPerguntasJogo;
    }

    /**
     * @param idPerguntasJogo the idPerguntasJogo to set
     */
    public void setIdPerguntasJogo(Integer idPerguntasJogo) {
        this.idPerguntasJogo = idPerguntasJogo;
    }

    /**
     * @return the jogo
     */
    public Jogo getJogo() {
        return jogo;
    }

    /**
     * @param jogo the jogo to set
     */
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    /**
     * @return the pergunta
     */
    public Pergunta getPergunta() {
        return pergunta;
    }

    /**
     * @param pergunta the pergunta to set
     */
    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
    
    
    
}
