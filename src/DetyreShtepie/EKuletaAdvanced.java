package DetyreShtepie;

import java.util.Scanner;

public class EKuletaAdvanced {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sa5Euro, sa10Euro, sa20Euro, sa50euro, sa100Euro, sa200Euro, sa500Euro;

        System.out.print("Sa 5 euro: ");
        sa5Euro = reader.nextInt();
        System.out.print("Sa 10 euro: ");
        sa10Euro = reader.nextInt();
        System.out.print("Sa 20 euro: ");
        sa20Euro = reader.nextInt();
        System.out.print("Sa 50 euro: ");
        sa50euro = reader.nextInt();
        System.out.print("Sa 100 euro: ");
        sa100Euro = reader.nextInt();
        System.out.print("Sa 200 euro: ");
        sa200Euro = reader.nextInt();
        System.out.print("Sa 500 euro: "); //ska 500she haver
        sa500Euro = reader.nextInt();

        System.out.println("--------------------------------------------");
        System.out.printf("Sa 5 euro: %8d %10.2f EURO %n", sa5Euro, sa5Euro*5.0);
        System.out.printf("Sa 10 euro: %7d %10.2f EURO %n", sa10Euro, sa10Euro*10.0);
        System.out.printf("Sa 20 euro: %7d %10.2f EURO %n", sa20Euro, sa20Euro*20.0);
        System.out.printf("Sa 50 euro: %7d %10.2f EURO %n", sa500Euro, sa500Euro*50.0);
        System.out.printf("Sa 100 euro: %6d %10.2f EURO %n", sa100Euro, sa100Euro*100.0);
        System.out.printf("Sa 200 euro: %6d %10.2f EURO %n", sa200Euro, sa200Euro*200.0);
        System.out.printf("Sa 500 euro: %6d %10.2f EURO %n", sa500Euro, sa500Euro*500.0);
        System.out.println("--------------------------------------------");
        System.out.printf("Totali: %22.2f EURO %n", (sa5Euro*5.0+sa10Euro*10.0+sa20Euro*20.0+sa50euro*50.0+sa100Euro*100.0+sa200Euro*200.0+sa500Euro*500.0));
        System.out.println("--------------------------------------------");


    }
}
