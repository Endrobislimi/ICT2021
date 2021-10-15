package DetyreShtepie;

import java.util.Scanner;

public class Semafori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numri = reader.nextInt();

        if (numri == 1) {
            System.out.println("Semafori i kuq");
        }
        else if (numri == 2) {
            System.out.println("Semafori eshte i verdhe");
        }
        else if (numri == 3) {
            System.out.println("Semafori eshte i gjelbert");
        }
        else if (numri == 4) {
            System.out.println("Semafori eshte duke blinkuar");
        }
        else
            System.out.println("Ju keni shtypur numrin gabim");
    }
}
