package DetyreShtepie;


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shtypni vleren e numrit N: ");
        int N = reader.nextInt();

        for (int x =1; x<=N; x++) {
            double result;
            result = ((Math.pow(x, 2)) - (2*x) + 3)/((2*x)-1);
            System.out.println(result);
        }
    }
}
