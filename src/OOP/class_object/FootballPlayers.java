package OOP.class_object;

public class FootballPlayers {
    private String name;
    private String lastName;
    private String nationality;
    private int age;
    private String position;
    private String currentClub;

    FootballPlayers() {
        this.setName(name);
        this.setLastName(lastName);
        this.setNationality(nationality);
        this.setAge(age);
        this.setPosition(position);
        this.setCurrentClub(currentClub);
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNationality() {
        return nationality;
    }
    public String getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    }
    public String getCurrentClub() {
        return currentClub;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCurrentClub(String currentClub) {
        this.currentClub = currentClub;
    }
}
