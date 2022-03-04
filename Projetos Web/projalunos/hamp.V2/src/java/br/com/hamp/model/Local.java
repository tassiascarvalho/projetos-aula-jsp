
package br.com.hamp.model;

/**
 *
 * @author Douglas Costa
 */
public class Local {
    private int idLocal;
    private String enderecoLocal;
    private String numeroLocal;
    private String bairroLocal;
    private String cidadeLocal;
    private String estadoLocal;
    private String paisLocal;
    private String cepLocal;

    public Local() {
    }

    public Local(int idLocal, String enderecoLocal, String numeroLocal, String bairroLocal, String cidadeLocal, String estadoLocal, String paisLocal, String cepLocal) {
        this.idLocal = idLocal;
        this.enderecoLocal = enderecoLocal;
        this.numeroLocal = numeroLocal;
        this.bairroLocal = bairroLocal;
        this.cidadeLocal = cidadeLocal;
        this.estadoLocal = estadoLocal;
        this.paisLocal = paisLocal;
        this.cepLocal = cepLocal;
    }

    /**
     * @return the idLocal
     */
    public int getIdLocal() {
        return idLocal;
    }

    /**
     * @param idLocal the idLocal to set
     */
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    /**
     * @return the enderecoLocal
     */
    public String getEnderecoLocal() {
        return enderecoLocal;
    }

    /**
     * @param enderecoLocal the enderecoLocal to set
     */
    public void setEnderecoLocal(String enderecoLocal) {
        this.enderecoLocal = enderecoLocal;
    }

    /**
     * @return the numeroLocal
     */
    public String getNumeroLocal() {
        return numeroLocal;
    }

    /**
     * @param numeroLocal the numeroLocal to set
     */
    public void setNumeroLocal(String numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    /**
     * @return the bairroLocal
     */
    public String getBairroLocal() {
        return bairroLocal;
    }

    /**
     * @param bairroLocal the bairroLocal to set
     */
    public void setBairroLocal(String bairroLocal) {
        this.bairroLocal = bairroLocal;
    }

    /**
     * @return the cidadeLocal
     */
    public String getCidadeLocal() {
        return cidadeLocal;
    }

    /**
     * @param cidadeLocal the cidadeLocal to set
     */
    public void setCidadeLocal(String cidadeLocal) {
        this.cidadeLocal = cidadeLocal;
    }

    /**
     * @return the estadoLocal
     */
    public String getEstadoLocal() {
        return estadoLocal;
    }

    /**
     * @param estadoLocal the estadoLocal to set
     */
    public void setEstadoLocal(String estadoLocal) {
        this.estadoLocal = estadoLocal;
    }

    /**
     * @return the paisLocal
     */
    public String getPaisLocal() {
        return paisLocal;
    }

    /**
     * @param paisLocal the paisLocal to set
     */
    public void setPaisLocal(String paisLocal) {
        this.paisLocal = paisLocal;
    }

    /**
     * @return the cepLocal
     */
    public String getCepLocal() {
        return cepLocal;
    }

    /**
     * @param cepLocal the cepLocal to set
     */
    public void setCepLocal(String cepLocal) {
        this.cepLocal = cepLocal;
    }
    
    
}
