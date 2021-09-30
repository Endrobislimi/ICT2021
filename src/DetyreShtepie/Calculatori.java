package DetyreShtepie;

import java.util.Scanner;

public class Calculatori {

    public static void main(String[] args) {
        Scanner numri = new Scanner(System.in);
        System.out.print("Shtyp numrin e pare ");
        int a = numri.nextInt();
        System.out.print("Shtyp numrin e dyte ");
        int b = numri.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}

