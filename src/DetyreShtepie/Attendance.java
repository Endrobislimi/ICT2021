package DetyreShtepie;

import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        //Emri Mbiemri
        //Numri i oreve
        //Pjesmarrja e studenteve
        //te kalkulohet pjesmarrja
        Scanner reader = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Emri dhe mbiemri i studentit: ");
        String emriDheMbiemri = reader.nextLine();
        System.out.print("Numri total i oreve: ");
        int numriTotalIOreve = reader.nextInt();
        System.out.print("Numri i oreve ku studenti " +emriDheMbiemri+" ka qene pjesmarres: ");
        double pjesmarrjaEStudentit = reader.nextInt();
        System.out.println("-------------------------------------------------------------------");

        double perqindjaEPjesmarrjes = ((pjesmarrjaEStudentit / numriTotalIOreve)*100);

        if (perqindjaEPjesmarrjes > 49 && perqindjaEPjesmarrjes < 100) {
            System.out.println("Studenti ploteson kriteret per provim");
        }
        else if (perqindjaEPjesmarrjes == 100) {
            System.out.println("Studenti ka 10 pike bonus");
        }
        else if (perqindjaEPjesmarrjes < 50) {
            System.out.println("Studenti nuk ploteson kriteret per provim");
        }
        else;
        System.out.println("-------------------------------------------------------------------");


    }
}
