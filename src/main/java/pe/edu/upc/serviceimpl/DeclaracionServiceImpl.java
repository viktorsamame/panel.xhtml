package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IDeclaracionDao;
import pe.edu.upc.entity.Declaracion;
import pe.edu.upc.service.IDeclaracionService;

public class DeclaracionServiceImpl implements IDeclaracionService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IDeclaracionDao dD;

	@Override
	public void insertar(Declaracion declaracion) {
		dD.insertar(declaracion);

	}

	@Override
	public List<Declaracion> listar() {
		return dD.listar();
	}

	@Override
	public void eliminar(int idDeclaracion) {
		dD.eliminar(idDeclaracion);

	}

	
	
}
