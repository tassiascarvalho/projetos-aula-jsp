/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocompleto.model;

import java.util.Date;

/**
 *
 * @author Tassia
 */
public class Saida {
    private Integer idSaida;
    private String chaveSaida;
    private String natOpSaida;
    private Date dataEmissaoSaida;
    private Fisica oFisica;
    private String statusSaida;
    private Date dataCriacaoSaida;

    public Saida() {
    }

    public Saida(Integer idSaida) {
        this.idSaida = idSaida;
    }


    public Saida(Integer idSaida, String chaveSaida, String natOpSaida, Date dataEmissaoSaida, Fisica oFisica, String statusSaida, Date dataCriacaoSaida) {
        this.idSaida = idSaida;
        this.chaveSaida = chaveSaida;
        this.natOpSaida = natOpSaida;
        this.dataEmissaoSaida = dataEmissaoSaida;
        this.oFisica = oFisica;
        this.statusSaida = statusSaida;
        this.dataCriacaoSaida = dataCriacaoSaida;
    }

    public String getStatusSaida() {
        return statusSaida;
    }

    public void setStatusSaida(String statusSaida) {
        this.statusSaida = statusSaida;
    }

    public Date getDataCriacaoSaida() {
        return dataCriacaoSaida;
    }

    public void setDataCriacaoSaida(Date dataCriacaoSaida) {
        this.dataCriacaoSaida = dataCriacaoSaida;
    }

    
    public Integer getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Integer idSaida) {
        this.idSaida = idSaida;
    }

    public String getChaveSaida() {
        return chaveSaida;
    }

    public void setChaveSaida(String chaveSaida) {
        this.chaveSaida = chaveSaida;
    }

    public String getNatOpSaida() {
        return natOpSaida;
    }

    public void setNatOpSaida(String natOpSaida) {
        this.natOpSaida = natOpSaida;
    }

    public Date getDataEmissaoSaida() {
        return dataEmissaoSaida;
    }

    public void setDataEmissaoSaida(Date dataEmissaoSaida) {
        this.dataEmissaoSaida = dataEmissaoSaida;
    }

    public Fisica getoFisica() {
        return oFisica;
    }

    public void setoFisica(Fisica oFisica) {
        this.oFisica = oFisica;
    }
    
    
    
}
