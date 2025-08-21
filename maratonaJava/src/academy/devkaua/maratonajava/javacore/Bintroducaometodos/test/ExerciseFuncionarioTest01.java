package academy.devkaua.maratonajava.javacore.Bintroducaometodos.test;

import academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioExercise;

public class ExerciseFuncionarioTest01 {
    public static void main(String[] args) {
        FuncionarioExercise funcionario = new FuncionarioExercise();
        funcionario.idade = 18;
        funcionario.nome = "Kaua";
        funcionario.salarios = new double[]{1522, 2000, 922};

        //Chamada dos metodos
        funcionario.imprimir();
        funcionario.mediaSalariaResultado(funcionario.salarios);x
    }
}
