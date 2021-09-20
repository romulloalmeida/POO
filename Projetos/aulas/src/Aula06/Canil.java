package Aula06;

public class Canil {

    public static void main(String[] args) {
        Cachorro rex = new Cachorro(true,"Dalmata",2015,5.2,false,false,"Rex");
        Cachorro lulu = new Cachorro(true,"Poodle",2018,5.2,false,false,"Lulu");

        System.out.println("Nome: " + rex.getNome());
        System.out.println("Raça: " + rex.getRaca());
        System.out.println("Idade: " + rex.idade());
        System.out.println("Nome: " + lulu.getNome());
        System.out.println("Raça: " + lulu.getRaca());
        System.out.println("Idade: " + lulu.idade());
    }
}
