package DetyreShtepie;

import java.util.Scanner;

public class NotaJuaj {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ju lutem shkruani piket qe keni arritur ne provim: ");
        int piket = reader.nextInt();

        if (piket<0) {
            System.out.println("Leje shkollen");
        }
        else if (piket>0 && piket<50) {
            System.out.println("Ju keni marrur noten 5");
        }
        else if (piket>=50 && piket<60) {
            System.out.println("Ju keni marrur noten 6");
        }
        else if (piket>=60 && piket<70) {
            System.out.println("Ju keni marrur noten 7");
        }
        else if (piket>=70 && piket<80) {
            System.out.println("Ju keni marrur noten 8");
        }
        else if (piket>=80 && piket<90) {
            System.out.println("Ju keni marrur noten 9");
        }else if (piket>=90 && piket<100) {
            System.out.println("Ju keni marrur noten 100");
        }
        else System.out.println("kah dole ti bre kaq i meqem");
    }
}
