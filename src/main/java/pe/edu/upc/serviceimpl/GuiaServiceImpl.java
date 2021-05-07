package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IGuiaDao;
import pe.edu.upc.entity.Guia;
import pe.edu.upc.service.IGuiaService;

public class GuiaServiceImpl implements IGuiaService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IGuiaDao gD;

	@Override
	public void insertar(Guia guia) {
		gD.insertar(guia);
	}

	@Override
	public List<Guia> listar() {
		return gD.listar();
	}

	@Override
	public void eliminar(int idGuia) {
		gD.eliminar(idGuia);
	}
	
	@Override
	public List<Guia> findByDNIGuia(Guia g) {
		return gD.findByDNIGuia(g);
	}	

}
