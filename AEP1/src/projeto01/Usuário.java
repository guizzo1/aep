package projeto01;


public class Usu�rio {

	private String nome;
	private String email;
	private String login;
	private String senha;
	
	public Usu�rio(String nome, String email, String login, String senha) {
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}
	
	public String getNome() {
		if(nome == null) {
			throw new RuntimeException ("Nome n�o pode ser nulo");
		}
		return nome;
	}
	
	public String getEmail() {
		if(email == null){
			throw new RuntimeException ("E-mail n�o pode ser nulo");
		}
		return email;
	}
	
	public String getLogin() {
		if(login == null) {
			throw new RuntimeException ("Login n�o pode ser nulo");
		}
		return login;
	}
	
	public String getSenha() {
		if(senha == null) {
			throw new RuntimeException ("Senha n�o pode ser nulo");
		}
		return senha;

	}
}