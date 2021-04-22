
package model.domain;


public class ClientePessoaFisica extends PessoaFisica{
    
    private int id_ClientePF;
    private int id_Codigo_clientePF;
    private String status_Comprador;
    private String status_Locator;
    private String status_Locatario;
    private String status_Vendedor;
 
    
    public int getId_ClientePF() {
        return id_ClientePF;
    }

    public void setId_ClientePF(int id_ClientePF) {
        this.id_ClientePF = id_ClientePF;
    }

    public int getId_Codigo_clientePF() {
        return id_Codigo_clientePF;
    }

    public void setId_Codigo_clientePF(int id_Codigo_clientePF) {
        this.id_Codigo_clientePF = id_Codigo_clientePF;
    }

    public String getStatus_Comprador() {
        return status_Comprador;
    }

    public void setStatus_Comprador(String status_Comprador) {
        this.status_Comprador = status_Comprador;
    }

    public String getStatus_Locator() {
        return status_Locator;
    }

    public void setStatus_Locator(String status_Locator) {
        this.status_Locator = status_Locator;
    }

    public String getStatus_Locatario() {
        return status_Locatario;
    }

    public void setStatus_Locatario(String status_Locatario) {
        this.status_Locatario = status_Locatario;
    }

    public String getStatus_Vendedor() {
        return status_Vendedor;
    }

    public void setStatus_Vendedor(String status_Vendedor) {
        this.status_Vendedor = status_Vendedor;
    }
    
    
    
    
    
}
