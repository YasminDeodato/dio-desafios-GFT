import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataNasc;

    public Cliente(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int idade() {
        return dataNasc.until(LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("\n  Nome: %s | Data de nascimento: %s | Idade: %d", nome, dataNasc, idade());
    }
}
