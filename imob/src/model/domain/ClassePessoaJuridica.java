
package model.domain;


public class ClassePessoaJuridica extends PessoaJuridica{
    
    
    private int id_ClientePJ;
    private int codigo_ClientePJ;
    private String status_Comprador;
    private String status_Locatorio;
    private String status_Locador;
    private String status_Vendedor;

    
    
    
    
    
    
    
    
    
    
    public int getId_ClientePJ() {
        return id_ClientePJ;
    }

    public void setId_ClientePJ(int id_ClientePJ) {
        this.id_ClientePJ = id_ClientePJ;
    }

    public int getCodigo_ClientePJ() {
        return codigo_ClientePJ;
    }

    public void setCodigo_ClientePJ(int codigo_ClientePJ) {
        this.codigo_ClientePJ = codigo_ClientePJ;
    }

    public String getStatus_Comprador() {
        return status_Comprador;
    }

    public void setStatus_Comprador(String status_Comprador) {
        this.status_Comprador = status_Comprador;
    }

    public String getStatus_Locatorio() {
        return status_Locatorio;
    }

    public void setStatus_Locatorio(String status_Locatorio) {
        this.status_Locatorio = status_Locatorio;
    }

    public String getStatus_Locador() {
        return status_Locador;
    }

    public void setStatus_Locador(String status_Locador) {
        this.status_Locador = status_Locador;
    }

    public String getStatus_Vendedor() {
        return status_Vendedor;
    }

    public void setStatus_Vendedor(String status_Vendedor) {
        this.status_Vendedor = status_Vendedor;
    }
   
}
