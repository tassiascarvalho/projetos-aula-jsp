/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exemplosservlets.model;

/**
 *
 * @author Tassia
 */
public class Aluno {
    //determinar os atributos
    private Integer idAluno;
    private String nomeAluno;//
    private String enderecoAluno;
    private String numeroAluno;
    private String cidadeAluno;
    private String telefoneAluno;
    private Integer idadeAluno;//
    private String emailAluno;//
    private String senhaAluno;
    //Clica com botão direito >> Inserir Código >> Construtor... (Alt+Insert)
    //Construtor - Cria espaço na memoria
    //Construtor Cheio
    public Aluno(Integer idAluno, String nomeAluno, String enderecoAluno, 
            String numeroAluno, String cidadeAluno, String telefoneAluno, 
            Integer idadeAluno, String emailAluno, String senhaAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.enderecoAluno = enderecoAluno;
        this.numeroAluno = numeroAluno;
        this.cidadeAluno = cidadeAluno;
        this.telefoneAluno = telefoneAluno;
        this.idadeAluno = idadeAluno;
        this.emailAluno = emailAluno;
        this.senhaAluno = senhaAluno;
    }
   
    //Construtor Vazio
    public Aluno(){
    }    
    //GET - PEGAR
    //SET - ATRIBUIR    
    //Botão Direito >> Refatorar >> Encapsular Campos
    //Selecionar tudo >> Clicar em Refatorar    
    /**
     * @return the idAluno
     */
    public Integer getidAluno() {
        return idAluno;
    }

    /**
     * @param idAluno the idAluno to set
     */
    public void setidAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    /**
     * @return the nomeAluno
     */
    public String getnomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setnomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the enderecoAluno
     */
    public String getenderecoAluno() {
        return enderecoAluno;
    }

    /**
     * @param enderecoAluno the enderecoAluno to set
     */
    public void setenderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    /**
     * @return the numeroAluno
     */
    public String getnumeroAluno() {
        return numeroAluno;
    }

    /**
     * @param numeroAluno the numeroAluno to set
     */
    public void setnumeroAluno(String numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    /**
     * @return the cidadeAluno
     */
    public String getcidadeAluno() {
        return cidadeAluno;
    }

    /**
     * @param cidadeAluno the cidadeAluno to set
     */
    public void setcidadeAluno(String cidadeAluno) {
        this.cidadeAluno = cidadeAluno;
    }

    /**
     * @return the telefoneAluno
     */
    public String gettelefoneAluno() {
        return telefoneAluno;
    }

    /**
     * @param telefoneAluno the telefoneAluno to set
     */
    public void settelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    /**
     * @return the idadeAluno
     */
    public Integer getidadeAluno() {
        return idadeAluno;
    }

    /**
     * @param idadeAluno the idadeAluno to set
     */
    public void setidadeAluno(Integer idadeAluno) {
        //códigos com validação
        if(idadeAluno >= 18){
            ///trativa
        }
        this.idadeAluno = idadeAluno;
    }

    /**
     * @return the emailAluno
     */
    public String getemailAluno() {
        
        return emailAluno;
    }

    /**
     * @param emailAluno the emailAluno to set
     */
    public void setemailAluno(String emailAluno) {
        //emailAluno
        this.emailAluno = emailAluno;
    }

    /**
     * @return the senhaAluno
     */
    public String getsenhaAluno() {
        return senhaAluno;
    }

    /**
     * @param senhaAluno the senhaAluno to set
     */
    public void setsenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }
    
    
    
    
    
    
    
    
    
    
    
}
