package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITuristaDao;
import pe.edu.upc.entity.Turista;

public class TuristaDaoImpl implements ITuristaDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Turista turista) {
		em.persist(turista);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Turista> listar() {
		List<Turista> lista = new ArrayList<Turista>();
		Query q = em.createQuery("select m from Turista m");
		lista = (List<Turista>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idTurista) {
		Turista turista = new Turista();
		turista = em.getReference(Turista.class, idTurista);
		em.remove(turista);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Turista> findByDNITurista(Turista t) {
		List<Turista> lista = new ArrayList<Turista>();
		Query q = em.createQuery("from Turista t where t.dniTurista like ?1");
		q.setParameter(1, "%" + t.getDniTurista() + "%");
		List<Turista> resultList = (List<Turista>)q.getResultList();
		lista = resultList;
		return lista;
	}

}
