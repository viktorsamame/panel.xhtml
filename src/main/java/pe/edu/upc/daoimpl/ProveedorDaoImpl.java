package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProveedorDao;
import pe.edu.upc.entity.Proveedor;

public class ProveedorDaoImpl implements IProveedorDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Proveedor proveedor) {
		em.persist(proveedor);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Proveedor> listar() {
		List<Proveedor> lista = new ArrayList<Proveedor>();
		Query q = em.createQuery("select m from Proveedor m");
		lista = (List<Proveedor>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idProveedor) {
		Proveedor proveedor = new Proveedor();
		proveedor = em.getReference(Proveedor.class, idProveedor);
		em.remove(proveedor);

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Proveedor> findByNombreProveedor(Proveedor p) {
		List<Proveedor> lista = new ArrayList<Proveedor>();
		Query q = em.createQuery("from Proveedor p where p.nombreProveedor like ?1");
		q.setParameter(1, "%" + p.getNombreProveedor() + "%");
		lista = (List<Proveedor>)q.getResultList();
		return lista;
	}

}
