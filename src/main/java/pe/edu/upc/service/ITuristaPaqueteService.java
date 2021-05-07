package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TuristaPaquete;

public interface ITuristaPaqueteService {
	public void insertar(TuristaPaquete turistaPaquete);
	public List<TuristaPaquete> listar();
	public void eliminar(int idTuristaPaquete);
}
