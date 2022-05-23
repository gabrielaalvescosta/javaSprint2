package sprint2;

public class Login {
	private String email;
	private String senha;
	private cadastroRecrutador cadastroRecrutador;
	private cadastroCandidato cadastroCandidato;

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public cadastroRecrutador getCadastroRecrutador() {
		return cadastroRecrutador;
	}
	
	public cadastroCandidato getCadastroCandidato() {
		return cadastroCandidato;
	}
	
	Login() {
		
	}
	
	Login(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
}
