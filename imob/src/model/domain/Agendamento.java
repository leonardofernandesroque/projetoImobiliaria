
package model.domain;

import java.sql.Date;
import java.sql.Time;


public class Agendamento {
    
    private int id_Agendamento;
    private int id_Codigo_Agendamento;
    private Date data_Agendamento;
    private Time hora_Agendamento;
    private String tipo_De_Agendamento;
    private String assunto_Agendamento;
    private String anotacoes_Agendamento;
    private String status_Agendamento;
    private String reagendamento;
    private Date data_reagendamento;
    private Time hora_Reagendamento;
    private int id_Cliente;
    private int id_Imovel;
    

    public int getId_Agendamento() {
        return id_Agendamento;
    }

    public void setId_Agendamento(int id_Agendamento) {
        this.id_Agendamento = id_Agendamento;
    }

    public int getId_Codigo_Agendamento() {
        return id_Codigo_Agendamento;
    }

    public void setId_Codigo_Agendamento(int id_Codigo_Agendamento) {
        this.id_Codigo_Agendamento = id_Codigo_Agendamento;
    }

    public Date getData_Agendamento() {
        return data_Agendamento;
    }

    public void setData_Agendamento(Date data_Agendamento) {
        this.data_Agendamento = data_Agendamento;
    }

    public Time getHora_Agendamento() {
        return hora_Agendamento;
    }

    public void setHora_Agendamento(Time hora_Agendamento) {
        this.hora_Agendamento = hora_Agendamento;
    }

    public String getTipo_De_Agendamento() {
        return tipo_De_Agendamento;
    }

    public void setTipo_De_Agendamento(String tipo_De_Agendamento) {
        this.tipo_De_Agendamento = tipo_De_Agendamento;
    }

    public String getAssunto_Agendamento() {
        return assunto_Agendamento;
    }

    public void setAssunto_Agendamento(String assunto_Agendamento) {
        this.assunto_Agendamento = assunto_Agendamento;
    }

    public String getAnotacoes_Agendamento() {
        return anotacoes_Agendamento;
    }

    public void setAnotacoes_Agendamento(String anotacoes_Agendamento) {
        this.anotacoes_Agendamento = anotacoes_Agendamento;
    }

    public String getStatus_Agendamento() {
        return status_Agendamento;
    }

    public void setStatus_Agendamento(String status_Agendamento) {
        this.status_Agendamento = status_Agendamento;
    }

    public String getReagendamento() {
        return reagendamento;
    }

    public void setReagendamento(String reagendamento) {
        this.reagendamento = reagendamento;
    }

    public Date getData_reagendamento() {
        return data_reagendamento;
    }

    public void setData_reagendamento(Date data_reagendamento) {
        this.data_reagendamento = data_reagendamento;
    }

    public Time getHora_Reagendamento() {
        return hora_Reagendamento;
    }

    public void setHora_Reagendamento(Time hora_Reagendamento) {
        this.hora_Reagendamento = hora_Reagendamento;
    }
    
    
    
    
    
    
}
