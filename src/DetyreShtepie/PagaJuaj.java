package DetyreShtepie;

import java.util.Scanner;

public class PagaJuaj {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ju lutem shkruani pagen tuaj: ");
        double paga = reader.nextDouble();

        if (paga == 0) {
            System.out.println("Pa page");
        }
        else if (paga > 0 && paga<180) {
            System.out.println("Social ose Pensioner");
        }
        else if (paga>180 && paga<300) {
            System.out.println("Page mesatare");
        }
        else if (paga>300 && paga<400) {
            System.out.println("Page e mire");
        }
        else if (paga>400 & paga<600) {
            System.out.println("Page mbi mesatare e mire");
        }
        else
            System.out.println("Page e larte, pse po don me leshu Kosoven");
    }
}
