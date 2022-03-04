
package br.com.hamp.model;

import java.util.Date;

/**
 *
 * @author Douglas Costa
 */

//Subclasse da classe PESSOA
public class PessoaFisica extends Pessoa{
    
   //Declaração dos atributos
   private int idPessoaFisica;
   private String cpfPessoaFisica;
   private String sexoPessoaFisica;
   private Date dataNascimentoPessoaFisica;
   private String imagemPessoaFisica;
   
    //Declaração do construtor sem argumento
    public PessoaFisica() {
    }
   
    //Declaração do construtor com argumento
    public PessoaFisica(String imagemPessoaFisica, int idPessoaFisica, String cpfPessoaFisica, String sexoPessoaFisica, Date dataNascimentoPessoaFisica,int idPessoa, String nomePessoa, String telefonePessoa, String emailPessoa, String senhaPessoa, String nomeUsuario) {
        super(idPessoa, nomePessoa, telefonePessoa, emailPessoa, senhaPessoa, nomeUsuario);
        this.idPessoaFisica = idPessoaFisica;
        this.cpfPessoaFisica = cpfPessoaFisica;
        this.sexoPessoaFisica = sexoPessoaFisica;
        this.dataNascimentoPessoaFisica = dataNascimentoPessoaFisica;
        this.imagemPessoaFisica =imagemPessoaFisica;
    }
  
    //Declaração dos GETS e SETS
    /**
     * @return the idPessoaFisica
     */
    public int getIdPessoaFisica() {
        return idPessoaFisica;
    }

    /**
     * @param idPessoaFisica the idPessoaFisica to set
     */
    public void setIdPessoaFisica(int idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    /**
     * @return the cpfPessoaFisica
     */
    public String getCpfPessoaFisica() {
        return cpfPessoaFisica;
    }

    /**
     * @param cpfPessoaFisica the cpfPessoaFisica to set
     */
    public void setCpfPessoaFisica(String cpfPessoaFisica) {
        this.cpfPessoaFisica = cpfPessoaFisica;
    }

    /**
     * @return the sexoPessoaFisica
     */
    public String getSexoPessoaFisica() {
        return sexoPessoaFisica;
    }

    /**
     * @param sexoPessoaFisica the sexoPessoaFisica to set
     */
    public void setSexoPessoaFisica(String sexoPessoaFisica) {
        this.sexoPessoaFisica = sexoPessoaFisica;
    }

    /**
     * @return the dataNascimentoPessoaFisica
     */
    public Date getDataNascimentoPessoaFisica() {
        return dataNascimentoPessoaFisica;
    }

    /**
     * @param dataNascimentoPessoaFisica the dataNascimentoPessoaFisica to set
     */
    public void setDataNascimentoPessoaFisica(Date dataNascimentoPessoaFisica) {
        this.dataNascimentoPessoaFisica = dataNascimentoPessoaFisica;
    }

    /**
     * @return the imagemPessoaFisica
     */
    public String getImagemPessoaFisica() {
        return imagemPessoaFisica;
    }

    /**
     * @param imagemPessoaFisica the imagemPessoaFisica to set
     */
    public void setImagemPessoaFisica(String imagemPessoaFisica) {
        this.imagemPessoaFisica = imagemPessoaFisica;
    }
    
}
