package br.com.inbooking.model;
public class Editora {
    private Integer idEditora;
    private String nomeEditora;

    public Editora() {
    }

    public Editora(Integer idEditora, String nomeEditora) {
        this.idEditora = idEditora;
        this.nomeEditora = nomeEditora;
    }

    public Integer getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Integer idEditora) {
        this.idEditora = idEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
}
