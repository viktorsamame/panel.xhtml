package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDeclaracionDao;
import pe.edu.upc.entity.Declaracion;

public class DeclaracionDaoImpl implements IDeclaracionDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Declaracion declaracion) {
		em.persist(declaracion);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Declaracion> listar() {
		List<Declaracion> lista = new ArrayList<Declaracion>();
		Query q = em.createQuery("select d from Declaracion d");
		lista = (List<Declaracion>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idDeclaracion) {
		Declaracion declaracion = new Declaracion();
		declaracion = em.getReference(Declaracion.class, idDeclaracion);
		em.remove(declaracion);

	}
	

}
