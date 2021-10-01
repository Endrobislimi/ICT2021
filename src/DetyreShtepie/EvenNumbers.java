package DetyreShtepie;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int vleraENumritN;
        Scanner reader = new Scanner(System.in);
        System.out.print("Ju lutem shkruani vleren e numrit N: ");
        vleraENumritN = reader.nextInt();
        int i = 2;

        System.out.print("Numrat cift deri tek "+vleraENumritN+": ");

        while(i<=vleraENumritN)
        {

            System.out.print(i +" ");

            i=i+2;
        }
    }
}
