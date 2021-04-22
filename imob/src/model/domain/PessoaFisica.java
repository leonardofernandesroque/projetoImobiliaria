
package model.domain;

import model.domain.PesquisaCadastral;
import java.util.Date;


public class PessoaFisica extends PesquisaCadastral{
    
    private int id_PessoaPF;
    private int id_Codigo_Pessoa;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Date data_nascimento;
    private String sexo;
    private String estado_Civil;
    private String regime_bens;
    private String naturalidade;
    private String estado_Naturalidade;
    private String escolaridade;
    private String profissao;
    private String anotacoes;
    private String nome_pai;
    private String nome_mae;
    private String status_Cadastro;

    
    
    
    
    
    
    
    
    
    
    public int getId_PessoaPF() {
        return id_PessoaPF;
    }

    public void setId_PessoaPF(int id_PessoaPF) {
        this.id_PessoaPF = id_PessoaPF;
    }

    public int getId_Codigo_Pessoa() {
        return id_Codigo_Pessoa;
    }

    public void setId_Codigo_Pessoa(int id_Codigo_Pessoa) {
        this.id_Codigo_Pessoa = id_Codigo_Pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_Civil() {
        return estado_Civil;
    }

    public void setEstado_Civil(String estado_Civil) {
        this.estado_Civil = estado_Civil;
    }

    public String getRegime_bens() {
        return regime_bens;
    }

    public void setRegime_bens(String regime_bens) {
        this.regime_bens = regime_bens;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstado_Naturalidade() {
        return estado_Naturalidade;
    }

    public void setEstado_Naturalidade(String estado_Naturalidade) {
        this.estado_Naturalidade = estado_Naturalidade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getStatus_Cadastro() {
        return status_Cadastro;
    }

    public void setStatus_Cadastro(String status_Cadastro) {
        this.status_Cadastro = status_Cadastro;
    }
    
    
    
    
    
}
