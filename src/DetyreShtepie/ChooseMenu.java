package DetyreShtepie;

import java.util.Scanner;

public class ChooseMenu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Menyte:");
        System.out.println("Per te perzgjedhur menyne File shtypni 1");
        System.out.println("Per te perzgjedhur menyne Edit shtypni 2");
        System.out.println("Per te perzgjedhur menyne View shtypni 3");
        System.out.println("Per te perzgjedhur menyne Help shtypni 4");
        System.out.println("Per te perzgjedhur menyne Tools shtypni 5");
        System.out.println("Per te dalur shtypni cilindo numer tjeter");
        System.out.println("----------------------------------------------");
        System.out.print("Shtypni nje numer: ");
        int numri = reader.nextInt();

        switch (numri) {
            case 1:
                System.out.println("Ju keni perzgjedhur menyne File");
                break;
            case 2:
                System.out.println("Ju keni perzgjedhur menyne Edit");
                break;
            case 3:
                System.out.println("Ju keni perzgjedhur menyne View");
                break;
            case 4:
                System.out.println("Ju keni perzgjedhur menyne Help");
                break;
            case 5:
                System.out.println("Ju keni perzgjedhur menyne Tools");
                break;
            default:
                System.out.println("EXIT. Ju faleminderit");
        }
    }
}
