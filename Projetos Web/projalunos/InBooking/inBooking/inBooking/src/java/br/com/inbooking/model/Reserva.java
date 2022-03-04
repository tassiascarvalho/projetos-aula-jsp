package br.com.inbooking.model;

import java.util.Date;

public class Reserva {
    private Integer idReserva;
    private Integer id_Pessoa;
    private Integer id_Acervo;
    private Date dataReserva;
    private Date tempolimiteRetirada;    

    public Reserva() {
    }

    public Reserva(Integer idReserva, Integer id_Pessoa, Integer id_Acervo, Date dataReserva, Date tempolimiteRetirada) {
        this.idReserva = idReserva;
        this.id_Pessoa = id_Pessoa;
        this.id_Acervo = id_Acervo;
        this.dataReserva = dataReserva;
        this.tempolimiteRetirada = tempolimiteRetirada;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Integer getId_Pessoa() {
        return id_Pessoa;
    }

    public void setId_Pessoa(Integer id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    public Integer getId_Acervo() {
        return id_Acervo;
    }

    public void setId_Acervo(Integer id_Acervo) {
        this.id_Acervo = id_Acervo;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getTempolimiteRetirada() {
        return tempolimiteRetirada;
    }

    public void setTempolimiteRetirada(Date tempolimiteRetirada) {
        this.tempolimiteRetirada = tempolimiteRetirada;
    }
}
