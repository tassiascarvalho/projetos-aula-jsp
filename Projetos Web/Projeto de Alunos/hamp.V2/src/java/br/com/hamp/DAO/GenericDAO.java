
package br.com.hamp.DAO;


import java.util.List;



public interface GenericDAO {
   
         //Método Cadastrar
         public Boolean cadastrar (Object object);
         //Método listar
         public List <Object> listar ();
         //Método excluir
         public void excluir(Integer idObject);
         //Método carregar
         public Object carregar(int idObject);
         //Método Alterar
         public Boolean alterar(Object object);

    
}
