package br.com.hamp.model;

import java.util.Date;

/**
 *
 * @author Douglas Costa
 */
public class Pedido {

    private Produto produto;
    private FormaPagamento formaPagamento;
    private int idPessoFisica;
    private int idpessoaJuridica;
    private int idPedido;
    
    private String valorLocacao;
    private Date dataLimite;
    private Date dataInicio;
    private String totalDias;
    private String situacaoPedido;
    //Endereco
    private String enderecoLocal;
    private String numeroLocal;
    private String bairroLocal;
    private String cidadeLocal;
    private String estadoLocal;
    private String paisLocal;
    private String cepLocal;
    //PesoaFisica
    private String nomePessoaFisica;
    private String telefonePessoaFisica;
    private String cpf;
    private String emailPessoaFisica;
    //PessoaJuridica
    private String nomePessoaJuridica;
    private String razaoSocial;
    private String emailPessoaJuridica;
    private String telefonePessoaJuridica;
    private String cnpj;
    //Produto
    private String nomeProduto;
    private String imagemProduto;
    private String categoriaPoduto;
    private String tamanhoProduto;
    private String pesoProduto;
    private String corPredominante;

    public Pedido() {
    }

    public Pedido(Produto produto,int idPedido, FormaPagamento formaPagamento, int idPessoFisica, int idpessoaJuridica, String valorLocacao, Date dataLimite, Date dataInicio, String totalDias, String situacaoPedido, String enderecoLocal, String numeroLocal, String bairroLocal, String cidadeLocal, String estadoLocal, String paisLocal, String cepLocal, String nomePessoaFisica, String telefonePessoaFisica, String cpf, String emailPessoaFisica, String nomePessoaJuridica, String razaoSocial, String emailPessoaJuridica, String telefonePessoaJuridica, String cnpj, String nomeProduto, String imagemProduto, String categoriaPoduto, String tamanhoProduto, String pesoProduto, String corPredominante) {
        this.produto = produto;
        this.formaPagamento = formaPagamento;
        this.idPessoFisica = idPessoFisica;
        this.idpessoaJuridica = idpessoaJuridica;
        this.valorLocacao = valorLocacao;
        this.dataLimite = dataLimite;
        this.dataInicio = dataInicio;
        this.totalDias = totalDias;
        this.situacaoPedido = situacaoPedido;
        this.enderecoLocal = enderecoLocal;
        this.numeroLocal = numeroLocal;
        this.bairroLocal = bairroLocal;
        this.cidadeLocal = cidadeLocal;
        this.estadoLocal = estadoLocal;
        this.paisLocal = paisLocal;
        this.cepLocal = cepLocal;
        this.nomePessoaFisica = nomePessoaFisica;
        this.telefonePessoaFisica = telefonePessoaFisica;
        this.cpf = cpf;
        this.emailPessoaFisica = emailPessoaFisica;
        this.nomePessoaJuridica = nomePessoaJuridica;
        this.razaoSocial = razaoSocial;
        this.emailPessoaJuridica = emailPessoaJuridica;
        this.telefonePessoaJuridica = telefonePessoaJuridica;
        this.cnpj = cnpj;
        this.nomeProduto = nomeProduto;
        this.imagemProduto = imagemProduto;
        this.categoriaPoduto = categoriaPoduto;
        this.tamanhoProduto = tamanhoProduto;
        this.pesoProduto = pesoProduto;
        this.corPredominante = corPredominante;
        this.idPedido = idPedido;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the formaPagamento
     */
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the idPessoFisica
     */
    public int getIdPessoFisica() {
        return idPessoFisica;
    }

    /**
     * @param idPessoFisica the idPessoFisica to set
     */
    public void setIdPessoFisica(int idPessoFisica) {
        this.idPessoFisica = idPessoFisica;
    }

    /**
     * @return the idpessoaJuridica
     */
    public int getIdpessoaJuridica() {
        return idpessoaJuridica;
    }

    /**
     * @param idpessoaJuridica the idpessoaJuridica to set
     */
    public void setIdpessoaJuridica(int idpessoaJuridica) {
        this.idpessoaJuridica = idpessoaJuridica;
    }

    /**
     * @return the valorLocacao
     */
    public String getValorLocacao() {
        return valorLocacao;
    }

    /**
     * @param valorLocacao the valorLocacao to set
     */
    public void setValorLocacao(String valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    /**
     * @return the dataLimite
     */
    public Date getDataLimite() {
        return dataLimite;
    }

    /**
     * @param dataLimite the dataLimite to set
     */
    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the totalDias
     */
    public String getTotalDias() {
        return totalDias;
    }

    /**
     * @param totalDias the totalDias to set
     */
    public void setTotalDias(String totalDias) {
        this.totalDias = totalDias;
    }

    /**
     * @return the situacaoPedido
     */
    public String getSituacaoPedido() {
        return situacaoPedido;
    }

    /**
     * @param situacaoPedido the situacaoPedido to set
     */
    public void setSituacaoPedido(String situacaoPedido) {
        this.situacaoPedido = situacaoPedido;
    }

    /**
     * @return the enderecoLocal
     */
    public String getEnderecoLocal() {
        return enderecoLocal;
    }

    /**
     * @param enderecoLocal the enderecoLocal to set
     */
    public void setEnderecoLocal(String enderecoLocal) {
        this.enderecoLocal = enderecoLocal;
    }

    /**
     * @return the numeroLocal
     */
    public String getNumeroLocal() {
        return numeroLocal;
    }

    /**
     * @param numeroLocal the numeroLocal to set
     */
    public void setNumeroLocal(String numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    /**
     * @return the bairroLocal
     */
    public String getBairroLocal() {
        return bairroLocal;
    }

    /**
     * @param bairroLocal the bairroLocal to set
     */
    public void setBairroLocal(String bairroLocal) {
        this.bairroLocal = bairroLocal;
    }

    /**
     * @return the cidadeLocal
     */
    public String getCidadeLocal() {
        return cidadeLocal;
    }

    /**
     * @param cidadeLocal the cidadeLocal to set
     */
    public void setCidadeLocal(String cidadeLocal) {
        this.cidadeLocal = cidadeLocal;
    }

    /**
     * @return the estadoLocal
     */
    public String getEstadoLocal() {
        return estadoLocal;
    }

    /**
     * @param estadoLocal the estadoLocal to set
     */
    public void setEstadoLocal(String estadoLocal) {
        this.estadoLocal = estadoLocal;
    }

    /**
     * @return the paisLocal
     */
    public String getPaisLocal() {
        return paisLocal;
    }

    /**
     * @param paisLocal the paisLocal to set
     */
    public void setPaisLocal(String paisLocal) {
        this.paisLocal = paisLocal;
    }

    /**
     * @return the cepLocal
     */
    public String getCepLocal() {
        return cepLocal;
    }

    /**
     * @param cepLocal the cepLocal to set
     */
    public void setCepLocal(String cepLocal) {
        this.cepLocal = cepLocal;
    }

    /**
     * @return the nomePessoaFisica
     */
    public String getNomePessoaFisica() {
        return nomePessoaFisica;
    }

    /**
     * @param nomePessoaFisica the nomePessoaFisica to set
     */
    public void setNomePessoaFisica(String nomePessoaFisica) {
        this.nomePessoaFisica = nomePessoaFisica;
    }

    /**
     * @return the telefonePessoaFisica
     */
    public String getTelefonePessoaFisica() {
        return telefonePessoaFisica;
    }

    /**
     * @param telefonePessoaFisica the telefonePessoaFisica to set
     */
    public void setTelefonePessoaFisica(String telefonePessoaFisica) {
        this.telefonePessoaFisica = telefonePessoaFisica;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the emailPessoaFisica
     */
    public String getEmailPessoaFisica() {
        return emailPessoaFisica;
    }

    /**
     * @param emailPessoaFisica the emailPessoaFisica to set
     */
    public void setEmailPessoaFisica(String emailPessoaFisica) {
        this.emailPessoaFisica = emailPessoaFisica;
    }

    /**
     * @return the nomePessoaJuridica
     */
    public String getNomePessoaJuridica() {
        return nomePessoaJuridica;
    }

    /**
     * @param nomePessoaJuridica the nomePessoaJuridica to set
     */
    public void setNomePessoaJuridica(String nomePessoaJuridica) {
        this.nomePessoaJuridica = nomePessoaJuridica;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the emailPessoaJuridica
     */
    public String getEmailPessoaJuridica() {
        return emailPessoaJuridica;
    }

    /**
     * @param emailPessoaJuridica the emailPessoaJuridica to set
     */
    public void setEmailPessoaJuridica(String emailPessoaJuridica) {
        this.emailPessoaJuridica = emailPessoaJuridica;
    }

    /**
     * @return the telefonePessoaJuridica
     */
    public String getTelefonePessoaJuridica() {
        return telefonePessoaJuridica;
    }

    /**
     * @param telefonePessoaJuridica the telefonePessoaJuridica to set
     */
    public void setTelefonePessoaJuridica(String telefonePessoaJuridica) {
        this.telefonePessoaJuridica = telefonePessoaJuridica;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
     * @return the categoriaPoduto
     */
    public String getCategoriaPoduto() {
        return categoriaPoduto;
    }

    /**
     * @param categoriaPoduto the categoriaPoduto to set
     */
    public void setCategoriaPoduto(String categoriaPoduto) {
        this.categoriaPoduto = categoriaPoduto;
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
     * @return the corPredominante
     */
    public String getCorPredominante() {
        return corPredominante;
    }

    /**
     * @param corPredominante the corPredominante to set
     */
    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    /**
     * @return the idPedido
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    
    
}
