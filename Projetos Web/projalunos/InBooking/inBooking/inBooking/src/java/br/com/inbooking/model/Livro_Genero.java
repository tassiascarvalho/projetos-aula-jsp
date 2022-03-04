package br.com.inbooking.model;
public class Livro_Genero {
    private Integer id_Genero;
    private Integer id_Livro;

    public Livro_Genero() {
    }

    public Livro_Genero(Integer id_Genero, Integer id_Livro) {
        this.id_Genero = id_Genero;
        this.id_Livro = id_Livro;
    }

    public Integer getId_Genero() {
        return id_Genero;
    }

    public void setId_Genero(Integer id_Genero) {
        this.id_Genero = id_Genero;
    }

    public Integer getId_Livro() {
        return id_Livro;
    }

    public void setId_Livro(Integer id_Livro) {
        this.id_Livro = id_Livro;
    }
}
