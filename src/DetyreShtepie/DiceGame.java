package DetyreShtepie;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Welcome to Dice Game");
        System.out.println("--------------------------");
        System.out.println("Programi eshte gati te hedh 2 zaret, qello vleren e atyre 2 zareve");
        System.out.print("Shkruani nje numer qe mendoni se do te te jete i sakte: ");
        int numri1 = reader.nextInt();
        int min = 1;
        int max = 7;
            int zari1 = (int) (Math.random() * (max - min)) + min;
            int zari2 = (int) (Math.random() * (max - min)) + min;
            int vlera = zari1 + zari2;
            if (numri1 == vlera)
                System.out.println("Urime keni fituar");
            else
                System.out.println("Fat herave tjera");

        System.out.println("Zari i pare: "+zari1);
        System.out.println("Zari i dyte: "+zari2);

        System.out.println("Vlera e gjeneruar nga Zaret ishte: "+vlera);

    }
}
