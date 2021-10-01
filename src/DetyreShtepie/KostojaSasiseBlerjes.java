package DetyreShtepie;

import java.util.Scanner;

public class KostojaSasiseBlerjes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sa njesi keni blere: ");
        int njesia = reader.nextInt();

        double sasia = njesia*100;

        if (sasia>1000) {
            double zbritja = sasia/10;
            double cmimi = sasia-zbritja;
            System.out.println("-------------------------------------------------");
            System.out.println("Ju keni pranuar: "+zbritja+" EUR zbritje");
            System.out.println("Qmimi total pas zbritjes: "+cmimi+" EUR");
            System.out.println("-------------------------------------------------");
        }
        else {
            System.out.println("-------------------------------------------------");
            System.out.println("Qmimi juaj: " + sasia + " EUR");
            System.out.println("-------------------------------------------------");
        }
    }
}
