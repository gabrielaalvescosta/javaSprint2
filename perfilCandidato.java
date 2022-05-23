package sprint2;

public class perfilCandidato {
	
	private int id;
	private String nome;
	private int idade;
	private String email;
	private int telefone;
	private int cpf;
	private String sexo;
	private String estadoCivil;
	private String endereco;
	private curriculoCandidato curriculo;
	private String novoPerfil;
	
	// getters e setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public curriculoCandidato getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(curriculoCandidato curriculo) {
		this.curriculo = curriculo;
	}
	
	// metodos
	
	public void atualizarPerfil(String novoPerfil) {
		this.setNovoPerfil(novoPerfil);
	}
	public String getNovoPerfil() {
		return novoPerfil;
	}
	public void setNovoPerfil(String novoPerfil) {
		this.novoPerfil = novoPerfil;
	}
	
	public perfilCandidato() {
		
	}
	
	public perfilCandidato(String nome, int idade, String email, int telefone, int cpf, String sexo, String estadoCivil, String endereco, curriculoCandidato curriculo) {
		this.nome = nome;
		this.idade= idade;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
		this.curriculo = curriculo;
	}


}
