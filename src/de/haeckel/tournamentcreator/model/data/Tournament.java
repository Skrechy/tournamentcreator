package de.haeckel.tournamentcreator.model.data;

import de.haeckel.tournamentcreator.model.data.competition.Competition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TimoHäckel on 17.06.2017.
 */
public class Tournament extends ArrayList<Competition>{

    private String name;

    public Tournament(String name) {
        this.name = name;
    }

    public Tournament(String name, List<Competition> competitions) {
        this.name = name;
        this.addAll(competitions);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
