package com.crud_product.dao;

import java.util.List;

import com.crud_product.metier.entities.Produit;

public interface IProduit {

	public Produit save(Produit p);
	public List<Produit>produitsParMC(String mc);
	public Produit getProduit(Long id);
	public Produit update(Produit p);
	public void deleteProduit(Long id);
}
