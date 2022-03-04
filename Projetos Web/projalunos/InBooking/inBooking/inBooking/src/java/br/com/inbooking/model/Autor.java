package br.com.inbooking.model;
public class Autor {
    private Integer idAutor;
    private String pseudonimoAutor;
    private String nacionalidadeAutor;
    private String nomeAutor;
    private String sobrenomeAutor;

    public Autor() {
    }

    public Autor(Integer idAutor, String pseudonimoAutor, String nacionalidadeAutor, String nomeAutor, String sobrenomeAutor) {
        this.idAutor = idAutor;
        this.pseudonimoAutor = pseudonimoAutor;
        this.nacionalidadeAutor = nacionalidadeAutor;
        this.nomeAutor = nomeAutor;
        this.sobrenomeAutor = sobrenomeAutor;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getPseudonimoAutor() {
        return pseudonimoAutor;
    }

    public void setPseudonimoAutor(String pseudonimoAutor) {
        this.pseudonimoAutor = pseudonimoAutor;
    }

    public String getNacionalidadeAutor() {
        return nacionalidadeAutor;
    }

    public void setNacionalidadeAutor(String nacionalidadeAutor) {
        this.nacionalidadeAutor = nacionalidadeAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getSobrenomeAutor() {
        return sobrenomeAutor;
    }

    public void setSobrenomeAutor(String sobrenomeAutor) {
        this.sobrenomeAutor = sobrenomeAutor;
    }
}
