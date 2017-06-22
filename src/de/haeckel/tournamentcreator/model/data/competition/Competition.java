package de.haeckel.tournamentcreator.model.data.competition;

import de.haeckel.tournamentcreator.model.data.competitor.Competitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TimoHäckel on 17.06.2017.
 */
public abstract class Competition extends ArrayList<Competitor> {

    private String name;

    public Competition(String name) {
        this.name = name;
    }

    public Competition(String name, List<Competitor> competitors) {
        this.name = name;
        this.addAll(competitors);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
