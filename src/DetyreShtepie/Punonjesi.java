package DetyreShtepie;

import java.util.Scanner;

public class Punonjesi {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani statusin martesor: | P(i/e martuar) | J(i/e pamartuar) |: ");
        String statusiMartesor = reader.nextLine();

        if (statusiMartesor.equalsIgnoreCase("P")){
            System.out.println("Statusi juaj: i/e martuar");
        }
        else if (statusiMartesor.equalsIgnoreCase("J")){
            System.out.println("Statusi juaj: i/e pamartuar");
        }
        else
            System.out.println("Ju keni dhene vleren gabim, ju lutem shtypni P ose J");

        System.out.print("Shkruani gjinine tuaj: | M(mashkull) | F(femer) |: ");
        String gjinia = reader.nextLine();

        if (gjinia.equalsIgnoreCase("F")) {
            System.out.println("Ju duhet te punoni vetem ne zonat urban");
        }
        else if (gjinia.equalsIgnoreCase("m")) {

            System.out.print("Ju lutem shkruani moshen tuaj: ");
            int mosha = reader.nextInt();
            if (mosha>=20 && mosha<=40) {
                System.out.println("Ju mund te punoni kudo");
            }
            else if (mosha>=40 && mosha<=60) {
                System.out.println("Ju mund te punoni vetem ne zonat urbane");
            }
            else
                System.out.println("Gabim");
        }
        else
            System.out.println("Gabim, ju lutem shtypni M ose F");
    }
}
