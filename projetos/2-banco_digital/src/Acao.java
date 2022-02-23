import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Acao {
    private final String descricao;
    private final LocalDateTime data;
    private final double saldo;

    public Acao(String descricao, Conta conta) {
        this.descricao = descricao;
        this.data = LocalDateTime.now();
        this.saldo = conta.getSaldo();
    }

    @Override
    public String toString() {
        String dataStr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(data);
        return String.format("%5s %s | Data: %s | Saldo: R$ %.2f", "_", descricao, dataStr, saldo);
    }
}
