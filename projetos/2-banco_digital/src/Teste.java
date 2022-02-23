import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Banco banco = new Banco("BancoDaYas");

        //clientes
        Cliente cliente1 = new Cliente("Yasmin", LocalDate.parse("2002-03-09"));
        Cliente cliente2 = new Cliente("Beatriz", LocalDate.parse("2002-08-21"));
        Cliente cliente3 = new Cliente("Mariana", LocalDate.parse("2001-12-26"));

        //Contas - criação
        Conta ccYasmin = new ContaCorrente(cliente1);
        Conta cpYasmin = new ContaPoupanca(cliente1);
        Conta ccBeatriz = new ContaCorrente(cliente2);
        Conta cpMariana = new ContaPoupanca(cliente3);

        //Adicionar contas ao Banco
        banco.adicionarConta(ccYasmin);
        banco.adicionarConta(cpYasmin);
        banco.adicionarConta(ccBeatriz);
        banco.adicionarConta(cpMariana);

        //Movimentações nas Contas
        ccYasmin.depositar(200);
        ccBeatriz.depositar(500);
        cpMariana.depositar(1000);
        ccYasmin.transferir(50, cpYasmin);
        ccBeatriz.transferir(200, cpMariana);
        cpMariana.sacar(50);
        ccYasmin.sacar(20);

        //Para cada conta são impressas as informações do cliente, informacoes da conta e o historico de acoes;
        System.out.print("----- Lista de Clientes -----");
        banco.imprimirClientes();
        System.out.print("\n\n----- Lista de Contas e suas informacoes -----");
        banco.imprimirInfosContas();

        //Historico de acoes mais recentes
        System.out.println("\n//// Historico Acoes da Conta 4 - Ordenar pelas acoes mais recentes ////");
        cpMariana.imprimirHistoricoRecente();
    }
}
