package de.haeckel.tournamentcreator.model.planning;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TimoHäckel on 08.06.2017.
 */
public class PairingTables {


    public static List<List<IndexPair>> getForNumberOfPlayers (int numberOfPlayers) {
        switch (numberOfPlayers){
            case 3:
                return getPairingTable34();
            case 4:
                return getPairingTable34();

            case 5:
                return getPairingTable56();
            case 6:
                return getPairingTable56();

            case 7:
                return getPairingTable78();
            case 8:
                return getPairingTable78();

            default:
                return null;
        }
    }

    public static List<List<IndexPair>> getPairingTable78() {
        ArrayList<List<IndexPair>> rounds = new ArrayList<>();

        ArrayList<IndexPair> round1= new ArrayList<>();
        round1.add(new IndexPair(1,8));
        round1.add(new IndexPair(2,7));
        round1.add(new IndexPair(3,6));
        round1.add(new IndexPair(4,5));

        ArrayList<IndexPair> round2= new ArrayList<>();
        round2.add(new IndexPair(1,7));
        round2.add(new IndexPair(2,6));
        round2.add(new IndexPair(3,5));
        round2.add(new IndexPair(4,8));

        ArrayList<IndexPair> round3= new ArrayList<>();
        round3.add(new IndexPair(1,6));
        round3.add(new IndexPair(2,5));
        round3.add(new IndexPair(3,8));
        round3.add(new IndexPair(4,7));

        ArrayList<IndexPair> round4= new ArrayList<>();
        round4.add(new IndexPair(1,5));
        round4.add(new IndexPair(2,8));
        round4.add(new IndexPair(3,7));
        round4.add(new IndexPair(4,6));

        ArrayList<IndexPair> round5= new ArrayList<>();
        round5.add(new IndexPair(1,4));
        round5.add(new IndexPair(2,3));
        round5.add(new IndexPair(5,8));
        round5.add(new IndexPair(6,7));

        ArrayList<IndexPair> round6= new ArrayList<>();
        round6.add(new IndexPair(1,3));
        round6.add(new IndexPair(2,4));
        round6.add(new IndexPair(5,7));
        round6.add(new IndexPair(6,8));

        ArrayList<IndexPair> round7= new ArrayList<>();
        round7.add(new IndexPair(1,2));
        round7.add(new IndexPair(3,4));
        round7.add(new IndexPair(5,6));
        round7.add(new IndexPair(7,8));

        rounds.add(round1);
        rounds.add(round2);
        rounds.add(round3);
        rounds.add(round4);
        rounds.add(round5);
        rounds.add(round6);
        rounds.add(round7);

        return rounds;
    }

    public static List<List<IndexPair>> getPairingTable56() {
        ArrayList<List<IndexPair>> rounds = new ArrayList<>();

        ArrayList<IndexPair> round1= new ArrayList<>();
        round1.add(new IndexPair(1,6));
        round1.add(new IndexPair(2,5));
        round1.add(new IndexPair(3,4));

        ArrayList<IndexPair> round2= new ArrayList<>();
        round2.add(new IndexPair(1,5));
        round2.add(new IndexPair(2,4));
        round2.add(new IndexPair(3,6));

        ArrayList<IndexPair> round3= new ArrayList<>();
        round3.add(new IndexPair(1,4));
        round3.add(new IndexPair(2,3));
        round3.add(new IndexPair(5,6));

        ArrayList<IndexPair> round4= new ArrayList<>();
        round4.add(new IndexPair(1,3));
        round4.add(new IndexPair(2,6));
        round4.add(new IndexPair(4,5));

        ArrayList<IndexPair> round5= new ArrayList<>();
        round5.add(new IndexPair(1,2));
        round5.add(new IndexPair(3,5));
        round5.add(new IndexPair(4,6));

        rounds.add(round1);
        rounds.add(round2);
        rounds.add(round3);
        rounds.add(round4);
        rounds.add(round5);

        return rounds;
    }


    public static List<List<IndexPair>> getPairingTable34(){
        ArrayList<List<IndexPair>> rounds = new ArrayList<>();

        ArrayList<IndexPair> round1= new ArrayList<>();
        round1.add(new IndexPair(1,4));
        round1.add(new IndexPair(2,3));

        ArrayList<IndexPair> round2= new ArrayList<>();
        round2.add(new IndexPair(1,3));
        round2.add(new IndexPair(2,4));

        ArrayList<IndexPair> round3= new ArrayList<>();
        round3.add(new IndexPair(1,2));
        round3.add(new IndexPair(3,4));


        rounds.add(round1);
        rounds.add(round2);
        rounds.add(round3);

        return rounds;
    }
}
