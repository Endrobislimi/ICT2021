package DetyreShtepie;

import java.util.Scanner;

public class PlotepjestimiAdvanced {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani numrin e pare: ");
        int numri1 = reader.nextInt();
        System.out.print("Shkruani numrin e dyte: ");
        int numri2 = reader.nextInt();

        if (numri1%numri2==0)
            System.out.println("Numri i pare eshte i plotepjestueshem me numrin e dyte");

        else if (numri2 % numri1 == 0)
                System.out.println("Numri i dyte eshte i plotepjestueshem me numrin e pare");

        else
            System.out.println("Numrat nuk plotepjestohen");
    }
}
