package br.com.inbooking.model;
public class Livro_Autor {
    private Integer id_Autor;
    private Integer id_Livro;

    public Livro_Autor() {
    }

    public Livro_Autor(Integer id_Autor, Integer id_Livro) {
        this.id_Autor = id_Autor;
        this.id_Livro = id_Livro;
    }

    public Integer getId_Autor() {
        return id_Autor;
    }

    public void setId_Autor(Integer id_Autor) {
        this.id_Autor = id_Autor;
    }

    public Integer getId_Livro() {
        return id_Livro;
    }

    public void setId_Livro(Integer id_Livro) {
        this.id_Livro = id_Livro;
    }
}
