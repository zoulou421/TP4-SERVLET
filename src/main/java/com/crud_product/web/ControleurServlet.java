package com.crud_product.web;

import java.io.IOException;

import com.crud_product.dao.IProduit;
import com.crud_product.dao.ProduitImpl;

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
		req.getRequestDispatcher("produits.jsp").forward(req, resp);
	}

}
