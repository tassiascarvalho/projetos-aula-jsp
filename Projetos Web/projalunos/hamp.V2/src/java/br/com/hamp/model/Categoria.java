package br.com.hamp.model;

/**
 *
 * @author Douglas Costa
 */
public class Categoria {
    
    //Declaração dos atributos
    private int idCategoria;
    private String nomeCategoria;
    private String descricaoCategoria;
    
    //Declaração do construtor sem argumento
    public Categoria() {
    }
    
    //Declaração do construtor com argumentos
    public Categoria(int idCategoria, String nomeCategoria, String descricaoCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.descricaoCategoria = descricaoCategoria;
    }
    
    //Declaração dos GETS  e SETS

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the nomeCategoria
     */
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    /**
     * @param nomeCategoria the nomeCategoria to set
     */
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    /**
     * @return the descricaoCategoria
     */
    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    /**
     * @param descricaoCategoria the descricaoCategoria to set
     */
    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
    
}
