package br.com.inbooking.model;

import java.util.Date;

public class ConfiguracoesEmprestimo {
    private Integer idConfiguracao;
    private Double valorMultaPadrao;
    private Date tempolimiteRetiradaReserva;
    private Date DevolucaoEmprestimo;

    public ConfiguracoesEmprestimo() {
    }

    public ConfiguracoesEmprestimo(Integer idConfiguracao, Double valorMultaPadrao, Date tempolimiteRetiradaReserva, Date DevolucaoEmprestimo) {
        this.idConfiguracao = idConfiguracao;
        this.valorMultaPadrao = valorMultaPadrao;
        this.tempolimiteRetiradaReserva = tempolimiteRetiradaReserva;
        this.DevolucaoEmprestimo = DevolucaoEmprestimo;
    }

    public Integer getIdConfiguracao() {
        return idConfiguracao;
    }

    public void setIdConfiguracao(Integer idConfiguracao) {
        this.idConfiguracao = idConfiguracao;
    }

    public Double getValorMultaPadrao() {
        return valorMultaPadrao;
    }

    public void setValorMultaPadrao(Double valorMultaPadrao) {
        this.valorMultaPadrao = valorMultaPadrao;
    }

    public Date getTempolimiteRetiradaReserva() {
        return tempolimiteRetiradaReserva;
    }

    public void setTempolimiteRetiradaReserva(Date tempolimiteRetiradaReserva) {
        this.tempolimiteRetiradaReserva = tempolimiteRetiradaReserva;
    }

    public Date getDevolucaoEmprestimo() {
        return DevolucaoEmprestimo;
    }

    public void setDevolucaoEmprestimo(Date DevolucaoEmprestimo) {
        this.DevolucaoEmprestimo = DevolucaoEmprestimo;
    }
}
