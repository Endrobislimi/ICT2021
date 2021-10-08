package OOP.class_object;


public class CristianoRonaldo {
    public static void main(String[] args) {
        FootballPlayers cristianoRonaldo = new FootballPlayers();

        cristianoRonaldo.setName("Cristiano");
        cristianoRonaldo.setLastName("Ronaldo");
        System.out.println(cristianoRonaldo.getName()+" "+cristianoRonaldo.getLastName());
        cristianoRonaldo.setAge(36);
        System.out.println("Age: "+cristianoRonaldo.getAge());
        cristianoRonaldo.setNationality("Portugal");
        System.out.println("Nationality: "+cristianoRonaldo.getNationality());
        cristianoRonaldo.setPosition("Striker");
        System.out.println("Position: "+cristianoRonaldo.getPosition());
        cristianoRonaldo.setCurrentClub("Man UTD");
        System.out.println("Current Club: "+cristianoRonaldo.getCurrentClub());

    }
}
