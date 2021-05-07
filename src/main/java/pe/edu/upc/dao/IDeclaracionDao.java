package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Declaracion;

public interface IDeclaracionDao {
	public void insertar(Declaracion declaracion);
	
	public List<Declaracion> listar();

	public void eliminar(int idDeclaracion);
	
}