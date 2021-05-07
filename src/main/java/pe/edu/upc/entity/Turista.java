package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Turista")
public class Turista implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTurista;

	@Column(name = "nombreTurista", nullable = false, length = 30)
	private String nombreTurista;

	@Column(name = "apellidoTurista", nullable = false, length = 30)
	private String apellidoTurista;
	
	@Column(name = "celularTurista", nullable = false, length = 9)
	private int celularTurista;

	@Column(name = "direccionTurista", nullable = false, length = 30)
	private String direccionTurista;

	@Column(name = "dniTurista", nullable = false, length = 8)
	private String dniTurista;

	@Column(name = "emailTurista", nullable = false, length = 30)
	private String emailTurista;

	public Turista() {
		super();
	}

	public Turista(int idTurista, String nombreTurista, String apellidoTurista, int celularTurista,
			String direccionTurista, String dniTurista, String emailTurista) {
		super();
		this.idTurista = idTurista;
		this.nombreTurista = nombreTurista;
		this.apellidoTurista = apellidoTurista;
		this.celularTurista = celularTurista;
		this.direccionTurista = direccionTurista;
		this.dniTurista = dniTurista;
		this.emailTurista = emailTurista;
	}

	public int getIdTurista() {
		return idTurista;
	}

	public void setIdTurista(int idTurista) {
		this.idTurista = idTurista;
	}

	public String getNombreTurista() {
		return nombreTurista;
	}

	public void setNombreTurista(String nombreTurista) {
		this.nombreTurista = nombreTurista;
	}

	public String getApellidoTurista() {
		return apellidoTurista;
	}

	public void setApellidoTurista(String apellidoTurista) {
		this.apellidoTurista = apellidoTurista;
	}

	public int getCelularTurista() {
		return celularTurista;
	}

	public void setCelularTurista(int celularTurista) {
		this.celularTurista = celularTurista;
	}

	public String getDireccionTurista() {
		return direccionTurista;
	}

	public void setDireccionTurista(String direccionTurista) {
		this.direccionTurista = direccionTurista;
	}

	public String getDniTurista() {
		return dniTurista;
	}

	public void setDniTurista(String dniTurista) {
		this.dniTurista = dniTurista;
	}

	public String getEmailTurista() {
		return emailTurista;
	}

	public void setEmailTurista(String emailTurista) {
		this.emailTurista = emailTurista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoTurista == null) ? 0 : apellidoTurista.hashCode());
		result = prime * result + celularTurista;
		result = prime * result + ((direccionTurista == null) ? 0 : direccionTurista.hashCode());
		result = prime * result + ((dniTurista == null) ? 0 : dniTurista.hashCode());
		result = prime * result + ((emailTurista == null) ? 0 : emailTurista.hashCode());
		result = prime * result + idTurista;
		result = prime * result + ((nombreTurista == null) ? 0 : nombreTurista.hashCode());
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
		Turista other = (Turista) obj;
		if (apellidoTurista == null) {
			if (other.apellidoTurista != null)
				return false;
		} else if (!apellidoTurista.equals(other.apellidoTurista))
			return false;
		if (celularTurista != other.celularTurista)
			return false;
		if (direccionTurista == null) {
			if (other.direccionTurista != null)
				return false;
		} else if (!direccionTurista.equals(other.direccionTurista))
			return false;
		if (dniTurista == null) {
			if (other.dniTurista != null)
				return false;
		} else if (!dniTurista.equals(other.dniTurista))
			return false;
		if (emailTurista == null) {
			if (other.emailTurista != null)
				return false;
		} else if (!emailTurista.equals(other.emailTurista))
			return false;
		if (idTurista != other.idTurista)
			return false;
		if (nombreTurista == null) {
			if (other.nombreTurista != null)
				return false;
		} else if (!nombreTurista.equals(other.nombreTurista))
			return false;
		return true;
	}

	

}
