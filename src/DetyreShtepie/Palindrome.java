package DetyreShtepie;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String  i = "";
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani nje emer: ");
        String emri = reader.nextLine();
        int n = emri.length();

        for(int index = n - 1; index >= 0; index--)
            i = i + emri.charAt(index);
        if(emri.equalsIgnoreCase(i))
        {
            System.out.println("Emri eshte palindrom");
        }
        else
        {
            System. out.println("Emri nuk eshte palindrom");
        }
    }
}
