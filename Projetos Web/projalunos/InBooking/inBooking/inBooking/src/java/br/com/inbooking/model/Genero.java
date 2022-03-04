package br.com.inbooking.model;
public class Genero {
    private Integer idGenero;
    private String descricaoGenero;

    public Genero() {
    }

    public Genero(Integer idGenero, String descricaoGenero) {
        this.idGenero = idGenero;
        this.descricaoGenero = descricaoGenero;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getDescricaoGenero() {
        return descricaoGenero;
    }

    public void setDescricaoGenero(String descricaoGenero) {
        this.descricaoGenero = descricaoGenero;
    }
}
