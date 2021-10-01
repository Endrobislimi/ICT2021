package DetyreShtepie;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        //Programi BMI ka per detyre qe te kalkuloj peshen
        //Ne baze te numrave qe merr nga perdoruesi ai duhet te na printoj pergjigje
        //se a eshte mbipeshe, nenpeshe apo eshte pesh normale(Healthy)//

        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruani peshen juaj: ");
        int pesha = reader.nextInt();
        System.out.print("Shkruani gjatesine tuaj: ");
        double gjatesia = reader.nextDouble();

        double bmi;
        bmi = pesha/Math.pow(gjatesia, 2);

        if (bmi>25.0) {
            System.out.println("Ju jeni i mbipeshe");
        }
        else if (bmi>18.5 && bmi<24.9) {
            System.out.println("Ju jeni healthy");
        }
        else
            System.out.println("Ju jeni nenpeshe");
    }
}
