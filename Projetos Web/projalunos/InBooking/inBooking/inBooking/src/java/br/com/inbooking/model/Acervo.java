package br.com.inbooking.model;
public class Acervo {
    private Integer idAcervo;
    private Integer id_Livro;
    private Integer quantidadeAcervo;
    private Integer disponibilidadeAcervo;
    private String statusLivro;

    public Acervo() {
    }

    public Acervo(Integer idAcervo, Integer id_Livro, Integer quantidadeAcervo, Integer disponibilidadeAcervo, String statusLivro) {
        this.idAcervo = idAcervo;
        this.id_Livro = id_Livro;
        this.quantidadeAcervo = quantidadeAcervo;
        this.disponibilidadeAcervo = disponibilidadeAcervo;
        this.statusLivro = statusLivro;
    }

    /**
     * @return the idAcervo
     */
    public Integer getIdAcervo() {
        return idAcervo;
    }

    /**
     * @param idAcervo the idAcervo to set
     */
    public void setIdAcervo(Integer idAcervo) {
        this.idAcervo = idAcervo;
    }

    /**
     * @return the id_Livro
     */
    public Integer getId_Livro() {
        return id_Livro;
    }

    /**
     * @param id_Livro the id_Livro to set
     */
    public void setId_Livro(Integer id_Livro) {
        this.id_Livro = id_Livro;
    }

    /**
     * @return the quantidadeAcervo
     */
    public Integer getQuantidadeAcervo() {
        return quantidadeAcervo;
    }

    /**
     * @param quantidadeAcervo the quantidadeAcervo to set
     */
    public void setQuantidadeAcervo(Integer quantidadeAcervo) {
        this.quantidadeAcervo = quantidadeAcervo;
    }

    /**
     * @return the disponibilidadeAcervo
     */
    public Integer getDisponibilidadeAcervo() {
        return disponibilidadeAcervo;
    }

    /**
     * @param disponibilidadeAcervo the disponibilidadeAcervo to set
     */
    public void setDisponibilidadeAcervo(Integer disponibilidadeAcervo) {
        this.disponibilidadeAcervo = disponibilidadeAcervo;
    }

    /**
     * @return the statusLivro
     */
    public String getStatusLivro() {
        return statusLivro;
    }

    /**
     * @param statusLivro the statusLivro to set
     */
    public void setStatusLivro(String statusLivro) {
        this.statusLivro = statusLivro;
    }
}
