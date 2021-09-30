package DetyreShtepie;

import java.util.Scanner;

public class ForcaKosove {
    public static void main(String[] args) {
        Scanner vlera = new Scanner(System.in);
        System.out.print("Ekipi vendas: ");
        String ekipiVendas = vlera.nextLine();
        System.out.print("Ekipi musafir: ");
        String ekipiMusafir = vlera.nextLine();
        System.out.print("Stadiumi: ");
        String stadiumi = vlera.nextLine();
        System.out.print("Numri i tifozeve: ");
        int numriITifozeve = vlera.nextInt();
        System.out.print("Sa gola ka shenuar "+ekipiVendas+": ");
        int golaEkipiVendas = vlera.nextInt();
        System.out.print("Sa gola ka shenuar "+ekipiMusafir+": ");
        int golaEkipiMusafir = vlera.nextInt();
        System.out.println("----------------------------------------------------------");
        System.out.println("REZULTATI PERFUNDIMTAR");
        System.out.println(ekipiVendas+" "+golaEkipiVendas+" - "+golaEkipiMusafir+" "+ekipiMusafir);
        System.out.println("Stadiumi: "+stadiumi+" me gjithsej "+numriITifozeve+" spektatore prezent");
        System.out.println("----------------------------------------------------------");

    }
}
