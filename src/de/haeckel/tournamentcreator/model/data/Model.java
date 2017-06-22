package de.haeckel.tournamentcreator.model.data;

import de.haeckel.tournamentcreator.model.ModelReturnType;
import de.haeckel.tournamentcreator.model.data.competitor.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TimoHäckel on 17.06.2017.
 */
public class Model {

    /********************************
     * SINGLETON PATTERN            *
     ********************************/
    private static Model instance = null;

    private Model (){
        players = new ArrayList<>();
        tournaments = new ArrayList<>();

    }

    public synchronized static Model getInstance() {
        if (instance == null){
            instance = new Model();
        }
        return instance;
    }


    /********************************
     * Object Variables             *
     ********************************/
    private List<Player> players;

    private List<Tournament> tournaments;



    /********************************
     * PLAYER GETTER AND SETTER     *
     ********************************/
    public synchronized List<Player> getPlayers() {
        return players;
    }

    public synchronized ModelReturnType addPlayer (Player player) {
        if (players.contains(player)){
            return ModelReturnType.ALREADY_EXISTS;
        }else if (players.add(player)){
            return ModelReturnType.OK;
        } else {
            return ModelReturnType.NOT_OK;
        }

    }

    public synchronized ModelReturnType deletePlayer (Player player) {
        if (players.remove(player)){
            return ModelReturnType.OK;
        } else {
            return ModelReturnType.DOESNT_EXIST;
        }
    }

    /********************************
     * TURNAMENT GETTER AND SETTER  *
     ********************************/
    public synchronized List<Tournament> getTournaments() {
        return tournaments;
    }

    public synchronized ModelReturnType addTournament (Tournament tournament) {
        if (tournaments.contains(tournament)){
            return ModelReturnType.ALREADY_EXISTS;
        } else if (tournaments.add(tournament)){
            return ModelReturnType.OK;
        } else {
            return ModelReturnType.NOT_OK;
        }
    }

    public synchronized ModelReturnType deleteTournament (Tournament tournament) {
        if (tournaments.remove(tournament)){
            return ModelReturnType.OK;
        } else {
            return ModelReturnType.DOESNT_EXIST;
        }
    }
}
