package sprint2;

public class perfilRecrutador {
	
	private int idRecrutador;
	private String nome;
	private String areaAtuacao;
	private String emailCorporativo;
	private int telefone;
	private String novoPerfilRecrutador;
	private descricaoEmpresa descricaoEmpresa;
	
	
	// getters e setters
	
	public int getIdRecrutador() {
		return idRecrutador;
	}

	public void setIdRecrutador(int idRecrutador) {
		this.idRecrutador = idRecrutador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public String getEmailCorporativo() {
		return emailCorporativo;
	}

	public void setEmailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}

	public int getTelefoneContato() {
		return telefone;
	}

	public void setTelefoneContato(int telefone) {
		this.telefone = telefone;
	}

	// metodos
	
	public void atualizarPerfilRecrutador(String novoPerfilRecrutador) {
		this.novoPerfilRecrutador = novoPerfilRecrutador;
	}
	

	public perfilRecrutador() {
		
	}
	
	public perfilRecrutador(int idRecrutador, String nome, String areaAtuacao, String emailCorporativo, int telefone) {
		
		this.idRecrutador = idRecrutador;
		this.nome = nome;
		this.areaAtuacao = areaAtuacao;
		this.emailCorporativo = emailCorporativo;
		this.telefone = telefone;
	
		
	}
	

}
