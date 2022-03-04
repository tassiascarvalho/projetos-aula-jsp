package br.com.qa.model;

public class Filme {
 
    private Integer idFilme;
    private String nomeFilme;
    private Integer duracaoFilme;
    private String sinopseFilme;
    private String classificacaoFilme;
    private Genero genero;
    private Categoria categoria;

    public Filme(Integer idFilme, String nomeFilme, Integer duracaoFilme, String sinopseFilme, String classificacaoFilme, Genero genero, Categoria categoria) {
        this.idFilme = idFilme;
        this.nomeFilme = nomeFilme;
        this.duracaoFilme = duracaoFilme;
        this.sinopseFilme = sinopseFilme;
        this.classificacaoFilme = classificacaoFilme;
        this.genero = genero;
        this.categoria = categoria;
    }

    public Filme() {
    }

    /**
     * @return the idFilme
     */
    public Integer getIdFilme() {
        return idFilme;
    }

    /**
     * @param idFilme the idFilme to set
     */
    public void setIdFilme(Integer idFilme) {
        this.idFilme = idFilme;
    }

    /**
     * @return the nomeFilme
     */
    public String getNomeFilme() {
        return nomeFilme;
    }

    /**
     * @param nomeFilme the nomeFilme to set
     */
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    /**
     * @return the duracaoFilme
     */
    public Integer getDuracaoFilme() {
        return duracaoFilme;
    }

    /**
     * @param duracaoFilme the duracaoFilme to set
     */
    public void setDuracaoFilme(Integer duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    /**
     * @return the sinopseFilme
     */
    public String getSinopseFilme() {
        return sinopseFilme;
    }

    /**
     * @param sinopseFilme the sinopseFilme to set
     */
    public void setSinopseFilme(String sinopseFilme) {
        this.sinopseFilme = sinopseFilme;
    }

    /**
     * @return the classificacaoFilme
     */
    public String getClassificacaoFilme() {
        return classificacaoFilme;
    }

    /**
     * @param classificacaoFilme the classificacaoFilme to set
     */
    public void setClassificacaoFilme(String classificacaoFilme) {
        this.classificacaoFilme = classificacaoFilme;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
}
