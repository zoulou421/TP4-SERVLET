package com.crud_product.Application;

import com.crud_product.dao.IProduit;
import com.crud_product.dao.ProduitImpl;
import com.crud_product.metier.entities.Produit;

public class TestApp {

	public static void main(String[] args) {
		IProduit pDao=new ProduitImpl();
		Produit p1=pDao.save(new Produit("Banane1",201,12));
		Produit p2=pDao.save(new Produit("Banane1",202,13));
		Produit p3=pDao.save(new Produit("Banane1",203,14));

	}

}
