package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Guia;

public interface IGuiaService {
	public void insertar(Guia guia);

	public List<Guia> listar();

	public void eliminar(int idGuia);
	
	public List<Guia> findByDNIGuia(Guia g);
}
