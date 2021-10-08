package OOP.class_object;

public class LionelMessi {
    public static void main(String[] args) {

        FootballPlayers lionelMessi = new FootballPlayers();

        lionelMessi.setName("Lionel");
        lionelMessi.setLastName("Messi");
        System.out.println(lionelMessi.getName()+" "+lionelMessi.getLastName());
        lionelMessi.setAge(34);
        System.out.println("Age: "+lionelMessi.getAge());
        lionelMessi.setNationality("Argentina");
        System.out.println("Nationality: "+lionelMessi.getNationality());
        lionelMessi.setPosition("Right Winger");
        System.out.println("Position: "+lionelMessi.getPosition());
        lionelMessi.setCurrentClub("PSG");
        System.out.println("Current Club: "+lionelMessi.getCurrentClub());

    }
}
