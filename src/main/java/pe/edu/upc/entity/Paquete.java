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
	
	@Column(name = "precioPaquete", nullable = false, length = 5)
	private float precioPaquete;
	
	@Column(name = "numCupos", nullable = false, length = 2)
	private int numCupos;
	
	@Column(name = "lugarOrigen", nullable = false, length = 20)
	private String lugarOrigen;
	
	@Column(name = "lugarDestino", nullable = false, length = 20)
	private String lugarDestino;

	public Paquete() {
		super();
	}

	public Paquete(int idPaquete, String nombrePaquete, Date fechaPaquete, float precioPaquete, int numCupos,
			String lugarOrigen, String lugarDestino) {
		super();
		this.idPaquete = idPaquete;
		this.nombrePaquete = nombrePaquete;
		this.fechaPaquete = fechaPaquete;
		this.precioPaquete = precioPaquete;
		this.numCupos = numCupos;
		this.lugarOrigen = lugarOrigen;
		this.lugarDestino = lugarDestino;
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

	public float getPrecioPaquete() {
		return precioPaquete;
	}

	public void setPrecioPaquete(float precioPaquete) {
		this.precioPaquete = precioPaquete;
	}

	public int getNumCupos() {
		return numCupos;
	}

	public void setNumCupos(int numCupos) {
		this.numCupos = numCupos;
	}

	public String getLugarOrigen() {
		return lugarOrigen;
	}

	public void setLugarOrigen(String lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}

	public String getLugarDestino() {
		return lugarDestino;
	}

	public void setLugarDestino(String lugarDetino) {
		this.lugarDestino = lugarDetino;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaPaquete == null) ? 0 : fechaPaquete.hashCode());
		result = prime * result + idPaquete;
		result = prime * result + ((lugarDestino == null) ? 0 : lugarDestino.hashCode());
		result = prime * result + ((lugarOrigen == null) ? 0 : lugarOrigen.hashCode());
		result = prime * result + ((nombrePaquete == null) ? 0 : nombrePaquete.hashCode());
		result = prime * result + numCupos;
		result = prime * result + Float.floatToIntBits(precioPaquete);
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
		Paquete other = (Paquete) obj;
		if (fechaPaquete == null) {
			if (other.fechaPaquete != null)
				return false;
		} else if (!fechaPaquete.equals(other.fechaPaquete))
			return false;
		if (idPaquete != other.idPaquete)
			return false;
		if (lugarDestino == null) {
			if (other.lugarDestino != null)
				return false;
		} else if (!lugarDestino.equals(other.lugarDestino))
			return false;
		if (lugarOrigen == null) {
			if (other.lugarOrigen != null)
				return false;
		} else if (!lugarOrigen.equals(other.lugarOrigen))
			return false;
		if (nombrePaquete == null) {
			if (other.nombrePaquete != null)
				return false;
		} else if (!nombrePaquete.equals(other.nombrePaquete))
			return false;
		if (numCupos != other.numCupos)
			return false;
		if (Float.floatToIntBits(precioPaquete) != Float.floatToIntBits(other.precioPaquete))
			return false;
		return true;
	}
	
	
	
}
