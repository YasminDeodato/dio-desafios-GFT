package br.com.dio.bootcamp.dominio;

public class Projeto extends Conteudo {
    private String linguagem;
    private String categoria;
    private String nivel;

    public Projeto(String titulo, String descricao, String linguagem, String categoria, String nivel) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.linguagem = linguagem;
        this.categoria = categoria;
        this.nivel = nivel;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public double calculaXP() {
        int acrescimo = 0;
        if (this.getNivel() == "Basico") acrescimo = 50;
        else if (this.getNivel() == "Intermediario") acrescimo = 120;
        else acrescimo = 200;

        return XP_PADRAO + acrescimo;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                "linguagem='" + linguagem + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nivel='" + nivel + '\'' +
                '}';
    }
}
