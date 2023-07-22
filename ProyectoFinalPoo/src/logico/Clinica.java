package logico;

import java.util.ArrayList;



public class Clinica {
	
	private ArrayList<Paciente> misPacientes;
	private ArrayList<Medico> misMedicos;
	private ArrayList<Cita> misCitas;
	private ArrayList<Vacuna> misVacunas;
	private int cant = 0;
	private int cantmax = 0;
	private String tipo;
	private String tipomax;
	
	/*
	private ArrayList<Consulta> misConsultas;
	private ArrayList<Enfermedad> misEnfermedades;
	*/
	private static Clinica clinic = null;
	
	public static Clinica getInstance() {
		if(clinic==null)
			clinic = new Clinica();
		return clinic;
		
	}

	
	public Clinica() {
		super();
		this.misPacientes = new ArrayList<Paciente>();
		this.misMedicos = new ArrayList<Medico>();
		//this.misConsultas = new ArrayList<Consulta>();
		 this.misCitas = new ArrayList<Cita>();
		//this.misEnfermedades = new ArrayList<Enfermedad>();
		this.misVacunas = new ArrayList<Vacuna>();
	}
	

	
	public ArrayList<Paciente> getMisPacientes() {
		return misPacientes;
	}

	public void setMisPacientes(ArrayList<Paciente> misPacientes) {
		this.misPacientes = misPacientes;
	}

	public ArrayList<Medico> getMisMedicos() {
		return misMedicos;
	}

	public void setMisMedicos(ArrayList<Medico> misMedis) {
		this.misMedicos = misMedis;
	}
	
	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}


	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}

	public void modificarPaciente(Paciente miPaciente) {
		int index = buscarIndexPacByCode(miPaciente.getCedula());
		misPacientes.set(index, miPaciente);
	}
	
	public void modiMed(Medico misMedis) {
		int cont = buscarIndexMedByCode(misMedis.getCedula());
		misMedicos.set(cont, misMedis);
	}

	public Paciente buscarPaciente(String idPaciente) {
		Paciente temp = null;
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<misPacientes.size()) {
			if(misPacientes.get(i).getCedula().equalsIgnoreCase(idPaciente)){
				temp = (Paciente) misPacientes.get(i);
				encontrado = true;
			}
			i++;
		}
		
		return temp;
	}
	
	
	public Medico buscarMedico(String cedu) {
		Medico temp = null;
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<misMedicos.size()) {
			if(misMedicos.get(i).getCedula().equalsIgnoreCase(cedu)){
				temp = misMedicos.get(i);
				encontrado = true;
			}
			i++;
		}
		
		return temp;
	}
	
	private int buscarIndexPacByCode(String codigo) {
		int aux = -1;
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<misPacientes.size()) {
			if(misPacientes.get(i).getCedula().equalsIgnoreCase(codigo)){
				aux = i;
				encontrado = true;
			}
			i++;
		}
		
		return aux;
	}
	
	private int buscarIndexMedByCode(String cedu) {
		int aux = -1;
		boolean encontrado = false;
		int i=0;
		while (i<misMedicos.size()&& !encontrado) {
			if(misMedicos.get(i).getCedula().equalsIgnoreCase(cedu)){
				encontrado = true;
				aux = i;
			}
			i++;
		}
		
		return aux;
	}
	

	public ArrayList<Cita> getMisCitas() {
		return misCitas;
	}


	public void setMisCitas(ArrayList<Cita> misCitas) {
		this.misCitas = misCitas;
	}

/*
	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}


	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}


	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}


	
*/
	
	public void insertarPaciente(Paciente miPaciente) {
		misPacientes.add(miPaciente);
	}
	
	public void insertarMedico(Medico misMedis) {
		misMedicos.add(misMedis);
	}
	
	public void eliminarMedico(Medico select) {
		int cont;
		cont = misMedicos.indexOf(select);
		misMedicos.remove(cont);
	}
	public void insertarVacuna(Vacuna misVacs) {
		misVacunas.add(misVacs);
	}
	
	/*vacuna
	private void vacunasUsadas(){
		for (Vacuna vac : misVacunas) {
			tipo = vac.getTipo();
			
			if(tipo != tipomax)
			{
				for (Vacuna vacs : misVacunas) {
					if(vacs.getTipo() == tipo)
						cant++;
				}	
			}
			
			if(cant > cantmax)
			{
				cantmax = cant;
				tipomax = tipo;
				cant = 0;
			}
				
	
		}
	}*/
}
