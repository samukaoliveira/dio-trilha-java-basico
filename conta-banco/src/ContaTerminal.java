import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Conta conta = new Conta();

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o número da conta - Somente números: ");
        ContaService.setNumero(conta, numero.nextInt());

        Scanner agencia = new Scanner(System.in);;
        System.out.println("Digite o número da agencia - Com o traço: ");
        ContaService.setAgencia(conta, agencia.next());

        Cliente cliente = new Cliente();

        Scanner clienteCpf = new Scanner(System.in);;
        System.out.println("Digite o CPF do cliente: ");
        ContaService.setCpfCliente(cliente, clienteCpf.next());

        Scanner clienteNome = new Scanner(System.in);;
        System.out.println("Digite o nome do cliente: ");
        ContaService.setNomeCliente(cliente, clienteNome.next());

        ContaService.setCliente(conta, cliente);

        Scanner saldo = new Scanner(System.in);;
        System.out.println("Digite o valor do saldo: ");
        ContaService.setSaldo(conta, saldo.nextFloat());

        System.out.println("|----------  informações da Conta: -----------| \n"
        + "Conta: " + conta.getNumero() + " \n"
        + "Agencia: " + conta.getAgencia() + " \n"
        + "Cliente: " + conta.getCliente().getNome() + " \n"
        + "Saldo: " + conta.getSaldo());
    }
}
