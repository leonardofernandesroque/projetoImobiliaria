
package model.domain;

import model.domain.PesquisaCadastral;
import java.sql.Date;


public class PessoaJuridica extends PesquisaCadastral{
    
    
    private int id_PessoaPJ;
    private int id_Codigo_pessoa;
    private String razao_Social;
    private String nome_fantasia;
    private String cnpj;
    private String inscricao_Estadual;
    private String isento_Inscricao_estadual;
    private String atividade_Principal;
    private String atividades_Secundarias;
    private Date data_abertura;
    private String anotacoes;
    private String status_Cadastro;

    
    
    
    
    
    
    
    public int getId_PessoaPJ() {
        return id_PessoaPJ;
    }

    public void setId_PessoaPJ(int id_PessoaPJ) {
        this.id_PessoaPJ = id_PessoaPJ;
    }

    public int getId_Codigo_pessoa() {
        return id_Codigo_pessoa;
    }

    public void setId_Codigo_pessoa(int id_Codigo_pessoa) {
        this.id_Codigo_pessoa = id_Codigo_pessoa;
    }

    public String getRazao_Social() {
        return razao_Social;
    }

    public void setRazao_Social(String razao_Social) {
        this.razao_Social = razao_Social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao_Estadual() {
        return inscricao_Estadual;
    }

    public void setInscricao_Estadual(String inscricao_Estadual) {
        this.inscricao_Estadual = inscricao_Estadual;
    }

    public String getIsento_Inscricao_estadual() {
        return isento_Inscricao_estadual;
    }

    public void setIsento_Inscricao_estadual(String isento_Inscricao_estadual) {
        this.isento_Inscricao_estadual = isento_Inscricao_estadual;
    }

    public String getAtividade_Principal() {
        return atividade_Principal;
    }

    public void setAtividade_Principal(String atividade_Principal) {
        this.atividade_Principal = atividade_Principal;
    }

    public String getAtividades_Secundarias() {
        return atividades_Secundarias;
    }

    public void setAtividades_Secundarias(String atividades_Secundarias) {
        this.atividades_Secundarias = atividades_Secundarias;
    }

    public Date getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getStatus_Cadastro() {
        return status_Cadastro;
    }

    public void setStatus_Cadastro(String status_Cadastro) {
        this.status_Cadastro = status_Cadastro;
    }

    
    
    
        

        
}
