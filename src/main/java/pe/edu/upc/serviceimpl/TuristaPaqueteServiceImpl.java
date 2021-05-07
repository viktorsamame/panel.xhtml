package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITuristaPaqueteDao;
import pe.edu.upc.entity.TuristaPaquete;
import pe.edu.upc.service.ITuristaPaqueteService;

@Named
@RequestScoped
public class TuristaPaqueteServiceImpl implements ITuristaPaqueteService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITuristaPaqueteDao tD;
	
	@Override
	public void insertar(TuristaPaquete turistapaquete) {
		tD.insertar(turistapaquete);
	}
	
	@Override
	public List<TuristaPaquete> listar() {
		return tD.listar();
	}
	
	@Override
	public void eliminar(int idTuristaPaquete) {
		tD.eliminar(idTuristaPaquete);
	}
}
