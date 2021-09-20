import java.util.Scanner;

public class MesaTrabalho110821 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite o dia no seu nascimento: ");
        int dia = scanner.nextInt();
        System.out.println("Digite o mes no seu nascimento: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano no seu nascimento: ");
        int ano = scanner.nextInt();
        String aniversario = dataFormatada(dia,mes,ano);
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("Iniciais: " + nome.charAt(0) + sobrenome.charAt(0));
        System.out.println("Aniversário: " + aniversario);
    }

    static String dataFormatada(int dia, int mes, int ano){
        return dia + "/" + mes + "/" + ano;
    }
}
