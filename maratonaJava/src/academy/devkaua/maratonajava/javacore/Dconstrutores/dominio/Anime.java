package academy.devkaua.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;

    //Ele e executado antes de qualquer metodo que tem na classe.
    public Anime(String nome, String tipo, int epsodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
    }

}

