/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pwbook.model;

import java.util.Date;

/**
 *
 * @author Tassia
 */
public class Seguidor {
    private Integer idSeguidor;
    private Date dataInicioSeguidor;
    private String statusSeguidor;

    public Seguidor() {
    }

    public Seguidor(Integer idSeguidor, Date dataInicioSeguidor, String statusSeguidor) {
        this.idSeguidor = idSeguidor;
        this.dataInicioSeguidor = dataInicioSeguidor;
        this.statusSeguidor = statusSeguidor;
    }

    /**
     * @return the idSeguidor
     */
    public Integer getIdSeguidor() {
        return idSeguidor;
    }

    /**
     * @param idSeguidor the idSeguidor to set
     */
    public void setIdSeguidor(Integer idSeguidor) {
        this.idSeguidor = idSeguidor;
    }

    /**
     * @return the dataInicioSeguidor
     */
    public Date getDataInicioSeguidor() {
        return dataInicioSeguidor;
    }

    /**
     * @param dataInicioSeguidor the dataInicioSeguidor to set
     */
    public void setDataInicioSeguidor(Date dataInicioSeguidor) {
        this.dataInicioSeguidor = dataInicioSeguidor;
    }

    /**
     * @return the statusSeguidor
     */
    public String getStatusSeguidor() {
        return statusSeguidor;
    }

    /**
     * @param statusSeguidor the statusSeguidor to set
     */
    public void setStatusSeguidor(String statusSeguidor) {
        this.statusSeguidor = statusSeguidor;
    }
    
    
    
}
