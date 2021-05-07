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
		try {
			em.persist(paquete);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paquete> listar() {
		List<Paquete> lista = new ArrayList<Paquete>();
		Query q = em.createQuery("select p from Paquete p");
		lista = (List<Paquete>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idPaquete) {
		Paquete paquete = new Paquete();
		paquete = em.getReference(Paquete.class, idPaquete);
		em.remove(paquete);
		try {
			paquete = em.getReference(Paquete.class,idPaquete); 
			em.remove(paquete);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Paquete> findBynombrePaquete(Paquete p) {
		List<Paquete> lista = new ArrayList<Paquete>();
		Query q = em.createQuery("from Paquete p where p.nombrePaquete like ?1");
		q.setParameter(1, "%" + p.getNombrePaquete() + "%");
		lista = (List<Paquete>)q.getResultList();
		return lista;
	}
}
