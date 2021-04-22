package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Paquete")
public class Paquete implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaquete;

	@Column(name = "nombrePaquete", nullable = false, length = 30)
	private String nombrePaquete;

	private Date fechaPaquete;

	public Paquete() {
		super();

	}

	public Paquete(int idPaquete, String nombrePaquete, Date fechaPaquete) {
		super();
		this.idPaquete = idPaquete;
		this.nombrePaquete = nombrePaquete;
		this.fechaPaquete = fechaPaquete;
	}

	public int getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(int idPaquete) {
		this.idPaquete = idPaquete;
	}

	public String getNombrePaquete() {
		return nombrePaquete;
	}

	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}

	public Date getFechaPaquete() {
		return fechaPaquete;
	}

	public void setFechaPaquete(Date fechaPaquete) {
		this.fechaPaquete = fechaPaquete;
	}

}
