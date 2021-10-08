package OOP.class_object;

public class NeymarJR {
    public static void main(String[] args) {
        FootballPlayers neymarJR = new FootballPlayers();

        neymarJR.setName("Neymar");
        neymarJR.setLastName("Junior");
        System.out.println(neymarJR.getName()+" "+neymarJR.getLastName());
        neymarJR.setNationality("Brazil");
        System.out.println("Nationality: "+neymarJR.getNationality());
        neymarJR.setAge(30);
        System.out.println("Age: "+neymarJR.getAge());
        neymarJR.setPosition("Left Winger");
        System.out.println("Position: "+neymarJR.getPosition());
        neymarJR.setCurrentClub("PSG");
        System.out.println("Current club: "+neymarJR.getCurrentClub());
    }
}
