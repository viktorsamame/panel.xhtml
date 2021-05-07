package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Paquete;

public interface IPaqueteService {
	public void insertar(Paquete paquete);

	public List<Paquete> listar();

	public void eliminar(int idPaquete);
	
	public List<Paquete> findBynombrePaquete(Paquete p);
}
