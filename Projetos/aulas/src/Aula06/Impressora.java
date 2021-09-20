package Aula06;
import java.time.LocalDate;
import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private  Integer folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    private boolean temPapel(){
        if(this.folhasDisponiveis > 0)
            return true;
        else
            return false;
    }

    public void imprimir(String texto){
        if (temPapel()) {
            System.out.println(texto);
            this.folhasDisponiveis--;
        }
        else
            System.out.println("Inserir folhas");
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public Integer getFolhasDisponiveis() {
        return folhasDisponiveis;
    }
}
