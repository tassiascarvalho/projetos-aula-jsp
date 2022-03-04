package br.com.hamp.model;

import java.util.Date;

/**
 *
 * @author Douglas Costa
 */
public class Produto {

    //Declaração dos atributos
    private int idProduto;
    private int idPessoaF;
    private int idPessoaJ;
    private String nomeProduto;
    private String descricaoProduto;
    private String tamanhoProduto;
    private String linkProduto;
    private String corProduto;
    private String referenciaProduto;
    private String pesoProduto;
    private Double valorLocacaoDia;
    private Integer quantidadeProduto;
    private String disponibilidade;
    private String imagemProduto;
    private Date periodoLocacaoProduto;
    private String categoriaProduto;
    private int idProdutoList;

    //Declaração do construtor sem argumentos
    public Produto() {
    }

    public Produto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    //Declaração do construtor com argumentos 

    public Produto(int idProduto, int idPessoaF, int idPessoaJ, String nomeProduto, String descricaoProduto, String tamanhoProduto, String linkProduto, String corProduto, String referenciaProduto, String pesoProduto, Double valorLocacaoDia, Integer quantidadeProduto, String disponibilidade, String imagemProduto, Date periodoLocacaoProduto, String categoriaProduto, int idProdutoList) {
        this.idProduto = idProduto;
        this.idPessoaF = idPessoaF;
        this.idPessoaJ = idPessoaJ;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.tamanhoProduto = tamanhoProduto;
        this.linkProduto = linkProduto;
        this.corProduto = corProduto;
        this.referenciaProduto = referenciaProduto;
        this.pesoProduto = pesoProduto;
        this.valorLocacaoDia = valorLocacaoDia;
        this.quantidadeProduto = quantidadeProduto;
        this.disponibilidade = disponibilidade;
        this.imagemProduto = imagemProduto;
        this.periodoLocacaoProduto = periodoLocacaoProduto;
        this.categoriaProduto = categoriaProduto;
        this.idProdutoList = idProdutoList;
    }

    //Declaração dos GETS e SETS
    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * @return the tamanhoProduto
     */
    public String getTamanhoProduto() {
        return tamanhoProduto;
    }

    /**
     * @param tamanhoProduto the tamanhoProduto to set
     */
    public void setTamanhoProduto(String tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }

    /**
     * @return the linkProduto
     */
    public String getLinkProduto() {
        return linkProduto;
    }

    /**
     * @param linkProduto the linkProduto to set
     */
    public void setLinkProduto(String linkProduto) {
        this.linkProduto = linkProduto;
    }

    /**
     * @return the corProduto
     */
    public String getCorProduto() {
        return corProduto;
    }

    /**
     * @param corProduto the corProduto to set
     */
    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    /**
     * @return the referenciaProduto
     */
    public String getReferenciaProduto() {
        return referenciaProduto;
    }

    /**
     * @param referenciaProduto the referenciaProduto to set
     */
    public void setReferenciaProduto(String referenciaProduto) {
        this.referenciaProduto = referenciaProduto;
    }

    /**
     * @return the pesoProduto
     */
    public String getPesoProduto() {
        return pesoProduto;
    }

    /**
     * @param pesoProduto the pesoProduto to set
     */
    public void setPesoProduto(String pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    /**
     * @return the valorLocacaoDia
     */
    public Double getValorLocacaoDia() {
        return valorLocacaoDia;
    }

    /**
     * @param valorLocacaoDia the valorLocacaoDia to set
     */
    public void setValorLocacaoDia(Double valorLocacaoDia) {
        this.valorLocacaoDia = valorLocacaoDia;
    }

    /**
     * @return the quantidadeProduto
     */
    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * @param quantidadeProduto the quantidadeProduto to set
     */
    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    /**
     * @return the periodoLocacaoProduto
     */
    public Date getPeriodoLocacaoProduto() {
        return periodoLocacaoProduto;
    }

    /**
     * @param periodoLocacaoProduto the periodoLocacaoProduto to set
     */
    public void setPeriodoLocacaoProduto(Date periodoLocacaoProduto) {
        this.periodoLocacaoProduto = periodoLocacaoProduto;
    }

    /**
     * @return the categoriaProduto
     */
    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    /**
     * @param categoriaProduto the categoriaProduto to set
     */
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    /**
     * @return the idPessoaF
     */
    public int getIdPessoaF() {
        return idPessoaF;
    }

    /**
     * @param idPessoaF the idPessoaF to set
     */
    public void setIdPessoaF(int idPessoaF) {
        this.idPessoaF = idPessoaF;
    }

    /**
     * @return the idPessoaJ
     */
    public int getIdPessoaJ() {
        return idPessoaJ;
    }

    /**
     * @param idPessoaJ the idPessoaJ to set
     */
    public void setIdPessoaJ(int idPessoaJ) {
        this.idPessoaJ = idPessoaJ;
    }

    /**
     * @return the disponibilidade
     */
    public String getDisponibilidade() {
        return disponibilidade;
    }

    /**
     * @param disponibilidade the disponibilidade to set
     */
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    /**
     * @return the imagemProduto
     */
    public String getImagemProduto() {
        return imagemProduto;
    }

    /**
     * @param imagemProduto the imagemProduto to set
     */
    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    /**
     * @return the idProdutoList
     */
    public int getIdProdutoList() {
        return idProdutoList;
    }

    /**
     * @param idProdutoList the idProdutoList to set
     */
    public void setIdProdutoList(int idProdutoList) {
        this.idProdutoList = idProdutoList;
    }

}
