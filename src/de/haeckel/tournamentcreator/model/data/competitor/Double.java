package de.haeckel.tournamentcreator.model.data.competitor;

/**
 * Created by TimoHäckel on 08.06.2017.
 */
public class Double extends Competitor{

    private Player player1;
    private Player player2;

    public Double(Player player1, Player player2) {
        super ((player1.getName() + " / " + player2.getName()),(player1.getHandicap() + player2.getHandicap()));
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    @Override
    public String toString() {
        return "Double{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }

}
