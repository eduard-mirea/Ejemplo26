import java.util.Scanner;

public class Ejemplo26 {

    public static void main(String[] args){
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");

        int numero = miScanner.nextInt();
        miScanner.close();

        System.out.println("Divisores de " + numero);
        for (int i = 1; i <= numero / 2; i++) {
            if ((numero % i) == 0) {
                System.out.println("\t" + i);
            }
        }
    }

}