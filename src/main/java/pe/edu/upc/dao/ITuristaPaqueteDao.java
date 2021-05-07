package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.TuristaPaquete;

public interface ITuristaPaqueteDao {
	public void insertar(TuristaPaquete turistaPaquete);
	public List<TuristaPaquete> listar();
	public void eliminar(int idTuristaPaquete);
}
