package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IProveedorDao;
import pe.edu.upc.entity.Proveedor;
import pe.edu.upc.service.IProveedorService;

public class ProveedorServiceImpl implements IProveedorService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IProveedorDao pD;

	@Override
	public void insertar(Proveedor proveedor) {
		pD.insertar(proveedor);

	}

	@Override
	public List<Proveedor> listar() {
		return pD.listar();
	}

	@Override
	public void eliminar(int idProveedor) {
		pD.eliminar(idProveedor);

	}
	
	public List<Proveedor> findByNombreProveedor(Proveedor p){
		return pD.findByNombreProveedor(p);
	}

}
