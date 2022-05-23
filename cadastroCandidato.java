package sprint2;

public class cadastroCandidato {
	private int id;
	private String email;
	private String senha;


// getters e setters

public int getId() {
		return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


public cadastroCandidato() {
	
}

public cadastroCandidato(int id, String email, String senha) {
	this.id = id;
	this.email = email;
	this.senha = senha;
	
}

}