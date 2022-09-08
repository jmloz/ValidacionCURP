
package CURP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CURPvalidacion validacion = new CURPvalidacion ();
        Scanner teclado = new Scanner(System.in);
        String curp;
        System.out.print("Introduzca CURP:");
         curp = teclado.next();
        System.out.println(validacion.validacionC(curp));
    }
}
