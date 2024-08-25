package com.crud_product.Application;

import java.util.List;

import com.crud_product.dao.IProduit;
import com.crud_product.dao.ProduitImpl;
import com.crud_product.metier.entities.Produit;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("TEST APP");
	
		IProduit pDao=new ProduitImpl();
		Produit p1=pDao.save(new Produit("Banane1",201,12));
		Produit p2=pDao.save(new Produit("Banane1",202,13));
		Produit p3=pDao.save(new Produit("Banane1",203,14));
		
		System.out.println("Cherchez tous les produits");
		List<Produit> prods=pDao.produitsParMC("%e2%");
		for(Produit p:prods) {
			System.out.println(p.toString());
		}

	}
}


