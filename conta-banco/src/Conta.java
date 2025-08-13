public class Conta {
    
    private Integer numero;
    private String agencia;
    private Cliente cliente;
    private Float saldo;

    public Integer getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public Float getSaldo(){
        return this.saldo;
    }

    public void setNumero(Integer numero){

        this.numero = numero;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setCliente(Cliente cliente){

        this.cliente = cliente;
    }

    public void setSaldo(Float saldo){

        this.saldo = saldo;
    }

}
