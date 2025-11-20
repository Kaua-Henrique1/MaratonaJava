package academy.devkaua.maratonajava.javacore.Gassociacao.domain;

public class Time {
    private String nome;
    private jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimi() {
        System.out.println(this.nome);
        if (this.jogadores == null) return;
        for (String jogadores : jogador) {
            System.out.println(this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
