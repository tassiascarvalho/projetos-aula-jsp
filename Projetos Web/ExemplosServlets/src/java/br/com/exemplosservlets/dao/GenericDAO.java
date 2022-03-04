/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exemplosservlets.dao;

import java.util.List;

/**
 *
 * @author Tassia
 */
public interface GenericDAO {
    //Uma interface não é considerada uma Classe e sim uma Entidade.
    //Não possui implementação, apenas assinatura, ou seja, 
    //apenas a definição dos seus métodos sem o corpo.
    //Todos os métodos são abstratos.
    //Seus métodos são implicitamente Públicos e Abstratos.
    
    //CREATE - READ - UPDATE - DETELE    
    public Boolean cadastrar(Object object);//P.O.
    public List<Object> listar();//add importação java.util.List
    public void excluir(int idObject);
    ///Update - Primeiramente Buscar a informação que quer alterar
    //e depois alterar;
    public Object carregar(int idObject);
    public Boolean alterar(Object object);
}
