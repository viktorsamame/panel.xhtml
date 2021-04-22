package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Paquete;

public interface IPaqueteDao {
	public void insertar(Paquete paquete);

	public List<Paquete> listar();

	public void eliminar(int idPaquete);
}
