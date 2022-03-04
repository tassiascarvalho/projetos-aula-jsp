package br.com.inbooking.model;
public class Livro {
     private Integer idLivro;
     private Integer id_Editora;
     private Integer capitulosLivro;
     private Integer paginasLivro;
     private Integer anoEdicaoLivro; 
     private Integer idiomaEdicaoLivro;
     private Integer numeroEdicaoLivro;
     private String tituloLivro;
     private String isbnLivro;
     private String anoPublicacaoLivro;
     private String idiomaLivro;
     private String urlCapaLivro;
     private String sinopseLivro;

    public Livro() {
    }

    public Livro(Integer idLivro, Integer id_Editora, Integer capitulosLivro, Integer paginasLivro, Integer anoEdicaoLivro, Integer idiomaEdicaoLivro, Integer numeroEdicaoLivro, String tituloLivro, String isbnLivro, String anoPublicacaoLivro, String idiomaLivro, String urlCapaLivro, String sinopseLivro) {
        this.idLivro = idLivro;
        this.id_Editora = id_Editora;
        this.capitulosLivro = capitulosLivro;
        this.paginasLivro = paginasLivro;
        this.anoEdicaoLivro = anoEdicaoLivro;
        this.idiomaEdicaoLivro = idiomaEdicaoLivro;
        this.numeroEdicaoLivro = numeroEdicaoLivro;
        this.tituloLivro = tituloLivro;
        this.isbnLivro = isbnLivro;
        this.anoPublicacaoLivro = anoPublicacaoLivro;
        this.idiomaLivro = idiomaLivro;
        this.urlCapaLivro = urlCapaLivro;
        this.sinopseLivro = sinopseLivro;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public Integer getId_Editora() {
        return id_Editora;
    }

    public void setId_Editora(Integer id_Editora) {
        this.id_Editora = id_Editora;
    }

    public Integer getCapitulosLivro() {
        return capitulosLivro;
    }

    public void setCapitulosLivro(Integer capitulosLivro) {
        this.capitulosLivro = capitulosLivro;
    }

    public Integer getPaginasLivro() {
        return paginasLivro;
    }

    public void setPaginasLivro(Integer paginasLivro) {
        this.paginasLivro = paginasLivro;
    }

    public Integer getAnoEdicaoLivro() {
        return anoEdicaoLivro;
    }

    public void setAnoEdicaoLivro(Integer anoEdicaoLivro) {
        this.anoEdicaoLivro = anoEdicaoLivro;
    }

    public Integer getIdiomaEdicaoLivro() {
        return idiomaEdicaoLivro;
    }

    public void setIdiomaEdicaoLivro(Integer idiomaEdicaoLivro) {
        this.idiomaEdicaoLivro = idiomaEdicaoLivro;
    }

    public Integer getNumeroEdicaoLivro() {
        return numeroEdicaoLivro;
    }

    public void setNumeroEdicaoLivro(Integer numeroEdicaoLivro) {
        this.numeroEdicaoLivro = numeroEdicaoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(String isbnLivro) {
        this.isbnLivro = isbnLivro;
    }

    public String getAnoPublicacaoLivro() {
        return anoPublicacaoLivro;
    }

    public void setAnoPublicacaoLivro(String anoPublicacaoLivro) {
        this.anoPublicacaoLivro = anoPublicacaoLivro;
    }

    public String getIdiomaLivro() {
        return idiomaLivro;
    }

    public void setIdiomaLivro(String idiomaLivro) {
        this.idiomaLivro = idiomaLivro;
    }

    public String getUrlCapaLivro() {
        return urlCapaLivro;
    }

    public void setUrlCapaLivro(String urlCapaLivro) {
        this.urlCapaLivro = urlCapaLivro;
    }

    public String getSinopseLivro() {
        return sinopseLivro;
    }

    public void setSinopseLivro(String sinopseLivro) {
        this.sinopseLivro = sinopseLivro;
    }
}
