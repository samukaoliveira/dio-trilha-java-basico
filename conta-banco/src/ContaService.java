

public class ContaService {
    
    

    public static Integer getNumero(Conta conta){
        return conta.getNumero();
    }

    public static String getAgencia(Conta conta){
        return conta.getAgencia();
    }

    public static String getNomeCliente(Conta conta){
        return conta.getCliente().getNome();
    }

    public static Float getSaldo(Conta conta){
        return conta.getSaldo();
    }

    public static void setNumero(Conta conta, Integer numero){
        conta.setNumero(numero);
    }

    public static void setAgencia(Conta conta, String agencia){
        conta.setAgencia(agencia);
    }

    public static void setNomeCliente(Cliente cliente, String nome){
        cliente.setNome(nome);
    }

    public static void setCpfCliente(Cliente cliente, String cpf){
        cliente.setCpf(cpf);
    }

    public static void setCliente(Conta conta, Cliente cliente){
        conta.setCliente(cliente);
    }

    public static void setSaldo(Conta conta, Float saldo){
        conta.setSaldo(saldo);
    }

}
