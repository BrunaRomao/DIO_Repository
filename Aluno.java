public class Aluno implements Comparable<Aluno> { // Implementar classe comparable (Automático) para usar Collections

    private String nome;
    private String curso;
    private double nota;
    private String sala;


    public Aluno(String nome, String curso, double nota) { //Construtor - possui mesmo nome da classe
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public Aluno(String nome, String curso, double nota, String sala) {
        this(nome, curso, nota);
        this.sala = sala;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public double getNota() {

        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return  nome;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome()); //Comparação da classe Aluno com o nome recebido
    }
}


