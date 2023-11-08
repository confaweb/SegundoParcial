package ar.edu.unlam.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.Dominio.BiometriaTipo;
import ar.edu.unlam.Dominio.Cliente;
import ar.edu.unlam.Dominio.Dispositivo;
import ar.edu.unlam.Dominio.Movil;
import ar.edu.unlam.Dominio.Pc;
import ar.edu.unlam.Dominio.SistemaOperativo;

public class TestingSegundoParcial {

	@Test
	public void queSepUedaCrearUnCliente() {
//		Preparacion-Entrada
		long cuit = 2024750578;
		String nombreYApelido = "Juan Perez";
//		Preceso
		Cliente cliente1 = new Cliente(cuit, nombreYApelido);	
//		Salida
		assertNotNull(cliente1);
	}

	@Test
	public void queSepUedaCrearUnDispositivo() {
//		Preparacion-Entrada
		long cuitCliente = 2024750578;
		Integer cpLocalidad = 1111;
		long ip = 12341234;
		SistemaOperativo so = null;
		// Preceso
		Dispositivo dispositivo1 = new Dispositivo(cuitCliente, so);
//		Salida
		assertNotNull(dispositivo1);
	}

	@Test
	public void queSepUedaCrearUnDispositivoPc() {
//		Preparacion-Entrada
		long cuitCliente = 2024750578;
		Integer cpLocalidad = 1111;
		long ip = 12341234;
		SistemaOperativo so = null;
		// Preceso
		Dispositivo dispositivo1 = new Pc(cuitCliente, so, ip, cpLocalidad);
//		Salida
		assertNotNull(dispositivo1);
	}

	@Test
	public void queSepUedaCrearUnDispositivoMovil() {
//		Preparacion-Entrada
		long cuitCliente = 2024750578;
		Integer cpLocalidad = 1111;
		long ip = 12341234;
		long imei = 12121212;
		SistemaOperativo so = null;
		BiometriaTipo biometria = null;
		// Preceso
		Dispositivo dispositivo1 = new Movil(cuitCliente, so, ip, cpLocalidad, imei, biometria);
//		Salida
		assertNotNull(dispositivo1);
	}
	@Test
	public void probandoGitHubAcessToken() {
//		Preparacion-Entrada
		long cuitCliente = 2024750578;
		Integer cpLocalidad = 1111;
		long ip = 12341234;
		long imei = 12121212;
		SistemaOperativo so = null;
		BiometriaTipo biometria = null;
		// Preceso
		Dispositivo dispositivo1 = new Movil(cuitCliente, so, ip, cpLocalidad, imei, biometria);
//		Salida
		assertNotNull(dispositivo1);
	}

}
