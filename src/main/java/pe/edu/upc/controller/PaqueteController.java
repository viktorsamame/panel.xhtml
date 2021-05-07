package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Paquete;
import pe.edu.upc.service.IPaqueteService;

@Named
@RequestScoped
public class PaqueteController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IPaqueteService pService;
	private Paquete paquete;
	List<Paquete> listaPaquetes;

	@PostConstruct
	public void init() {
		this.listaPaquetes = new ArrayList<Paquete>();
		this.paquete = new Paquete();
		this.listar();
	}

	public String nuevoPaquete() {
		this.setPaquete(new Paquete());
		return "paquete.xhtml";
	}

	public void insertar() {
		pService.insertar(paquete);
		limpiarPaquete();
	}

	public void listar() {
		listaPaquetes = pService.listar();
	}

	public void limpiarPaquete() {
		this.init();
	}

	public void eliminar(Paquete paquete) {
		pService.eliminar(paquete.getIdPaquete());
		this.listar();
	}

	public void findByNombrePaquete() {
		if (paquete.getNombrePaquete().isEmpty()) {
			this.listar();
		}
		else {
			listaPaquetes = this.pService.findBynombrePaquete(this.getPaquete());
		}
	}
	
	
	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}

	public List<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}

	public void setListaPaquetes(List<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}
	
	

}
