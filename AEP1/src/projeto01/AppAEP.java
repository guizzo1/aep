package projeto01;


public class AppAEP {
	public static void main(String[] args) {
		
		
		Herbicida glifosato = new Herbicida("Glifosato", "Amplo espectro", false, null, null);
		ErvaDaninha buva = new ErvaDaninha ("Buva", "Conyza", "Eudicotiledônea", null, null);
		ItemUsuário user01 = new ItemUsuário(1);
		ItemUsuário user02 = new ItemUsuário(2);
		user01.cadastrarUsuário(new Usuário("Guilherme", "guilherme@gmail.com", "admin", "1234"));
		user02.cadastrarUsuário(new Usuário("Vinicius", "vinicius@gmail.com", "vini", "1234"));

		System.out.println("======== ERVAS DANINHAS ========");
		System.out.println("Nome: " + buva.getNomeUsual());
		System.out.println("Nome Cientifico: " + buva.getNomeCientifico());
		System.out.println("Breve Descrição: " + buva.getBreveDescrição());	
		System.out.println("========== HERBICIDAS ==========");
		System.out.println("Nome: " + glifosato.getNome());
		System.out.println("Grupo: " + glifosato.getGrupoPertencente());
		
		if(glifosato.getéSeletivo() == true) {
			System.out.println("Seletivo.");
		}else {
			System.out.println("Não-Seletivo");
		}
		
		new Imagens();
	}
}

