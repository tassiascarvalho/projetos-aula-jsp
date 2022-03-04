package br.com.inbooking.model;
public class Multa {
    private Integer idMulta;
    private Integer id_Emprestimo;
    private Double valorMulta;

    public Multa() {
    }

    public Multa(Integer idMulta, Integer id_Emprestimo, Double valorMulta) {
        this.idMulta = idMulta;
        this.id_Emprestimo = id_Emprestimo;
        this.valorMulta = valorMulta;
    }

    public Integer getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(Integer idMulta) {
        this.idMulta = idMulta;
    }

    public Integer getId_Emprestimo() {
        return id_Emprestimo;
    }

    public void setId_Emprestimo(Integer id_Emprestimo) {
        this.id_Emprestimo = id_Emprestimo;
    }

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }
}
