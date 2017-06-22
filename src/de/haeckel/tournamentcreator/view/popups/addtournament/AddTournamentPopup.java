package de.haeckel.tournamentcreator.view.popups.addtournament;

import de.haeckel.tournamentcreator.model.data.Model;
import de.haeckel.tournamentcreator.view.popups.Popup;
import javafx.fxml.FXMLLoader;


/**
 * Created by TimoHäckel on 22.06.2017.
 */
public class AddTournamentPopup extends Popup{

    public AddTournamentPopup(Model model) throws Exception{
        super(FXMLLoader.load(AddTournamentPopup.class.getResource("AddTournamentPopup.fxml")), "Turnier erstellen");
    }
}
