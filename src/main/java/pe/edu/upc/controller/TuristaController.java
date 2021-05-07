package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Turista;
import pe.edu.upc.service.ITuristaService;

@Named
@RequestScoped
public class TuristaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ITuristaService mService;
	private Turista turista;
	List<Turista> listaTuristas;

	@PostConstruct
	public void init() {
		this.listaTuristas = new ArrayList<Turista>();
		this.turista = new Turista();
		this.listar();
	}

	public String nuevoTurista() {
		this.setTurista(new Turista());
		return "turista.xhtml";
	}

	public void insertar() {
		mService.insertar(turista);
		limpiarTurista();
	}

	public void listar() {
		listaTuristas = mService.listar();
	}

	public void limpiarTurista() {
		this.init();
	}

	public void eliminar(Turista turista) {
		mService.eliminar(turista.getIdTurista());
		this.listar();
	}
	
	public void findByDNITurista() {
		if (turista.getDniTurista().isEmpty()){
			this.listar();
		}
		else {
			listaTuristas = this.mService.findByDNITurista(this.getTurista());
		}
	}

	public Turista getTurista() {
		return turista;
	}

	public void setTurista(Turista turista) {
		this.turista = turista;
	}

	public List<Turista> getListaTuristas() {
		return listaTuristas;
	}

	public void setListaTuristas(List<Turista> listaTuristas) {
		this.listaTuristas = listaTuristas;
	}

}
