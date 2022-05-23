package sprint2;

public class Vaga {
	private String nomeVaga;
	private String cargo;
	private int salario;
	private int benerficios;
	private String requisitos;
	private String descricaoVaga;
	private descricaoEmpresa descricaoEmpresa;
	private perfilRecrutador perfilRecrutador;
	
	
	public String getNomeVaga() {
		return nomeVaga;
	}
	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getBenerficios() {
		return benerficios;
	}
	public void setBenerficios(int benerficios) {
		this.benerficios = benerficios;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public String getDescricaoVaga() {
		return descricaoVaga;
	}
	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}
	public descricaoEmpresa getDescricaoEmpresa() {
		return descricaoEmpresa;
	}
	public void setDescricaoEmpresa(descricaoEmpresa descricaoEmpresa) {
		this.descricaoEmpresa = descricaoEmpresa;
	}
	public perfilRecrutador getPerfilRecrutador() {
		return perfilRecrutador;
	}
	public void setPerfilRecrutador(perfilRecrutador perfilRecrutador) {
		this.perfilRecrutador = perfilRecrutador;
	}
	
	// metodos
	
	public descricaoEmpresa exibirDescricaoEmpresa(descricaoEmpresa descricaoEmpresa) {
		return descricaoEmpresa;
	}
	
	public String exibirDescricaoVaga() {
		return descricaoVaga;
	}
	
	public perfilRecrutador exibirPerfilRecrutador() {
		return perfilRecrutador;
	}
	
}
