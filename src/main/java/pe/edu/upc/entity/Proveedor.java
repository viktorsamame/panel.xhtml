package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class Proveedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProveedor;

	@Column(name = "nombreProveedor", nullable = false, length = 30)
	private String nombreProveedor;
	
	@Column(name = "apellidoProveedor", nullable = false, length = 30)
	private String apellidoProveedor;

	@Column(name = "rucProveedor", nullable = false, length = 11)
	private String rucProveedor;

	@Column(name = "telefonoProveedor", nullable = false, length = 9)
	private int telefonoProveedor;

	public Proveedor() {
		super();
		
	}

	public Proveedor(int idProveedor, String nombreProveedor, String apellidoProveedor, String rucProveedor,
			int telefonoProveedor) {
		super();
		this.idProveedor = idProveedor;
		this.nombreProveedor = nombreProveedor;
		this.apellidoProveedor = apellidoProveedor;
		this.rucProveedor = rucProveedor;
		this.telefonoProveedor = telefonoProveedor;
	}
	
	

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getApellidoProveedor() {
		return apellidoProveedor;
	}

	public void setApellidoProveedor(String apellidoProveedor) {
		this.apellidoProveedor = apellidoProveedor;
	}

	public String getRucProveedor() {
		return rucProveedor;
	}

	public void setRucProveedor(String rucProveedor) {
		this.rucProveedor = rucProveedor;
	}

	public int getTelefonoProveedor() {
		return telefonoProveedor;
	}

	public void setTelefonoProveedor(int telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoProveedor == null) ? 0 : apellidoProveedor.hashCode());
		result = prime * result + idProveedor;
		result = prime * result + ((nombreProveedor == null) ? 0 : nombreProveedor.hashCode());
		result = prime * result + ((rucProveedor == null) ? 0 : rucProveedor.hashCode());
		result = prime * result + telefonoProveedor;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proveedor other = (Proveedor) obj;
		if (apellidoProveedor == null) {
			if (other.apellidoProveedor != null)
				return false;
		} else if (!apellidoProveedor.equals(other.apellidoProveedor))
			return false;
		if (idProveedor != other.idProveedor)
			return false;
		if (nombreProveedor == null) {
			if (other.nombreProveedor != null)
				return false;
		} else if (!nombreProveedor.equals(other.nombreProveedor))
			return false;
		if (rucProveedor == null) {
			if (other.rucProveedor != null)
				return false;
		} else if (!rucProveedor.equals(other.rucProveedor))
			return false;
		if (telefonoProveedor != other.telefonoProveedor)
			return false;
		return true;
	}



	

	

}
