package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Proveedor;

public interface IProveedorDao {
	public void insertar(Proveedor proveedor);

	public List<Proveedor> listar();

	public void eliminar(int idProveedor);
	
	public List<Proveedor> findByNombreProveedor(Proveedor p);
}
