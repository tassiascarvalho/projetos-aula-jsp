/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qa.model;

/*@author Tassia*/
public class Categoria {
    private Integer idCategoria;
    private String descricaoCategoria;

    /*Método construtor: Os construtores são os responsáveis por criar o 
    objeto em memória, ou seja, instanciar a classe que foi definida*/
    //Botão Direito > Inserir Código > Construtor (Gerar um cheio e vazio)
    //Caso necessário gerar somente com os atributos desejados.
    public Categoria() {
    }

    public Categoria(Integer idCategoria, String descricaoCategoria) {
        this.idCategoria = idCategoria;
        this.descricaoCategoria = descricaoCategoria;
    }  
    
    //Gerar em caso de relacionamento 1..* somente com o id
    public Categoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Categoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
    
    
    /*Get e Set: A melhor forma que acessar de forma segura os atributos
    de uma classe, é utilizar métodos. Os métodos GET e SET são técnicas 
    padronizadas para gerenciamento sobre o acesso dos atributo*/
    //Usamos get para obter informações. Sempre retorna um valor.
    //Usamos set para definir valores. Geralmente não retorna valores.
    //Botão Direito > Refatorar > Encapsular Campos
    
    /*@return the idCategoria*/
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /*@param idCategoria the idCategoria to set */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /* @return the descricaoCategoria*/
    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    /*@param descricaoCategoria the descricaoCategoria to set*/
    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }    
}
//Dicas
/*Criar nessa ordem:  Model, DAOImpl, View, Servlet;*/
    