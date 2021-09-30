package DetyreShtepie;

import java.util.Scanner;

public class LigjiNjutonit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masa: ");
        int masa = input.nextInt();
        System.out.print("Nxitimi: ");
        int nxitimi = input.nextInt();

        int forca = masa * nxitimi;
        System.out.println("Forca eshte e barabarte me " + forca);
    }
}
