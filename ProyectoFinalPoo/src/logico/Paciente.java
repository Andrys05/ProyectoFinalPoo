package logico;

import java.io.Serializable;
import java.util.Date;

public class Paciente{
	/**
	 * 
	 */
	private String nombre;
	private String cedula;
	private String direccion;
	private Date fechaDeNacim;
	private char sexo;
	private String telefono;
	private boolean estado;
	private String contactoEmergencia;
	private String numEmergencia;
	private String alergias;

	

	public Paciente(String nombre, String cedula, String direccion, Date fechaDeNacim, char sexo, String telefono,
			boolean estado, String contactoEmergencia, String numEmergencia, String alergias) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.fechaDeNacim = fechaDeNacim;
		this.sexo = sexo;
		this.telefono = telefono;
		this.estado = estado;
		this.contactoEmergencia = contactoEmergencia;
		this.numEmergencia = numEmergencia;
		this.alergias = alergias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaDeNacim() {
		return fechaDeNacim;
	}

	public void setFechaDeNacim(Date fechaDeNacim) {
		this.fechaDeNacim = fechaDeNacim;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getContactoEmergencia() {
		return contactoEmergencia;
	}

	public void setContactoEmergencia(String contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}

	public String getNumEmergencia() {
		return numEmergencia;
	}

	public void setNumEmergencia(String numEmergencia) {
		this.numEmergencia = numEmergencia;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

}
