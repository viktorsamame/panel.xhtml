package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="turista_paquete")
public class TuristaPaquete implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTuristaPaquete;
	
	@Column(name = "numParticipantes", nullable = false, length = 2)
	private int numParticipantes;
	
	@ManyToOne
	@JoinColumn(name="idTurista", nullable=false)
	private Turista turista;
	
	@ManyToOne
	@JoinColumn(name="idPaquete", nullable=false)
	private Paquete paquete;

	public TuristaPaquete() {
		super();
	}

	public TuristaPaquete(int idTuristaPaquete, int numParticipantes, Turista turista, Paquete paquete) {
		super();
		this.idTuristaPaquete = idTuristaPaquete;
		this.numParticipantes = numParticipantes;
		this.turista = turista;
		this.paquete = paquete;
	}

	public int getIdTuristaPaquete() {
		return idTuristaPaquete;
	}

	public void setIdTuristaPaquete(int idTuristaPaquete) {
		this.idTuristaPaquete = idTuristaPaquete;
	}

	public int getNumParticipantes() {
		return numParticipantes;
	}

	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
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

	

}
