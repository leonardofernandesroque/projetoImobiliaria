
package model.domain;


public class Enderecos extends Bairro{
    
    private int id_Endereco;
    private String tipo_lagradouro;
    private String logradouro;
    private String numero_logradouro;
    private String complemento;
    private String cep;
    private String latitude;
    private String longitude;
    
    

    public String getNumero_apartamento() {
        return numero_apartamento;
    }

    public void setNumero_apartamento(String numero_apartamento) {
        this.numero_apartamento = numero_apartamento;
    }

    public String getAndar_apartamento() {
        return andar_apartamento;
    }

    public void setAndar_apartamento(String andar_apartamento) {
        this.andar_apartamento = andar_apartamento;
    }

    public String getBloco_apartamento() {
        return bloco_apartamento;
    }

    public void setBloco_apartamento(String bloco_apartamento) {
        this.bloco_apartamento = bloco_apartamento;
    }
    private String numero_apartamento;
    private String andar_apartamento;
    private String bloco_apartamento;
    
    
    

    public int getId_Endereco() {
        return id_Endereco;
    }

    public void setId_Endereco(int id_Endereco) {
        this.id_Endereco = id_Endereco;
    }

    public String getTipo_lagradouro() {
        return tipo_lagradouro;
    }

    public void setTipo_lagradouro(String tipo_lagradouro) {
        this.tipo_lagradouro = tipo_lagradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero_logradouro() {
        return numero_logradouro;
    }

    public void setNumero_logradouro(String numero_logradouro) {
        this.numero_logradouro = numero_logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    
    
}
