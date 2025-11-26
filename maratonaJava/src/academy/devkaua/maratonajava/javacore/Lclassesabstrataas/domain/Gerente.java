package academy.devkaua.maratonajava.javacore.Lclassesabstrataas.domain;

public class    Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "Gerente='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
