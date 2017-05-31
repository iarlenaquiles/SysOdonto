package ui;

import dao.PacienteDAO;
import dao.PacienteJPADAO;
import model.Paciente;

public class DAOInsere {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		paciente.setId(1);
//		paciente.setNome("Iarlen");

		PacienteDAO dao = new PacienteJPADAO();

		//dao.adiciona(paciente);
		
		paciente.setNome("Jonas");
		dao.remove(paciente);
		System.out.println("removido");
	}

}
