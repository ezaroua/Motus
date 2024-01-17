package fr.esgi.burger.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Commande {

	private Long id;
	private LocalDateTime dateHeureCreation;
	private boolean estSurPlace;
	private String burger;
	private String accompagnement;
	private String boisson;
	private String remarques;
	private List<String> sauces;
	private static Long compteur = 0L;

	public Commande() {
		id = ++compteur;
		dateHeureCreation = LocalDateTime.now();
		sauces = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(LocalDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public boolean isEstSurPlace() {
		return estSurPlace;
	}

	public void setEstSurPlace(boolean estSurPlace) {
		this.estSurPlace = estSurPlace;
	}

	public String getBurger() {
		return burger;
	}

	public void setBurger(String burger) {
		this.burger = burger;
	}

	public String getAccompagnement() {
		return accompagnement;
	}

	public void setAccompagnement(String accompagnement) {
		this.accompagnement = accompagnement;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

	public List<String> getSauces() {
		return sauces;
	}

	public void setSauces(List<String> sauces) {
		this.sauces = sauces;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accompagnement, boisson, burger, dateHeureCreation, estSurPlace, id, remarques, sauces);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		return Objects.equals(accompagnement, other.accompagnement) && Objects.equals(boisson, other.boisson)
				&& Objects.equals(burger, other.burger) && Objects.equals(dateHeureCreation, other.dateHeureCreation)
				&& estSurPlace == other.estSurPlace && Objects.equals(id, other.id)
				&& Objects.equals(remarques, other.remarques) && Objects.equals(sauces, other.sauces);
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateHeureCreation=" + dateHeureCreation + ", estSurPlace=" + estSurPlace
				+ ", burger=" + burger + ", accompagnement=" + accompagnement + ", boisson=" + boisson + ", remarques="
				+ remarques + ", sauces=" + sauces + "]";
	}

}