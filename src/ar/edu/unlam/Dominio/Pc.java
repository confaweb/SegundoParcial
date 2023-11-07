package ar.edu.unlam.Dominio;

public class Pc extends Dispositivo {

	protected Integer cpLocalidad;
	protected long ip;

	public Pc(long cuitCliente, SistemaOperativo so, long ip, Integer cpLocalidad) {
		super(cuitCliente, so);
		super.cuitCliente=cuitCliente;
		super.so=so;
		this.ip=ip;
		this.cpLocalidad=cpLocalidad;
		
	}

	public Integer getCpLocalidad() {
		return cpLocalidad;
	}

	public void setCpLocalidad(Integer cpLocalidad) {
		this.cpLocalidad = cpLocalidad;
	}

	public long getIp() {
		return ip;
	}

	public void setIp(long ip) {
		this.ip = ip;
	}

}
