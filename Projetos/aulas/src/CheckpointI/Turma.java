package CheckpointI;

import java.util.List;

public class Turma {
    private String sala;
    private Turno turno;
    private Professor professor;
    private List<Aluno> listaAluno;
    private Curso curso;

    public Turma(String sala, Turno turno) {
        this.sala = sala;
        this.turno = turno;
    }

    public String getSala() {
        return sala;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
}
