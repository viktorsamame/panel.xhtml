package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Proveedor;

public interface IProveedorService {
	public void insertar(Proveedor proveedor);

	public List<Proveedor> listar();

	public void eliminar(int idProveedor);
	
	public List<Proveedor> findByNombreProveedor(Proveedor p);
}
