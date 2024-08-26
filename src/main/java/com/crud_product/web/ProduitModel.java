package com.crud_product.web;

import java.util.ArrayList;
import java.util.List;

import com.crud_product.metier.entities.Produit;

public class ProduitModel {
	private String motCle;
	private List<Produit>produits=new ArrayList<Produit>();
	
	public String getMotCle() {
		return motCle;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	
	

}
