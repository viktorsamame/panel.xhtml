package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IGuiaDao;
import pe.edu.upc.entity.Guia;

public class GuiaDaoImpl implements IGuiaDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Guia guia) {
		em.persist(guia);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Guia> listar() {
		List<Guia> lista = new ArrayList<Guia>();
		Query q = em.createQuery("select g from Guia g");
		lista = (List<Guia>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idGuia) {
		Guia guia = new Guia();
		guia = em.getReference(Guia.class, idGuia);
		em.remove(guia);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Guia> findByDNIGuia(Guia g) {
		List<Guia> lista = new ArrayList<Guia>();
		Query q = em.createQuery("from Guia g where g.dniGuia like ?1");
		q.setParameter(1, "%" + g.getDniGuia() + "%");
		lista = (List<Guia>)q.getResultList();
		return lista;
	}

}
