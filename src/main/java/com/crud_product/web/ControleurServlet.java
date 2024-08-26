package com.crud_product.web;

import java.io.IOException;
import java.util.List;

import com.crud_product.dao.IProduit;
import com.crud_product.dao.ProduitImpl;
import com.crud_product.metier.entities.Produit;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ControleurServlet extends HttpServlet{
	private IProduit metier;
	
	@Override
	public void init() throws ServletException {
		metier=new ProduitImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path=req.getServletPath();
		if(path.equals("/index.do")) {
			req.getRequestDispatcher("produits.jsp").forward(req, resp);
		}
		else if(path.equals("/chercher.do")) {
			String motCle=req.getParameter("motCle");
			ProduitModel model=new ProduitModel();
			model.setMotCle(motCle);
			List<Produit>produits=metier.produitsParMC("%"+motCle+"%");
			model.setProduits(produits);
			req.setAttribute("model", model);
			req.getRequestDispatcher("produits.jsp").forward(req, resp);
		}
	}
	
}
