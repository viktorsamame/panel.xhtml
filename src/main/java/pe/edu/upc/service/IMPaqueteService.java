package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Paquete;

public interface IMPaqueteService {
	public void insertar(Paquete paquete);

	public List<Paquete> listar();

	public void eliminar(int idPaquete);
}
