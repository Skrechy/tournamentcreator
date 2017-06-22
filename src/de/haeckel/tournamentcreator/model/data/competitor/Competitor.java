package de.haeckel.tournamentcreator.model.data.competitor;

/**
 * Created by TimoHäckel on 08.06.2017.
 */
public abstract class Competitor {

    private String name;

    private int handicap = 0;

    private String competition;

    public Competitor(String name, int handicap) {
        this.name = name;
        this.handicap = handicap;
    }

    public String getName() {
        return name;
    }

    public int getHandicap() {
        return handicap;
    }

    public String getCompetition() {
        return competition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "name='" + name + '\'' +
                ", handicap=" + handicap +
                ", competition='" + competition + '\'' +
                '}';
    }

    public String toPrintString(){
        return name + " (" + handicap + ")";
    }
}
