package DetyreShtepie;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ju lutem shkruani nje numer nga 0 deri ne 10: ");
        int numri1 = reader.nextInt();

    int numri2 = (int) (Math.random()*11);


        if (numri1 == numri2) {
            System.out.println("Urime e keni qelluar");
        }
        else
            System.out.println("Fat herave tjera");

        System.out.println("Numri i gjeneruar nga programi: "+numri2);
}

}
