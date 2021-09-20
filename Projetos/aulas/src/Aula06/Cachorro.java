package Aula06;

public class Cachorro {
    private boolean adocao;
    private String raca;
    private int nascimento;
    private Double peso;
    private boolean chip;
    private boolean ferimento;
    private String nome;

    public Cachorro(boolean adocao,String raca, int nascimento,Double peso,boolean chip, boolean ferimento, String nome){
        this.adocao = adocao;
        this.raca = raca;
        this.nascimento = nascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferimento = ferimento;
        this.nome = nome;
    }

    public int idade(){
        return 2021-this.nascimento;
    }

    public boolean perdido(){
        if (this.chip)
            return false;
        else
            return true;
    }

    public boolean adocaoLiberado(){
        if(this.peso>5.0) {
            if (ferimento)
                return false;
            else
                return true;
        }
        else
            return false;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
}
