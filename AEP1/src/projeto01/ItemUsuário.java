package projeto01;

import java.util.ArrayList;
import java.util.List;

public class ItemUsuário {
	
	private int numero;
	private List<Usuário> user = new ArrayList<>();

	
	public ItemUsuário(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void cadastrarUsuário(Usuário novo) {
		boolean usuárioJaExiste = false;
		
		for(Usuário x: user) {
			if(x.getLogin() == novo.getLogin() || x.getEmail() == novo.getEmail()) {
				usuárioJaExiste = true;
				break;
			}
		}
		if(usuárioJaExiste) {
			throw new RuntimeException("Login ou E-mail já cadastrados.");
		}
		this.user.add(novo);
	}
	
	public boolean verificarLogin(String login, String senha) {
		boolean usuárioCorreto = false;
		for (int i = 0; i < user.size(); i++) {
			if(login.equals(user) && senha.equals(user)) {
				usuárioCorreto = true;
				break;
			}
		}
		return usuárioCorreto;
	}
}
