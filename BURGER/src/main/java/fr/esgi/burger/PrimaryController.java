package fr.esgi.burger;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import fr.esgi.burger.business.Commande;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class PrimaryController implements Initializable {

	ObservableList<String> burgers = FXCollections.observableArrayList("CLELIA Burger", "Polenta Burger",
			"Rice Burger");

	ObservableList<String> accompagnements = FXCollections.observableArrayList("Frites", "Salade",
			"Onion Rings");
	
	ObservableList<String> boissons = FXCollections.observableArrayList("Badoit", "Coca-Cola",
			"Pepsi Cola", "Tropico");
	
	@FXML
	private RadioButton surPlaceRadioButton;
	
	@FXML
	private ToggleGroup lieuConsommation;
	
	@FXML 
	private ComboBox<String> burgerComboBox;
	
	@FXML 
	private ComboBox<String> accompagnementComboBox;
	
	@FXML 
	private ComboBox<String> boissonComboBox;
	
	@FXML
	private TextArea remarquesTextArea;
	
	@FXML
	private CheckBox ketchupCheckBox;

	@FXML
	private CheckBox mayonnaiseCheckBox;

	@FXML
	private CheckBox samouraiCheckBox;

	@FXML
	private void commander() throws IOException {
		Commande commande = new Commande();
		if (lieuConsommation.getSelectedToggle().equals(surPlaceRadioButton)) {
			commande.setEstSurPlace(true);
		}
		commande.setBurger(burgerComboBox.getValue());
		commande.setAccompagnement(accompagnementComboBox.getValue());
		commande.setBoisson(boissonComboBox.getValue());
		commande.setRemarques(remarquesTextArea.getText());
		if (ketchupCheckBox.isSelected()) {
			commande.getSauces().add("Ketchup");
		}
		if (mayonnaiseCheckBox.isSelected()) {
			commande.getSauces().add("Mayonnaise");
		}
		if (samouraiCheckBox.isSelected()) {
			commande.getSauces().add("Samouraï");
		}

		App.getCommandes().add(commande);
		System.out.println(App.getCommandes());
		App.setRoot("secondary");
	}

	// @Override est une annotation Java
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		surPlaceRadioButton.setSelected(true);
		
		//burgerComboBox.setValue("Polenta Burger");
		burgerComboBox.setItems(burgers);
		
		// On envoie à la liste déroulante la collection d'accompagnements
		accompagnementComboBox.setItems(accompagnements);
		
		boissonComboBox.setItems(boissons);
		
	}
}