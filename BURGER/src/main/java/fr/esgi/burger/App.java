package fr.esgi.burger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.esgi.burger.business.Commande;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static List<Commande> commandes = new ArrayList<>();
    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 352);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

	public static List<Commande> getCommandes() {
		return commandes;
	}

	public static void setCommandes(List<Commande> commandes) {
		App.commandes = commandes;
	}

}