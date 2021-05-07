package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Proveedor;
import pe.edu.upc.service.IProveedorService;

@Named
@RequestScoped
public class ProveedorController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IProveedorService pService;
	private Proveedor proveedor;
	List<Proveedor> listaProveedores;

	@PostConstruct
	public void init() {
		this.listaProveedores = new ArrayList<Proveedor>();
		this.proveedor = new Proveedor();
		this.listar();
	}

	public String nuevoProveedor() {
		this.setProveedor(new Proveedor());
		return "proveedor.xhtml";
	}

	public void insertar() {
		pService.insertar(proveedor);
		limpiarProveedor();
	}

	public void listar() {
		listaProveedores = pService.listar();
	}

	public void limpiarProveedor() {
		this.init();
	}

	public void eliminar(Proveedor proveedor) {
		pService.eliminar(proveedor.getIdProveedor());
		this.listar();
	}
	
	public void findByNombreProveedor() {
		if (proveedor.getNombreProveedor().isEmpty()){
			this.listar();
		}
		else {
			listaProveedores = this.pService.findByNombreProveedor(this.getProveedor());
		}
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public List<Proveedor> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(List<Proveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

}
