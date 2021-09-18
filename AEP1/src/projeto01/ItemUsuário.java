package projeto01;

import java.util.ArrayList;
import java.util.List;

public class ItemUsu�rio {
	
	private int numero;
	private List<Usu�rio> user = new ArrayList<>();

	
	public ItemUsu�rio(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void cadastrarUsu�rio(Usu�rio novo) {
		boolean usu�rioJaExiste = false;
		
		for(Usu�rio x: user) {
			if(x.getLogin() == novo.getLogin() || x.getEmail() == novo.getEmail()) {
				usu�rioJaExiste = true;
				break;
			}
		}
		if(usu�rioJaExiste) {
			throw new RuntimeException("Login ou E-mail j� cadastrados.");
		}
		this.user.add(novo);
	}
	
	public boolean verificarLogin(String login, String senha) {
		boolean usu�rioCorreto = false;
		for (int i = 0; i < user.size(); i++) {
			if(login.equals(user) && senha.equals(user)) {
				usu�rioCorreto = true;
				break;
			}
		}
		return usu�rioCorreto;
	}
}
