package dao;

import java.util.List;

import model.Paciente;

public interface PacienteDAO {

	void adiciona(Paciente paciente);

	public List<Paciente> getLista();

	void altera(Paciente paciente);

	void remove(Paciente paciente);

}
