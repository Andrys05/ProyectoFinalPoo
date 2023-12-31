package logico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Consulta{

	private String codigo;
	private Paciente paciente;
	private Medico medico;
	private String descripcion;
	private Date fechaConsulta;
	private Enfermedad diagnostico;
	private String tratamiento;
	private Vacuna vacuna;
	
	
	public Consulta(String codigo, Paciente paciente, Medico medico, String descripcion, Date fechaConsulta,
			Enfermedad diagnostico, String tratamiento, Vacuna vacuna) {
		super();
		this.codigo = codigo;
		this.paciente = paciente;
		this.medico = medico;
		this.descripcion = descripcion;
		this.fechaConsulta = fechaConsulta;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.vacuna = vacuna;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public Enfermedad getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(Enfermedad diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public Vacuna getVacuna() {
		return vacuna;
	}
	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}

}
