package Cadastros;

//tabela pessoa sendo transformada em classe
public class Pessoa {
	private int    idPessoa;
	private String nomePessoa;
	private String email;
	//encapsulou dados via private, vai ter q usar setters/getters adiante
	
	public Pessoa() {	
	}
	//construtor para alteracao
	public Pessoa(String nomePessoa, String email) {
		super();//super tem que estar em caso de extends (Ta em pessoa dao)--pessoa dao extends dao
		this.nomePessoa = nomePessoa;
		this.email = email;
	}
	//construtor para inclusao
	public Pessoa(int idPessoa, String nomePessoa, String email) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", email=" + email + "]";
	}

	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;	
	}
}