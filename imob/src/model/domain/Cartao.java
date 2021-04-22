
package model.domain;

import java.sql.Date;


public class Cartao extends Pagamentos{
    
    private int id_Cartao;
    private int id_Codigo_Cartao;
    private int id_Cliente;
    private long numero_Cartao;
    private Date data_Vencimento;
    private Date dara_Recebimento;
    private String tipo_Cartao;
    private String bandeira_Cartao;
    private String anotacoes;
    private double valor_Recebido;

    public int getId_Cartao() {
        return id_Cartao;
    }

    public void setId_Cartao(int id_Cartao) {
        this.id_Cartao = id_Cartao;
    }

    public int getId_Codigo_Cartao() {
        return id_Codigo_Cartao;
    }

    public void setId_Codigo_Cartao(int id_Codigo_Cartao) {
        this.id_Codigo_Cartao = id_Codigo_Cartao;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public long getNumero_Cartao() {
        return numero_Cartao;
    }

    public void setNumero_Cartao(long numero_Cartao) {
        this.numero_Cartao = numero_Cartao;
    }

    public Date getData_Vencimento() {
        return data_Vencimento;
    }

    public void setData_Vencimento(Date data_Vencimento) {
        this.data_Vencimento = data_Vencimento;
    }

    public Date getDara_Recebimento() {
        return dara_Recebimento;
    }

    public void setDara_Recebimento(Date dara_Recebimento) {
        this.dara_Recebimento = dara_Recebimento;
    }

    public String getTipo_Cartao() {
        return tipo_Cartao;
    }

    public void setTipo_Cartao(String tipo_Cartao) {
        this.tipo_Cartao = tipo_Cartao;
    }

    public String getBandeira_Cartao() {
        return bandeira_Cartao;
    }

    public void setBandeira_Cartao(String bandeira_Cartao) {
        this.bandeira_Cartao = bandeira_Cartao;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public double getValor_Recebido() {
        return valor_Recebido;
    }

    public void setValor_Recebido(double valor_Recebido) {
        this.valor_Recebido = valor_Recebido;
    }
    
    
}
