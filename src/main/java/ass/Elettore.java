package ass;

public class Elettore {
	private String nome;
	private String cognome; 
	private String token;
	
	public Elettore(String nome, String cognome, String token) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.token = token;
	}
	
	public Elettore(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
}
