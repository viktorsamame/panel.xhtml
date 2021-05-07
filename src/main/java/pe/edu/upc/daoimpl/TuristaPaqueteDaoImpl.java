package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITuristaPaqueteDao;
import pe.edu.upc.entity.TuristaPaquete;

public class TuristaPaqueteDaoImpl implements ITuristaPaqueteDao, Serializable {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(TuristaPaquete turistaPaquete) {
		try {
			em.persist(turistaPaquete);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TuristaPaquete> listar() {
		List<TuristaPaquete> lista = new ArrayList<TuristaPaquete>();
		try {
			Query q = em.createQuery("select tp from TuristaPaquete tp"); 
			lista = (List<TuristaPaquete>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idTuristaPaquete) {
		TuristaPaquete tp = new TuristaPaquete();
		try {
			tp = em.getReference(TuristaPaquete.class,idTuristaPaquete); 
			em.remove(tp);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
