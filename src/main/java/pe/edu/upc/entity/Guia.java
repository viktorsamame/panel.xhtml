package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Guia")
public class Guia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGuia;

	@Column(name = "nombreGuia", nullable = false, length = 30)
	private String nombreGuia;
	
	@Column(name = "apellidoGuia", nullable = false, length = 40)
	private String apellidoGuia;

	@Column(name = "dniGuia", nullable = false, length = 8)
	private String dniGuia;
	
	@Column(name = "celularGuia", nullable = false, length = 9)
	private int celularGuia;
	
	@Column(name = "emailGuia", nullable = false, length = 30)
	private String emailGuia;

	public Guia() {
		super();
	}

	public Guia(int idGuia, String nombreGuia, String apellidoGuia, String dniGuia, int celularGuia,
			String emailGuia) {
		super();
		this.idGuia = idGuia;
		this.nombreGuia = nombreGuia;
		this.apellidoGuia = apellidoGuia;
		this.dniGuia = dniGuia;
		this.celularGuia = celularGuia;
		this.emailGuia = emailGuia;
	}

	public int getIdGuia() {
		return idGuia;
	}

	public void setIdGuia(int idGuia) {
		this.idGuia = idGuia;
	}

	public String getNombreGuia() {
		return nombreGuia;
	}

	public void setNombreGuia(String nombreGuia) {
		this.nombreGuia = nombreGuia;
	}

	public String getApellidoGuia() {
		return apellidoGuia;
	}

	public void setApellidoGuia(String apellidoGuia) {
		this.apellidoGuia = apellidoGuia;
	}

	public String getDniGuia() {
		return dniGuia;
	}

	public void setDniGuia(String dniGuia) {
		this.dniGuia = dniGuia;
	}

	public int getCelularGuia() {
		return celularGuia;
	}

	public void setCelularGuia(int celularGuia) {
		this.celularGuia = celularGuia;
	}

	public String getEmailGuia() {
		return emailGuia;
	}

	public void setEmailGuia(String emailGuia) {
		this.emailGuia = emailGuia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoGuia == null) ? 0 : apellidoGuia.hashCode());
		result = prime * result + celularGuia;
		result = prime * result + ((dniGuia == null) ? 0 : dniGuia.hashCode());
		result = prime * result + ((emailGuia == null) ? 0 : emailGuia.hashCode());
		result = prime * result + idGuia;
		result = prime * result + ((nombreGuia == null) ? 0 : nombreGuia.hashCode());
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
		Guia other = (Guia) obj;
		if (apellidoGuia == null) {
			if (other.apellidoGuia != null)
				return false;
		} else if (!apellidoGuia.equals(other.apellidoGuia))
			return false;
		if (celularGuia != other.celularGuia)
			return false;
		if (dniGuia == null) {
			if (other.dniGuia != null)
				return false;
		} else if (!dniGuia.equals(other.dniGuia))
			return false;
		if (emailGuia == null) {
			if (other.emailGuia != null)
				return false;
		} else if (!emailGuia.equals(other.emailGuia))
			return false;
		if (idGuia != other.idGuia)
			return false;
		if (nombreGuia == null) {
			if (other.nombreGuia != null)
				return false;
		} else if (!nombreGuia.equals(other.nombreGuia))
			return false;
		return true;
	}
}
