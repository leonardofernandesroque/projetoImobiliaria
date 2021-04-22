
package model.domain;

import java.sql.Date;


public class Pagamentos {
    
    private int id_Pagamentos;
    private int id_Codigo_Pagamentos;
    private Date data_Pagamento;
    private Date data_vencimento_Pagamento;
    private double juros_Mensais;
    private double juros_multa;
    private int id_Codigo_Cliente;
    private String forma_pagamento;
    private double valor_Pagamento;
    private double valor_Desconto;
    private double valor_Total_pagamento;
    private String numero_Documento_Pagamento;
    private int id_Cliente;
    private int id_imovel;

    public int getId_Pagamentos() {
        return id_Pagamentos;
    }

    public void setId_Pagamentos(int id_Pagamentos) {
        this.id_Pagamentos = id_Pagamentos;
    }

    public int getId_Codigo_Pagamentos() {
        return id_Codigo_Pagamentos;
    }

    public void setId_Codigo_Pagamentos(int id_Codigo_Pagamentos) {
        this.id_Codigo_Pagamentos = id_Codigo_Pagamentos;
    }

    public Date getData_Pagamento() {
        return data_Pagamento;
    }

    public void setData_Pagamento(Date data_Pagamento) {
        this.data_Pagamento = data_Pagamento;
    }

    public Date getData_vencimento_Pagamento() {
        return data_vencimento_Pagamento;
    }

    public void setData_vencimento_Pagamento(Date data_vencimento_Pagamento) {
        this.data_vencimento_Pagamento = data_vencimento_Pagamento;
    }

    public double getJuros_Mensais() {
        return juros_Mensais;
    }

    public void setJuros_Mensais(double juros_Mensais) {
        this.juros_Mensais = juros_Mensais;
    }

    public double getJuros_multa() {
        return juros_multa;
    }

    public void setJuros_multa(double juros_multa) {
        this.juros_multa = juros_multa;
    }

    public int getId_Codigo_Cliente() {
        return id_Codigo_Cliente;
    }

    public void setId_Codigo_Cliente(int id_Codigo_Cliente) {
        this.id_Codigo_Cliente = id_Codigo_Cliente;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public double getValor_Pagamento() {
        return valor_Pagamento;
    }

    public void setValor_Pagamento(double valor_Pagamento) {
        this.valor_Pagamento = valor_Pagamento;
    }

    public double getValor_Desconto() {
        return valor_Desconto;
    }

    public void setValor_Desconto(double valor_Desconto) {
        this.valor_Desconto = valor_Desconto;
    }

    public double getValor_Total_pagamento() {
        return valor_Total_pagamento;
    }

    public void setValor_Total_pagamento(double valor_Total_pagamento) {
        this.valor_Total_pagamento = valor_Total_pagamento;
    }

    public String getNumero_Documento_Pagamento() {
        return numero_Documento_Pagamento;
    }

    public void setNumero_Documento_Pagamento(String numero_Documento_Pagamento) {
        this.numero_Documento_Pagamento = numero_Documento_Pagamento;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getId_imovel() {
        return id_imovel;
    }

    public void setId_imovel(int id_imovel) {
        this.id_imovel = id_imovel;
    }
    
    
    
    
    
    
    
}
