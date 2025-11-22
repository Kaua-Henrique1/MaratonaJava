package academy.devkaua.maratonajava.javacore.Gassociacao.xercicioSeminario.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] estudante;
    private Professor professor;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] estudante) {
        this.titulo = titulo;
        this.local = local;
        this.estudante = estudante;
    }

    public void imprimi() {
        System.out.println(this.titulo);
        System.out.println(this.local);

        System.out.println(professor.getNome());
        System.out.println(professor.getEspecielidade());

        if (estudante == null) return;
        for ( Aluno aluno: estudante) {
            System.out.println(aluno.getNome());
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Aluno[] estudante) {
        this.estudante = estudante;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
