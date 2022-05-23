package sprint2;

public class Concorrentes {
	
	private int qualificados;
	private int baixaQualificacao;
	private perfilCandidato perfilCandidato;
	private curriculoCandidato curriculoCandidato;
	
	
	// getters e setters
	

	public void setPerfilCandidato(perfilCandidato perfilCandidato) {
		this.perfilCandidato = perfilCandidato;
	}
	public int getQualificados() {
		return qualificados;
	}
	public void setQualificados(int qualificados) {
		this.qualificados = qualificados;
	}
	public int getBaixaQualificacao() {
		return baixaQualificacao;
	}
	public void setBaixaQualificacao(int baixaQualificacao) {
		this.baixaQualificacao = baixaQualificacao;
	}
	
	public curriculoCandidato getCurriculoCandidato() {
		return curriculoCandidato;
	}
	public void setCurriculoCandidato(curriculoCandidato curriculoCandidato) {
		this.curriculoCandidato = curriculoCandidato;
	}
	
	// metodos
	
	public int exibirIdCandidato() {
		return perfilCandidato.getId();
	}
	
	public perfilCandidato exibirPerfilCandidato() {
		return perfilCandidato;
	}
	
	public curriculoCandidato exibirCurriculo(curriculoCandidato curriculoCandidato)  {
		return curriculoCandidato;
	}
}
