/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.dao;

import java.util.List;

/**
 *
 * @author Tassia
 */
public interface GenericDAO {
    //Não tem codificação do método apenas a assinatura 
    //CRUD 
    //tipo tiporetorno nome(Parametros);
    public Boolean cadastrar(Object object);
    public List<Object> listar();
    public void excluir(int idObject);
    public Object carregar(int idObject);
    public Boolean alterar(Object object);    
}
