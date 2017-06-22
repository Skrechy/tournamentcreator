package de.haeckel.tournamentcreator.model.planning;

import de.haeckel.tournamentcreator.model.data.competition.Group;
import de.haeckel.tournamentcreator.model.data.competition.Match;
import de.haeckel.tournamentcreator.model.data.competitor.Competitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TimoHäckel on 08.06.2017.
 */
public class GroupMatchCalculator {

    private Group group;

    public GroupMatchCalculator(Group group) {
        this.group = group;
    }

    public List<Match> getMatchesForRound(int round){
        if(round < 1 || round > getNumberOfRounds()){
            return null;
        }

        ArrayList<Match> matches = new ArrayList<>();

        List<List<IndexPair>> rounds = PairingTables.getForNumberOfPlayers(group.size());

        for (IndexPair indexPair : rounds.get(round-1)){
            int hostIndex = indexPair.index1;
            int guestIndex = indexPair.index2;
            if(hostIndex > group.size() || guestIndex > group.size()){
                continue;
            }
            Competitor host = group.get(hostIndex-1);
            Competitor guest = group.get(guestIndex-1);
            matches.add(new Match(host,guest));
        }

        return matches;
    }

    public List<Match> getAllMatches(){
        ArrayList<Match> matches = new ArrayList<>();

        List<List<IndexPair>> rounds = PairingTables.getForNumberOfPlayers(group.size());

        for (List<IndexPair> round : rounds) {
            for (IndexPair indexPair : round) {
                int hostIndex = indexPair.index1;
                int guestIndex = indexPair.index2;
                if(hostIndex > group.size() || guestIndex > group.size()){
                    continue;
                }
                Competitor host = group.get(hostIndex-1);
                Competitor guest = group.get(guestIndex-1);
                matches.add(new Match(host,guest));
            }
        }

        return matches;
    }

    public String toPrintString(){
        String ret = "";

        int numberOfRounds = getNumberOfRounds();
        for (int i = 1; i <= numberOfRounds ; i++){
            ret += "Round " + i + ":\n";
            List<Match> matches = getMatchesForRound(i);
            for (Match match: matches){
                ret += match.toPrintString() + "\n";
            }
            ret += "\n";
        }

        return ret;
    }

    public int getNumberOfRounds() {
        return group.size() - 1 + group.size()%2;
    }

}
