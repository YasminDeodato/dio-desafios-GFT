import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Cliente> listaClientes() {
        List<Cliente> clientes = new ArrayList<>();
        for(Conta conta: contas)
            clientes.add(conta.cliente);

        return clientes;
    }

    public void imprimirClientes() {
        for(Cliente cliente: listaClientes()) {
            System.out.print(cliente.toString());
        }
    }

    public void imprimirInfosContas() {
        for(Conta conta: contas) {
            conta.imprimirExtrato();
        }
    }
}
