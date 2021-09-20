package CheckpointI;

import java.util.List;

public class Professor extends Pessoa {
    private double valorHora;
    private List<Formacao> listaFormacao;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public List<Formacao> getListaFormacao() {
        return listaFormacao;
    }

    public void setListaFormacao(List<Formacao> listaFormacao) {
        this.listaFormacao = listaFormacao;
    }
}
