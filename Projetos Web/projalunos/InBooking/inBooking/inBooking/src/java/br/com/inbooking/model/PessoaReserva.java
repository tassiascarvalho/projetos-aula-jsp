package br.com.inbooking.model;
public class PessoaReserva {
    private Integer id_Pessoa;
    private Integer id_Reserva;
    private Integer classificacaoReserva;

    public PessoaReserva() {
    }

    public PessoaReserva(Integer id_Pessoa, Integer id_Reserva, Integer classificacaoReserva) {
        this.id_Pessoa = id_Pessoa;
        this.id_Reserva = id_Reserva;
        this.classificacaoReserva = classificacaoReserva;
    }

    public Integer getId_Pessoa() {
        return id_Pessoa;
    }

    public void setId_Pessoa(Integer id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    public Integer getId_Reserva() {
        return id_Reserva;
    }

    public void setId_Reserva(Integer id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    public Integer getClassificacaoReserva() {
        return classificacaoReserva;
    }

    public void setClassificacaoReserva(Integer classificacaoReserva) {
        this.classificacaoReserva = classificacaoReserva;
    }
}
