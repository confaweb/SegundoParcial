package ar.edu.unlam.Dominio;

import java.util.Objects;

public class Cliente {

	private long cuit;
	private String nombreYApellido;

	public Cliente(long cuit, String nombreYApelido) {
		this.cuit = cuit;
		this.nombreYApellido = nombreYApelido;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public String toString() {
		return "Cliente [cuit=" + cuit + ", nombreYApellido=" + nombreYApellido + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cuit == other.cuit;
	}

}
