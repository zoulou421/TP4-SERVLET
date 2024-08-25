package com.crud_product.metier.entities;

import java.io.Serializable;

public class Produit implements Serializable{
	private Long id;
	private String designation;
	private  double prix;
	private int quantite;
	public Produit() {
		super();
	}
	public Produit(String designation, double prix, int quantite) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
