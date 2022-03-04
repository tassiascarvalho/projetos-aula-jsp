package br.com.hamp.model;

/**
 *
 * @author Douglas Costa
 */
//subclasse da classe PESSOA
public class PessoaJuridica extends Pessoa{
    
    //Declaração dos atributos
    private int idPessoaJuridica;
    private String cpnjPessoaJuridica;
    private String razaoSocialPessoaJuridica;
    private Double avaliacaoPessoaJuridica;
    private String imagemPessoaJ;
    //Declaração do construtor sem argumento
    public PessoaJuridica() {
    }
    
    //Declaração do construtor com argumento

    public PessoaJuridica(int idPessoaJuridica, String cpnjPessoaJuridica, String razaoSocialPessoaJuridica, Double avaliacaoPessoaJuridica, int idPessoa, String nomePessoa, String telefonePessoa, String emailPessoa, String senhaPessoa, String nomeUsuario,String imagemPessoaJ) {
        super(idPessoa, nomePessoa, telefonePessoa, emailPessoa, senhaPessoa, nomeUsuario);
        this.idPessoaJuridica = idPessoaJuridica;
        this.cpnjPessoaJuridica = cpnjPessoaJuridica;
        this.razaoSocialPessoaJuridica = razaoSocialPessoaJuridica;
        this.avaliacaoPessoaJuridica = avaliacaoPessoaJuridica;
        this.imagemPessoaJ = imagemPessoaJ;
    }
    //Declaração dos métodos GETS e SETS

    
    /**
     * @return the cpnjPessoaJuridica
     */
    public String getCpnjPessoaJuridica() {
        return cpnjPessoaJuridica;
    }

    /**
     * @param cpnjPessoaJuridica the cpnjPessoaJuridica to set
     */
    public void setCpnjPessoaJuridica(String cpnjPessoaJuridica) {
        this.cpnjPessoaJuridica = cpnjPessoaJuridica;
    }

    /**
     * @return the razaoSocialPessoaJuridica
     */
    public String getRazaoSocialPessoaJuridica() {
        return razaoSocialPessoaJuridica;
    }

    /**
     * @param razaoSocialPessoaJuridica the razaoSocialPessoaJuridica to set
     */
    public void setRazaoSocialPessoaJuridica(String razaoSocialPessoaJuridica) {
        this.razaoSocialPessoaJuridica = razaoSocialPessoaJuridica;
    }

    /**
     * @return the avaliacaoPessoaJuridica
     */
    public Double getAvaliacaoPessoaJuridica() {
        return avaliacaoPessoaJuridica;
    }

    /**
     * @param avaliacaoPessoaJuridica the avaliacaoPessoaJuridica to set
     */
    public void setAvaliacaoPessoaJuridica(Double avaliacaoPessoaJuridica) {
        this.avaliacaoPessoaJuridica = avaliacaoPessoaJuridica;
    }

    /**
     * @return the idPessoaJuridica
     */
    public int getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    /**
     * @param idPessoaJuridica the idPessoaJuridica to set
     */
    public void setIdPessoaJuridica(int idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    /**
     * @return the imagemPessoaJ
     */
    public String getImagemPessoaJ() {
        return imagemPessoaJ;
    }

    /**
     * @param imagemPessoaJ the imagemPessoaJ to set
     */
    public void setImagemPessoaJ(String imagemPessoaJ) {
        this.imagemPessoaJ = imagemPessoaJ;
    }

    /**
     * @return the avaliacaoPessoaJuridica
     */
   

    

    

    
}
