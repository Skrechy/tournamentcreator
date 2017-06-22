package de.haeckel.tournamentcreator.view.popups;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by TimoHäckel on 22.06.2017.
 */
public abstract class Popup {
    private static final int DEF_WIDTH = 400;
    private static final int DEF_HEIGHT = 600;

    protected Parent root;
    protected Stage stage;
    protected Scene scene;


    public Popup (Parent root, String title) throws Exception{
        this.root = root;
        stage = new Stage();
        scene = new Scene(root);
//        scene.getStylesheets().add(
//                (Popup.class.getResource("Popup.css").toExternalForm()));

        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

}
