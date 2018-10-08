package DesignPatterns.iterator;

public class FootballPlayer {

    private String name;
    private String lastName;
    private Position position;
    private int age;
    private String footballClub;

    public FootballPlayer(String name, String lastName, Position position, int age, String footballClub) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.footballClub = footballClub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(String footballClub) {
        this.footballClub = footballClub;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                ", age=" + age +
                ", footballClub='" + footballClub + '\'' +
                '}';
    }
}
