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
@Table(name = "Declaracion")
public class Declaracion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDeclaracion;

	@Column(name = "juramento")
	private String juramento;
	
	private Date fechaDeclaracion;

	
	public Declaracion() {
		super();
	}

	public Declaracion(int idDeclaracion, String juramento, Date fechaDeclaracion) {
		super();
		this.idDeclaracion = idDeclaracion;
		this.juramento = juramento;
		this.fechaDeclaracion = fechaDeclaracion;
	}

	public int getIdDeclaracion() {
		return idDeclaracion;
	}

	public void setIdDeclaracion(int idDeclaracion) {
		this.idDeclaracion = idDeclaracion;
	}

	public String getJuramento() {
		return juramento;
	}

	public void setJuramento(String juramento) {
		this.juramento = juramento;
	}

	public Date getFechaDeclaracion() {
		return fechaDeclaracion;
	}

	public void setFechaDeclaracion(Date fechaDeclaracion) {
		this.fechaDeclaracion = fechaDeclaracion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaDeclaracion == null) ? 0 : fechaDeclaracion.hashCode());
		result = prime * result + idDeclaracion;
		result = prime * result + ((juramento == null) ? 0 : juramento.hashCode());
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
		Declaracion other = (Declaracion) obj;
		if (fechaDeclaracion == null) {
			if (other.fechaDeclaracion != null)
				return false;
		} else if (!fechaDeclaracion.equals(other.fechaDeclaracion))
			return false;
		if (idDeclaracion != other.idDeclaracion)
			return false;
		if (juramento == null) {
			if (other.juramento != null)
				return false;
		} else if (!juramento.equals(other.juramento))
			return false;
		return true;
	}

	
	
}
