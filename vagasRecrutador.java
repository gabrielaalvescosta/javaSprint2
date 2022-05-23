package sprint2;

public class vagasRecrutador {
	private int idVaga;
	private int numVagas;
	private Vaga vaga;
	
	// getters e setters
	
	public int getIdVaga() {
		return idVaga;
	}
	public void setIdVaga(int idVaga) {
		this.idVaga = idVaga;
	}
	public int getNumVagas() {
		return numVagas;
	}
	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}
	
	// metodos
	
	public void criarNovaVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	
	public void deletarVaga(Vaga vaga) {
		this.vaga = null;
	}
	
	public Vaga exibirVaga() {
		return vaga;
	}

}
