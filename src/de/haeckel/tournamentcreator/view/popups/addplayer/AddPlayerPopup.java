package de.haeckel.tournamentcreator.view.popups.addplayer;

import de.haeckel.tournamentcreator.model.data.Model;
import de.haeckel.tournamentcreator.view.popups.Popup;
import javafx.fxml.FXMLLoader;


/**
 * Created by TimoHäckel on 22.06.2017.
 */
public class AddPlayerPopup extends Popup{

    public AddPlayerPopup (Model model) throws Exception{
        super(FXMLLoader.load(AddPlayerPopup.class.getResource("AddPlayerPopup.fxml")), "Spieler Hinzufügen");

    }
}
