package OOP.enums;

public class GradesTest {
    public static void main(String[] args) {

        System.out.println("-------------------");
        for (Grades grades: Grades.values()){
            grades.print();
        }
        System.out.println("-------------------");

    }
}
