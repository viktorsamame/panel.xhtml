package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Guia;
import pe.edu.upc.service.IGuiaService;

@Named
@RequestScoped
public class GuiaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IGuiaService gService;
	private Guia guia;
	List<Guia> listaGuias;

	@PostConstruct
	public void init() {
		this.listaGuias = new ArrayList<Guia>();
		this.guia = new Guia();
		this.listar();
	}

	public String nuevoGuia() {
		this.setGuia(new Guia());
		return "guia.xhtml";
	}


	public void insertar() {
		gService.insertar(guia);
		limpiarGuia();
	}

	public void listar() {
		listaGuias = gService.listar();
	}

	public void limpiarGuia() {
		this.init();
	}

	public void eliminar(Guia guia) {
		gService.eliminar(guia.getIdGuia());
		this.listar();
	}
	
	public void findByDNIGuia() {
		if (guia.getDniGuia().isEmpty()){
			this.listar();
		}
		else {
			listaGuias = this.gService.findByDNIGuia(this.getGuia());
		}
	}
	
	public Guia getGuia() {
		return guia;
	}

	public void setGuia(Guia guia) {
		this.guia = guia;
	}

	public List<Guia> getListaGuias() {
		return listaGuias;
	}

	public void setListaGuias(List<Guia> listaGuias) {
		this.listaGuias = listaGuias;
	}

}
