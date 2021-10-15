package DetyreShtepie;
//detyre shtepie
import java.util.Scanner;

public class SemaforiAdvanced {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numri = reader.nextInt();

        System.out.println(
                (numri==1)?"Semafor i kuq" : (numri==2) ? "Semafor i verdhe":(numri == 3) ? "Semafor i gjelbert":
                        (numri == 4) ? "Semafori duke blinkuar": "Semafori nuk punon" );
    }
}
