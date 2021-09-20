package Aula06;

import java.time.LocalDate;
import java.util.Date;

public class PrincipalImpresora {

    public static void main(String[] args) {
        Impressora impressora = new Impressora("Epson","wifi", LocalDate.of(2021,8,19));
    }
}
