package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Paciente;

public class PacienteJPADAO implements PacienteDAO {

	private EntityManagerFactory emf;
	private EntityManager em;

	public PacienteJPADAO() {
		this.emf = Persistence.createEntityManagerFactory("sysodonto");
		this.em = this.emf.createEntityManager();
	}

	@Override
	public void adiciona(Paciente paciente) {
		em.getTransaction().begin();
		em.persist(paciente);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Paciente> getLista() {
		List<Paciente> result = em.createQuery("from paciente", Paciente.class).getResultList();
		em.close();
		emf.close();
		return result;
	}

	@Override
	public void altera(Paciente paciente) {
		em.getTransaction().begin();
		em.merge(paciente);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void remove(Paciente paciente) {
		em.getTransaction().begin();
		Paciente encontrado = em.find(Paciente.class, paciente.getId());
		em.remove(encontrado);
		em.getTransaction().commit();
		em.close();
	}

}
