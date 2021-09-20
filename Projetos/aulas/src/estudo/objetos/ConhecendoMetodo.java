package estudo.objetos;

public class ConhecendoMetodo {
    public static void main(String[] args) {
        int num = 1;
        boolean result = isOne(num);
        System.out.println(result);


    }

    // retorno + indificacao + paranmetro(s)
    static boolean isOne(int number){
        if (number == 1)
            return true;
        else
            return false;

    }
}
