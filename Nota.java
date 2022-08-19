package br.unicentro.TrabFinal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codigo;
	private String notaFinal;
	private String numeroFaltas;
	
	
	
	public Nota(String codigo, String notaFinal, String numeroFaltas) {
		this.codigo = codigo;
		this.notaFinal = notaFinal;
		this.numeroFaltas = numeroFaltas;
		
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNotaFinal() {
		return notaFinal;
	}


	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}


	public String getNumeroFaltas() {
		return numeroFaltas;
	}


	public void setNumeroFaltas(String numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}
	
	
}