package ui;

import dao.PacienteDAO;
import dao.PacienteJPADAO;

public class DAOGetLista {

	public static void main(String[] args) {
		PacienteDAO dao = new PacienteJPADAO();
		
		System.out.println(dao.getLista());
		
		
	}
}
