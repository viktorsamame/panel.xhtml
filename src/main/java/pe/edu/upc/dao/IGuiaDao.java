package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Guia;

public interface IGuiaDao {
	public void insertar(Guia guia);

	public List<Guia> listar();

	public void eliminar(int idGuia);
	
	public List<Guia> findByDNIGuia(Guia g);
}
