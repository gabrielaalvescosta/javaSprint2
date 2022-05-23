package sprint2;

public class descricaoEmpresa {
	
	private String razaoSocial;
	private String nomeFantasia;
	private String ramo;
	private String porte;
	private String descricao;
	private String novaDescricaoEmpresa;
	
	
	// getters e setters
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	// metodos
	
	public void atualizarDescricaoEmpresa(String novaDescricaoEmpresa) {
		this.novaDescricaoEmpresa = novaDescricaoEmpresa;
	}
	
	public descricaoEmpresa() {
		
	}

	public descricaoEmpresa(String razaoSocial, String nomeFantasia, String ramo, String porte, String descricao) {
		
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.ramo = ramo;
		this.porte = porte;
		this.descricao = descricao;
		
	}

	
}

