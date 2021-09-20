import java.util.Scanner;

public class MinhaClasse {
    // Escopo
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        // Tipos de dados
        String meuPrimeiroNome = "";
        System.out.println("Digite seu nome:");
        meuPrimeiroNome = scanner.next();
        // Exibindo os dados
        System.out.println("Meu nome é: " + meuPrimeiroNome);

        System.out.println("Digite sua Idade:");
        int idade = scanner.nextInt();
        System.out.println("Minha idade é:" + idade);


    }
}
