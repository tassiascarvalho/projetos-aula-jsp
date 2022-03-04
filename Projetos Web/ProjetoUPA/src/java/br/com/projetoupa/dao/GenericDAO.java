/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoupa.dao;

import java.util.List;

/**
 *
 * @author Tassia
 */
public interface GenericDAO {
    //Na interface é feito apenas a assinatura
    //dos metodos (CRUD) e Carregar
    //Método que será usado para inserção de dados, 
    //retorna boolean, e recebe objetos completos
    public Boolean cadastrar(Object object);    
    //Consulta informações no BD, sem passagem de 
    //parametros
    public List <Object> listar();
    //Deleta apenas 1 registro do BD de acordo com o ID.
    public void excluir(int idObject);
    //Utiliza-do para selecionar dados especificos de um Objeto
    public Object carregar(int idObject);
    //Realiza o Upadate, alteração dos dados
    public Boolean alterar(Object object);
}
    

