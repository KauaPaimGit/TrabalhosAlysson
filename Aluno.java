public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private String email;

    public Aluno(String matricula, String nome, String curso, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Nome: " + nome + ", Curso: " + curso + ", Email: " + email;
    }
}
