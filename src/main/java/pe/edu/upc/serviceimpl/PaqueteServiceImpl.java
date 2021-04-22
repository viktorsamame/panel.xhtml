package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IPaqueteDao;
import pe.edu.upc.entity.Paquete;
import pe.edu.upc.service.IMPaqueteService;

public class PaqueteServiceImpl implements IMPaqueteService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IPaqueteDao mD;

	@Override
	public void insertar(Paquete paquete) {
		mD.insertar(paquete);

	}

	@Override
	public List<Paquete> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPaquete) {
		mD.eliminar(idPaquete);

	}

}
