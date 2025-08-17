# Anotações da Maratona Java
## **Introdução classes**

- Conceito
  -  Preciso importar o package das funcoes, para poder trabalhar com as variaveis.
  - O nome da classe tem que ser igual a onde ela e criada e a onde e usada.
  -     Estudante estudante = new Estudante();
        //Variavel por reference.
  -     estudante.idade = 18;
        estudante.nome = Kaua;
        estudante.sexo = M;
        //Para acessar a variavel, precisa do '.'.
  
## **Coesão**

- Sempre ter bem definido a classe.
- Exemplo: Classe professor não deve está junto com a do Aluno.

## **Metodo**

- Se o seu metodo tem mais de 2 paramentros, e considerado uma boa pratica, reduzir em mais paramentros.
- Estrutura de um metodo:
  -     public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;

  -       Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
