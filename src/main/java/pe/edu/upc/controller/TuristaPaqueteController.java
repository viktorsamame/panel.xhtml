package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Turista;
import pe.edu.upc.entity.Paquete;
import pe.edu.upc.entity.TuristaPaquete;

import pe.edu.upc.service.ITuristaService;
import pe.edu.upc.service.IPaqueteService;
import pe.edu.upc.service.ITuristaPaqueteService;

@Named
@RequestScoped
public class TuristaPaqueteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITuristaService tService;
	
	@Inject
	private IPaqueteService pService;
	
	@Inject
	private ITuristaPaqueteService tpService;
				
	private Turista turista;
	private Paquete paquete;
	private TuristaPaquete turistapaquete;
	
	List<Turista> listaTuristas;
	List<Paquete> listaPaquetes;
	List<TuristaPaquete> listaTuristaPaquetes;
	
	@PostConstruct
	public void init() {
		turista = new Turista();
		paquete = new Paquete();
		turistapaquete = new TuristaPaquete();
		
		listaTuristas = new ArrayList<Turista>();
		listaPaquetes = new ArrayList<Paquete>();
		listaTuristaPaquetes = new ArrayList<TuristaPaquete>(); 
		
		this.listTuristaPaquete();		
		this.listTurista();
		this.listPaquete();
	}
	
	public String nuevoTuristaPaquete() {
		this.setTuristapaquete(new TuristaPaquete());
		return "turistapaquete.xhtml";
	}
	
	public void insertar() {
		try {
			tpService.insertar(turistapaquete);
			limpiarTuristaPaquete();
			this.listTuristaPaquete();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listTuristaPaquete() {
		try {
			listaTuristaPaquetes= tpService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listTurista() {
		try {
			listaTuristas = tService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}

	public void listPaquete() {
		try {
			listaPaquetes = pService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
		
	public void limpiarTuristaPaquete() {
		this.init();
	}
	
	public void eliminar(TuristaPaquete turistapaquete) {
		try {
			tpService.eliminar(turistapaquete.getIdTuristaPaquete());
			this.listTuristaPaquete();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Turista getTurista() {
		return turista;
	}

	public void setTurista(Turista turista) {
		this.turista = turista;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}

	public TuristaPaquete getTuristapaquete() {
		return turistapaquete;
	}

	public void setTuristapaquete(TuristaPaquete turistapaquete) {
		this.turistapaquete = turistapaquete;
	}

	public List<Turista> getListaTuristas() {
		return listaTuristas;
	}

	public void setListaTuristas(List<Turista> listaTuristas) {
		this.listaTuristas = listaTuristas;
	}

	public List<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}

	public void setListaPaquetes(List<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}

	public List<TuristaPaquete> getListaTuristaPaquetes() {
		return listaTuristaPaquetes;
	}

	public void setListaTuristaPaquetes(List<TuristaPaquete> listaTuristaPaquetes) {
		this.listaTuristaPaquetes = listaTuristaPaquetes;
	}


	
	
}
