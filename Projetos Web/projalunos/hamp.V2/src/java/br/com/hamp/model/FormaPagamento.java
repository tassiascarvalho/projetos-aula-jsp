
package br.com.hamp.model;

/**
 *
 * @author Douglas Costa
 * 
 */
public class FormaPagamento {
    private int idFormaPagamento;
    private String numeroCartao;
    private String titularCartao;
    private String cpfTitular;
    private String codSeguranca;
    private String validadeCartao;

    public FormaPagamento() {
    }

    public FormaPagamento(int idFormaPagamento, String numeroCartao, String titularCartao, String cpfTitular, String codSeguranca, String validadeCartao) {
        this.idFormaPagamento = idFormaPagamento;
        this.numeroCartao = numeroCartao;
        this.titularCartao = titularCartao;
        this.cpfTitular = cpfTitular;
        this.codSeguranca = codSeguranca;
        this.validadeCartao = validadeCartao;
    }

    /**
     * @return the idFormaPagamento
     */
    public int getIdFormaPagamento() {
        return idFormaPagamento;
    }

    /**
     * @param idFormaPagamento the idFormaPagamento to set
     */
    public void setIdFormaPagamento(int idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    /**
     * @return the numeroCartao
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @param numeroCartao the numeroCartao to set
     */
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * @return the titularCartao
     */
    public String getTitularCartao() {
        return titularCartao;
    }

    /**
     * @param titularCartao the titularCartao to set
     */
    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    /**
     * @return the cpfTitular
     */
    public String getCpfTitular() {
        return cpfTitular;
    }

    /**
     * @param cpfTitular the cpfTitular to set
     */
    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    /**
     * @return the codSeguranca
     */
    public String getCodSeguranca() {
        return codSeguranca;
    }

    /**
     * @param codSeguranca the codSeguranca to set
     */
    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    /**
     * @return the validadeCartao
     */
    public String getValidadeCartao() {
        return validadeCartao;
    }

    /**
     * @param validadeCartao the validadeCartao to set
     */
    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }
    
    
}
