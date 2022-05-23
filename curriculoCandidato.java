package sprint2;

public class curriculoCandidato {
	private int id;
	private String objetivo;
	private int pretensaoSalarial;
	private String experiencia;
	private String formacao;
	private String especializacoes;
	private String resumo;
	private String novoCurriculo;
	
	
	public int getIdCandidato() {
		return id;
	}
	
	public void setIdCandidato(int id) {
		this.id = id;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public int getPretensaoSalarial() {
		return pretensaoSalarial;
	}
	public void setPretensaoSalarial(int pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getEspecializacoes() {
		return especializacoes;
	}
	public void setEspecializacoes(String especializacoes) {
		this.especializacoes = especializacoes;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	public void atualizarCurriculo(String novoCurriculo) {
		this.novoCurriculo = novoCurriculo;
	}
	
	public curriculoCandidato() {
		
	}
	
	public curriculoCandidato(String objetivo, int pretensaoSalarial, String experiencia, String formacao, String especializacoes, String resumo) {
		this.objetivo = objetivo;
		this.pretensaoSalarial = pretensaoSalarial;
		this.experiencia = experiencia;
		this.formacao = formacao;
		this.especializacoes = especializacoes;
		this.resumo = resumo;
	}
	
}
