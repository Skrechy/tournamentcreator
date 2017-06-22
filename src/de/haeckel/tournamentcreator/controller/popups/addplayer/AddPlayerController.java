package de.haeckel.tournamentcreator.controller.popups.addplayer;

import de.haeckel.tournamentcreator.model.ModelReturnType;
import de.haeckel.tournamentcreator.model.data.Model;
import de.haeckel.tournamentcreator.model.data.competitor.Player;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by TimoHäckel on 22.06.2017.
 */
public class AddPlayerController {
    private Model model = Model.getInstance();

    @FXML
    private TextField handicapTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;


    @FXML
    public void onAddPlayerButtonPress (Event e) {
        boolean exit = false;


        //read all input params
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String handicapIn = handicapTextField.getText();


        //check inputs and process if needed
        int handicap = 0;
        try {
            handicap = Integer.parseInt(handicapIn);
        } catch (Exception exception){/*..*/ }

        if (firstName.isEmpty()){
            new Alert(Alert.AlertType.ERROR,"Bitte gebe einen Vornamen ein.").showAndWait();
        } else if (lastName.isEmpty()){
            new Alert(Alert.AlertType.ERROR,"Bitte gebe einen Nachnamen ein.").showAndWait();
        } else {

            //everything seems fine!
            //create object
            Player player = new Player(firstName, lastName, handicap);

            //get confirmation
            Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION,"Möchten sie den Spieler " + player.toPrintString() + " wirklich erstellen?");
            confirmation.showAndWait();
            ButtonType confirmationResult = confirmation.getResult();
            if (!confirmationResult.getButtonData().equals(ButtonBar.ButtonData.OK_DONE)){
                return;
            }


            //pass to model and check return
            ModelReturnType modelResult = model.addPlayer(player);
            if (modelResult.equals(ModelReturnType.ALREADY_EXISTS)){
                new Alert(Alert.AlertType.WARNING,"Spieler ist bereits in der Liste.").showAndWait();
            } else if (modelResult.equals(ModelReturnType.OK)){
                exit = true;
            } else {
                new Alert(Alert.AlertType.ERROR,"Spieler konnte nicht hinzugefügt werden.").showAndWait();
            }


        }

        //exit if everything is ok
        if (exit){
            exit(e);
        }

    }

    private void exit(Event e) {
        // everything is ok so exit
        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void onAbortButtonPress (Event e) {
        exit(e);
    }

}
