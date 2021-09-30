package DetyreShtepie;

import java.util.Scanner;

public class EKuleta {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int sa1cent, sa2cent, sa5cent, sa10cent, sa20cent, sa50cent, sa1euro, sa2euro;

        System.out.print("Sa 1 cent: ");
        sa1cent = reader.nextInt();

        System.out.print("Sa 2 cent: ");
        sa2cent = reader.nextInt();

        System.out.print("Sa 5 cent: ");
        sa5cent = reader.nextInt();

        System.out.print("Sa 10 cent: ");
        sa10cent = reader.nextInt();

        System.out.print("Sa 20 cent: ");
        sa20cent = reader.nextInt();

        System.out.print("Sa 50 cent: ");
        sa50cent = reader.nextInt();

        System.out.print("Sa 1 Euro: ");
        sa1euro = reader.nextInt();

        System.out.print("Sa 2 Euro: ");
        sa2euro = reader.nextInt();




        System.out.println("-----------------------------------------");
        System.out.printf("Sa 1 centshe: %7d %10.2f EUR %n", sa1cent, sa1cent * 0.01);
        System.out.printf("Sa 2 centshe: %7d %10.2f EUR %n", sa2cent, sa2cent * 0.02);
        System.out.printf("Sa 5 centshe: %7d %10.2f EUR %n", sa5cent, sa5cent * 0.02);
        System.out.printf("Sa 10 centshe: %6d %10.2f EUR %n", sa10cent, sa10cent * 0.1);
        System.out.printf("Sa 20 centshe: %6d %10.2f EUR %n", sa20cent, sa20cent * 0.2);
        System.out.printf("Sa 50 centshe: %6d %10.2f EUR %n", sa50cent, sa50cent * 0.5);
        System.out.printf("Sa 1 Euro: %10d %10.2f EUR %n", sa1euro, sa1euro * 1.0);
        System.out.printf("Sa 2 Euro: %10d %10.2f EUR %n", sa2euro, sa2euro * 2.0);
        System.out.println("-----------------------------------------");
        System.out.printf("Totali: %24.2f EUR %n", (sa1cent * 0.01 + sa2cent * 0.02 + sa5cent*0.05 + sa10cent*0.1 + sa20cent*0.2 + sa50cent*0.5 + sa1euro*1.0 + sa2euro*2.0));
        System.out.println("-----------------------------------------");

    }
}
