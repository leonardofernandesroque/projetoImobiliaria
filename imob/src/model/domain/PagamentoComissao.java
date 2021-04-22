
package model.domain;

import java.sql.Date;



public class PagamentoComissao extends Pagamentos{

    private int id_pag_Comissao;
    private int id_Codigo_pagamento_Comissao;
    private Date data_Pagamento_Xomissao;
    private int codigo_Corretor_Imobiliaria;
    private int codigo_Pagador_Comissao;
    private String condicoes_Pagamento;
    private String anotacoes_Pagamento_comissao;
    private String status_Pagamento_Comissao;
    private String numero_Nota_Recibo;
    private String documentacao_Venda_locacao;

    public int getId_pag_Comissao() {
        return id_pag_Comissao;
    }

    public void setId_pag_Comissao(int id_pag_Comissao) {
        this.id_pag_Comissao = id_pag_Comissao;
    }

    public int getId_Codigo_pagamento_Comissao() {
        return id_Codigo_pagamento_Comissao;
    }

    public void setId_Codigo_pagamento_Comissao(int id_Codigo_pagamento_Comissao) {
        this.id_Codigo_pagamento_Comissao = id_Codigo_pagamento_Comissao;
    }

    public Date getData_Pagamento_Xomissao() {
        return data_Pagamento_Xomissao;
    }

    public void setData_Pagamento_Xomissao(Date data_Pagamento_Xomissao) {
        this.data_Pagamento_Xomissao = data_Pagamento_Xomissao;
    }

    public int getCodigo_Corretor_Imobiliaria() {
        return codigo_Corretor_Imobiliaria;
    }

    public void setCodigo_Corretor_Imobiliaria(int codigo_Corretor_Imobiliaria) {
        this.codigo_Corretor_Imobiliaria = codigo_Corretor_Imobiliaria;
    }

    public int getCodigo_Pagador_Comissao() {
        return codigo_Pagador_Comissao;
    }

    public void setCodigo_Pagador_Comissao(int codigo_Pagador_Comissao) {
        this.codigo_Pagador_Comissao = codigo_Pagador_Comissao;
    }

    public String getCondicoes_Pagamento() {
        return condicoes_Pagamento;
    }

    public void setCondicoes_Pagamento(String condicoes_Pagamento) {
        this.condicoes_Pagamento = condicoes_Pagamento;
    }

    public String getAnotacoes_Pagamento_comissao() {
        return anotacoes_Pagamento_comissao;
    }

    public void setAnotacoes_Pagamento_comissao(String anotacoes_Pagamento_comissao) {
        this.anotacoes_Pagamento_comissao = anotacoes_Pagamento_comissao;
    }

    public String getStatus_Pagamento_Comissao() {
        return status_Pagamento_Comissao;
    }

    public void setStatus_Pagamento_Comissao(String status_Pagamento_Comissao) {
        this.status_Pagamento_Comissao = status_Pagamento_Comissao;
    }

    public String getNumero_Nota_Recibo() {
        return numero_Nota_Recibo;
    }

    public void setNumero_Nota_Recibo(String numero_Nota_Recibo) {
        this.numero_Nota_Recibo = numero_Nota_Recibo;
    }

    public String getDocumentacao_Venda_locacao() {
        return documentacao_Venda_locacao;
    }

    public void setDocumentacao_Venda_locacao(String documentacao_Venda_locacao) {
        this.documentacao_Venda_locacao = documentacao_Venda_locacao;
    }




    
}
