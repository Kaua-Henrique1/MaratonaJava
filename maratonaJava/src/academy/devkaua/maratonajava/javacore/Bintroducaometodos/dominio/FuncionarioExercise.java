package academy.devkaua.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioExercise {
    //Atributos ou variaves de referencias
    public String nome;
    public int idade;
    public double[] salarios;

    //Metodo
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double sal : salarios) {
            System.out.print(sal + " ");
        }
    }
    //Metodo
    public void mediaSalariaResultado(double [] salarios) {
        double media = 0;
        // Isso e uma foreach:
        for (double salario : salarios) {
            //double salario: é uma variável temporária que vai receber cada elemento da coleção/array.
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media salarial: "+ media);
    }
}
