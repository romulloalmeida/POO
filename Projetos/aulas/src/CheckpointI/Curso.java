package CheckpointI;

public class Curso {
    private OpcaoCurso curso;
    private double valor;

    public Curso(OpcaoCurso curso) {
        this.curso = curso;
        switch (curso){
            case INGLES:
                this.valor = 700.00;
                break;
            case INFORMATICA:
                this.valor = 800.00;
                break;
            case ADMINISTRACAO:
                this.valor = 850.00;
                break;
            default:
                this.valor = 0.00;
        }
    }

    public double getValor() {
        return valor;
    }
}

