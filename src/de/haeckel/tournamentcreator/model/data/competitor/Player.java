package de.haeckel.tournamentcreator.model.data.competitor;

import java.io.Serializable;

/**
 * Created by Timo Haeckel on 09.12.2016.
 */
public class Player extends Competitor implements Serializable {

    private String lastName = "Unknown";

    private String firstName = "Unknown";

    private final static String createName(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    public Player(String firstName, String lastName, int handicap) {
        super(createName(firstName, lastName), handicap );
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Player setLastName(String lastName) {
        this.lastName = lastName;
        setName(createName(firstName, lastName));
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Player setFirstName(String firstName) {
        this.firstName = firstName;
        setName(createName(firstName, lastName));
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (!getLastName().equals(player.getLastName())) return false;
        return getFirstName().equals(player.getFirstName());
    }

    @Override
    public int hashCode() {
        int result = getLastName().hashCode();
        result = 31 * result + getFirstName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
