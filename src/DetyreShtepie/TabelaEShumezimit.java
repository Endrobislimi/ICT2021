package DetyreShtepie;

import java.util.Scanner;

public class TabelaEShumezimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shtypni nje numer: ");
        int numri = reader.nextInt();

        for (int i = 1; i<=10; i++) {
            System.out.println(numri+" * "+i+" = "+numri*i);
        }

    }
}
