/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Br.com.ComboBox.MODEL;


public class CidadeMODEL {
    
   private Integer Id_Cidade;
   private String Nome_Cidade;
   private Integer fk_Estado;

    /**
     * @return the Id_Cidade
     */
    public Integer getId_Cidade() {
        return Id_Cidade;
    }

    /**
     * @param Id_Cidade the Id_Cidade to set
     */
    public void setId_Cidade(Integer Id_Cidade) {
        this.Id_Cidade = Id_Cidade;
    }

    /**
     * @return the Nome_Cidade
     */
    public String getNome_Cidade() {
        return Nome_Cidade;
    }

    /**
     * @param Nome_Cidade the Nome_Cidade to set
     */
    public void setNome_Cidade(String Nome_Cidade) {
        this.Nome_Cidade = Nome_Cidade;
    }

    /**
     * @return the fk_Estado
     */
    public Integer getFk_Estado() {
        return fk_Estado;
    }

    /**
     * @param fk_Estado the fk_Estado to set
     */
    public void setFk_Estado(Integer fk_Estado) {
        this.fk_Estado = fk_Estado;
    }

   
  
   
}
