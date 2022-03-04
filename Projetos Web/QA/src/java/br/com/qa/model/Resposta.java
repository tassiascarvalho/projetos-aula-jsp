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
public class Resposta {
        private Integer idResposta;
        private String descricaoResposta;
        private Pergunta pergunta;

    public Resposta() {
    }

    public Resposta(Integer idResposta, String descricaoResposta, Pergunta pergunta) {
        this.idResposta = idResposta;
        this.descricaoResposta = descricaoResposta;
        this.pergunta = pergunta;
    }

    /**
     * @return the idResposta
     */
    public Integer getIdResposta() {
        return idResposta;
    }

    /**
     * @param idResposta the idResposta to set
     */
    public void setIdResposta(Integer idResposta) {
        this.idResposta = idResposta;
    }

    /**
     * @return the descricaoResposta
     */
    public String getDescricaoResposta() {
        return descricaoResposta;
    }

    /**
     * @param descricaoResposta the descricaoResposta to set
     */
    public void setDescricaoResposta(String descricaoResposta) {
        this.descricaoResposta = descricaoResposta;
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
