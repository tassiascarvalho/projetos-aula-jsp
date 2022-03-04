
package br.com.hamp.model;

/**
 *
 * @author Douglas
 */
public class Mensagem {
    
    private int idEmissor;
    private int idReceptor;
    private String mensagem;

    public Mensagem() {
    }

    public Mensagem(int idEmissor, int idReceptor, String mensagem) {
        this.idEmissor = idEmissor;
        this.idReceptor = idReceptor;
        this.mensagem = mensagem;
    }

    /**
     * @return the idEmissor
     */
    public int getIdEmissor() {
        return idEmissor;
    }

    /**
     * @param idEmissor the idEmissor to set
     */
    public void setIdEmissor(int idEmissor) {
        this.idEmissor = idEmissor;
    }

    /**
     * @return the idReceptor
     */
    public int getIdReceptor() {
        return idReceptor;
    }

    /**
     * @param idReceptor the idReceptor to set
     */
    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
    
}
