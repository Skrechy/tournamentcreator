package de.haeckel.tournamentcreator.model.data.competition;

import de.haeckel.tournamentcreator.model.data.competitor.Competitor;

/**
 * Created by TimoHäckel on 08.06.2017.
 */
public class Match {


    private Competitor host;
    private Competitor guest;

    public Match(Competitor host, Competitor guest) {
        this.host = host;
        this.guest = guest;
    }

    public Competitor getHost() {
        return host;
    }

    public void setHost(Competitor host) {
        this.host = host;
    }

    public Competitor getGuest() {
        return guest;
    }

    public void setGuest(Competitor guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Match{" +
                "host=" + host +
                ", guest=" + guest +
                '}';
    }

    public String toPrintString(){
        return host.toPrintString() + " vs. " + guest.toPrintString();
    }
}
