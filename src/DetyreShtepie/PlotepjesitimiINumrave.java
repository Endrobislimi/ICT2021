package DetyreShtepie;

import java.util.Scanner;

public class PlotepjesitimiINumrave {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ju lutem shkruani numrin e pare: ");
        int numri1 = reader.nextInt();
        System.out.print("Ju lutem shkruani numrin e dyte: ");
        int numri2 = reader.nextInt();

        if (numri1%numri2==0) {
            System.out.println(numri1+ " eshte i plotepjestueshem me "+numri2);
        }
        else
            System.out.println(numri1+" nuk eshte i plotepjestueshem me "+numri2);
    }
}
