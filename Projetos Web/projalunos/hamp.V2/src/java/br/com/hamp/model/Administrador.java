
package br.com.hamp.model;

/**
 *
 * @author Douglas Costa
 */
public class Administrador {
    private int idAdm;
    private String nomeAdm;
    private String loginAdm;
    private String senhaAdm;

    public Administrador() {
    }

    public Administrador(int idAdm, String nomeAdm, String loginAdm, String senhaAdm) {
        this.idAdm = idAdm;
        this.nomeAdm = nomeAdm;
        this.loginAdm = loginAdm;
        this.senhaAdm = senhaAdm;
    }

    /**
     * @return the idAdm
     */
    public int getIdAdm() {
        return idAdm;
    }

    /**
     * @param idAdm the idAdm to set
     */
    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    /**
     * @return the nomeAdm
     */
    public String getNomeAdm() {
        return nomeAdm;
    }

    /**
     * @param nomeAdm the nomeAdm to set
     */
    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    /**
     * @return the loginAdm
     */
    public String getLoginAdm() {
        return loginAdm;
    }

    /**
     * @param loginAdm the loginAdm to set
     */
    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    /**
     * @return the senhaAdm
     */
    public String getSenhaAdm() {
        return senhaAdm;
    }

    /**
     * @param senhaAdm the senhaAdm to set
     */
    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }
    
    
}
