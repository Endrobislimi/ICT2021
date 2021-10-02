package DetyreShtepie;

import java.util.Scanner;

public class PlotepjestimiINumrave {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = reader.nextInt();

        if (nr1%nr2 == 0) {
            System.out.printf("%d eshte i plotepjestueshem me %d %n",nr1, nr2);
        }
        else {
            System.out.printf("%d nuk eshte i plotepjestueshem me %d %n",nr1, nr2);
        }

    }
}
