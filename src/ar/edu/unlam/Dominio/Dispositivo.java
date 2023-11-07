package ar.edu.unlam.Dominio;

import java.util.Objects;

public class Dispositivo {

	protected long cuitCliente;
	protected SistemaOperativo so;

	public Dispositivo(long cuitCliente, SistemaOperativo so) {
		this.cuitCliente=cuitCliente;
		this.so=so;
	}

	public long getCuitCliente() {
		return cuitCliente;
	}

	public void setCuitCliente(long cuitCliente) {
		this.cuitCliente = cuitCliente;
	}

	public SistemaOperativo getSo() {
		return so;
	}

	public void setSo(SistemaOperativo so) {
		this.so = so;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuitCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return cuitCliente == other.cuitCliente;
	}

	@Override
	public String toString() {
		return "Dispositivo [cuitCliente=" + cuitCliente + ", so=" + so + "]";
	}

}
