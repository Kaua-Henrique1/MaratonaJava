package academy.devkaua.maratonajava.javacore.Hherenca.domain;

public class Pessoa {
    protected String cpf;
    protected String nome;
    protected Endereco endereco;

    public void imprimi() {
        System.out.println(this.cpf);
        System.out.println(this.nome);
        System.out.println(this.endereco);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
