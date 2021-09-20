import java.util.Scanner;

public class MesaTrabalho120821 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber se é primo!");
        int valor = scanner.nextInt();
        boolean resultado = primo(valor);
        if (resultado)
            System.out.println("O número digitado é primo!");
        else
            System.out.println("O número digitado não é primo");
        System.out.println();
    }
    static boolean primo(int numero){
        int divisores = 0;
        for(int i=1;i<=numero;i++){
            if(numero%i==0)
                divisores++;
        }
        if(divisores == 2)
            return true;
        else
            return false;
    }
    static int maximoEntreTresNumeros(int umNumeroA, int umNumeroB, int umNumeroC){
        if (umNumeroA>umNumeroB){
            if (umNumeroA>umNumeroC)
                return umNumeroA;
            else
                return umNumeroC;
        }
        else {
            if (umNumeroB>umNumeroC)
                return umNumeroB;
            else
                return umNumeroC;
        }
    }
}
