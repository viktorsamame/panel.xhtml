package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IPaqueteDao;
import pe.edu.upc.entity.Paquete;
import pe.edu.upc.service.IPaqueteService;

public class PaqueteServiceImpl implements IPaqueteService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IPaqueteDao pD;

	@Override
	public void insertar(Paquete paquete) {
		pD.insertar(paquete);

	}

	@Override
	public List<Paquete> listar() {
		return pD.listar();
	}

	@Override
	public void eliminar(int idPaquete) {
		pD.eliminar(idPaquete);

	}
	
	@Override
	public List<Paquete> findBynombrePaquete(Paquete p) {
		return pD.findBynombrePaquete(p);
	}

}
