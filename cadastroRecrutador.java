package sprint2;

public class cadastroRecrutador {

	private int idRecrutador;
	private String email;
	private String senha;
	
	// getters e setters
	
	public int getIdRecrutador() {
		return idRecrutador;
	}
	
	public void setIdRecrutador(int idRecrutador) {
		this.idRecrutador = idRecrutador;
	}
	
	public String getEmailRecrutador() {
		return email;
	}
	
	public void setEmailRecrutador(String email) {
		this.email = email;
	}
	
	
	public cadastroRecrutador() {
	
	
	}
	
	public cadastroRecrutador(int idRecrutador, String email, String senha) {
		this.idRecrutador = idRecrutador;
		this.email = email;
		this.senha = senha;
		
	}
}
