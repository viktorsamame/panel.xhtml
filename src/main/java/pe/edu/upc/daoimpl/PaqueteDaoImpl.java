package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPaqueteDao;
import pe.edu.upc.entity.Paquete;

public class PaqueteDaoImpl implements IPaqueteDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Paquete paquete) {
		em.persist(paquete);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paquete> listar() {
		List<Paquete> lista = new ArrayList<Paquete>();
		Query q = em.createQuery("select m from Paquete m");
		lista = (List<Paquete>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idPaquete) {
		Paquete paquete = new Paquete();
		paquete = em.getReference(Paquete.class, idPaquete);
		em.remove(paquete);

	}

}
