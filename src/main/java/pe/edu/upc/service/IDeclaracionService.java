package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Declaracion;

public interface IDeclaracionService {
	public void insertar(Declaracion declaracion);

	public List<Declaracion> listar();

	public void eliminar(int idDeclaracion);
	

}
