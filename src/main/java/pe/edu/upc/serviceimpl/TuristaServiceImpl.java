package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.ITuristaDao;
import pe.edu.upc.entity.Turista;
import pe.edu.upc.service.ITuristaService;

public class TuristaServiceImpl implements ITuristaService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private ITuristaDao tD;

	@Override
	public void insertar(Turista turista) {
		tD.insertar(turista);

	}

	@Override
	public List<Turista> listar() {
		return tD.listar();
	}

	@Override
	public void eliminar(int idTurista) {
		tD.eliminar(idTurista);

	}
	
	public List<Turista> findByDNITurista(Turista t){
		return tD.findByDNITurista(t);
	}

}
