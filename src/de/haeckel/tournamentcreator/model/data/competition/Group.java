package de.haeckel.tournamentcreator.model.data.competition;

import de.haeckel.tournamentcreator.model.data.competitor.Competitor;

import java.util.List;

/**
 * Created by TimoHäckel on 08.06.2017.
 */
public class Group extends Competition{


    public Group(String name) {
        super(name);
    }

    public Group(String name, List<Competitor> competitors) {
        super(name, competitors);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + getName() + '\'' +
                super.toString() +
                '}';
    }

    public String toPrintString(){
        String ret = getName() + ":\n";

        int counter = 0;
        for (Competitor competitor: this){
            counter ++;
            ret += counter + "\t" + competitor.toPrintString() + "\n";
        }

        return  ret;
    }
}
