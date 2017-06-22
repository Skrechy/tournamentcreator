package de.haeckel.tournamentcreator.controller;

import de.haeckel.tournamentcreator.model.data.Model;
import de.haeckel.tournamentcreator.view.popups.addplayer.AddPlayerPopup;

public class Controller {

    private Model model = Model.getInstance();

    public void onMenuEditAddPlayer(){
        try {
            AddPlayerPopup addPlayerPopup = new AddPlayerPopup(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
