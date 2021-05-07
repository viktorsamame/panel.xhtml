package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Declaracion;
import pe.edu.upc.service.IDeclaracionService;

@Named
@RequestScoped
public class DeclaracionController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IDeclaracionService dService;
	private Declaracion declaracion;
	List<Declaracion> listaDeclaraciones;

	@PostConstruct
	public void init() {
		this.listaDeclaraciones = new ArrayList<Declaracion>();
		this.declaracion = new Declaracion();
		this.listar();
	}

	public String nuevoDeclaracion() {
		this.setDeclaracion(new Declaracion());
		return "declaracion.xhtml";
	}

	public void insertar() {
		dService.insertar(declaracion);
		limpiarDeclaracion();
	}

	public void listar() {
		listaDeclaraciones = dService.listar();
	}

	public void limpiarDeclaracion() {
		this.init();
	}

	public void eliminar(Declaracion declaracion) {
		dService.eliminar(declaracion.getIdDeclaracion());
		this.listar();
	}

	public IDeclaracionService getdService() {
		return dService;
	}

	public void setdService(IDeclaracionService dService) {
		this.dService = dService;
	}

	public Declaracion getDeclaracion() {
		return declaracion;
	}

	public void setDeclaracion(Declaracion declaracion) {
		this.declaracion = declaracion;
	}

	public List<Declaracion> getListaDeclaraciones() {
		return listaDeclaraciones;
	}

	public void setListaDeclaraciones(List<Declaracion> listaDeclaraciones) {
		this.listaDeclaraciones = listaDeclaraciones;
	}
	


}
