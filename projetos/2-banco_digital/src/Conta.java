import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1000;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Acao> historicoAcoes;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historicoAcoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            this.registrarAcao(String.format("Saque de R$ %.2f", valor));
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        this.registrarAcao(String.format("Deposito de R$ %.2f", valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        this.registrarAcao(String.format("Transferencia de R$ %.2f para Conta %d", valor, contaDestino.getNumero()));
    }

    private void registrarAcao(String descricao) {
        historicoAcoes.add(new Acao(descricao, this));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("  Titular: %s | Agencia: %d | Numero: %d | Saldo atual: R$ %.2f", this.cliente.getNome(), this.agencia, this.numero, this.saldo);
        System.out.printf("\n**** Cliente ****%s", this.cliente.toString());
        System.out.print("\n**** Historico de Acoes da Conta ****\n");
        this.imprimirHistoricoAntiga();
    }

    protected void imprimirHistoricoAntiga() {
        for(Acao acao: historicoAcoes) {
            System.out.println(acao.toString());
        }
    }

    protected void imprimirHistoricoRecente() {
        for(int i=historicoAcoes.size()-1; i>=0; i--) {
            Acao acao = historicoAcoes.get(i);
            System.out.println(acao.toString());
        }
    }
}
