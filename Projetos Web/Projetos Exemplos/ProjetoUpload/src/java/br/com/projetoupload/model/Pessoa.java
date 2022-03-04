package br.com.projetoupload.model;
/**
 *
 * @author Douglas Costa
 */
public class Pessoa {
    
    //Declaração dos atributos
    protected int idPessoa;
    protected String nomePessoa;
    protected String telefonePessoa;
    protected String emailPessoa;
    protected String senhaPessoa;
    protected String nomeUsuario;
    
    
    //Declaração do construtor sem argumento
    public Pessoa() {
    }
    
    //Declaração do construtor com argumento

    public Pessoa(int idPessoa, String nomePessoa, String telefonePessoa, String emailPessoa, String senhaPessoa, String nomeUsuario) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
        this.senhaPessoa = senhaPessoa;
        this.nomeUsuario = nomeUsuario;
        
    }

    //Declaração dos GETS e SETS
    /**
     * @return the idPessoa
     */
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * @param idPessoa the idPessoa to set
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    /**
     * @return the nomePessoa
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    /**
     * @param nomePessoa the nomePessoa to set
     */
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    /**
     * @return the telefonePessoa
     */
    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    /**
     * @param telefonePessoa the telefonePessoa to set
     */
    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    /**
     * @return the emailPessoa
     */
    public String getEmailPessoa() {
        return emailPessoa;
    }

    /**
     * @param emailPessoa the emailPessoa to set
     */
    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    /**
     * @return the senhaPessoa
     */
    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    /**
     * @param senhaPessoa the senhaPessoa to set
     */
    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

   
    
    
}
