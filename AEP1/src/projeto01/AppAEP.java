package projeto01;


public class AppAEP {
	public static void main(String[] args) {
		
		
		Herbicida glifosato = new Herbicida("Glifosato", "Amplo espectro", false, null, null);
		ErvaDaninha buva = new ErvaDaninha ("Buva", "Conyza", "Eudicotiled�nea", null, null);
		ItemUsu�rio user01 = new ItemUsu�rio(1);
		ItemUsu�rio user02 = new ItemUsu�rio(2);
		user01.cadastrarUsu�rio(new Usu�rio("Guilherme", "guilherme@gmail.com", "admin", "1234"));
		user02.cadastrarUsu�rio(new Usu�rio("Vinicius", "vinicius@gmail.com", "vini", "1234"));

		System.out.println("======== ERVAS DANINHAS ========");
		System.out.println("Nome: " + buva.getNomeUsual());
		System.out.println("Nome Cientifico: " + buva.getNomeCientifico());
		System.out.println("Breve Descri��o: " + buva.getBreveDescri��o());	
		System.out.println("========== HERBICIDAS ==========");
		System.out.println("Nome: " + glifosato.getNome());
		System.out.println("Grupo: " + glifosato.getGrupoPertencente());
		
		if(glifosato.get�Seletivo() == true) {
			System.out.println("Seletivo.");
		}else {
			System.out.println("N�o-Seletivo");
		}
		
		new Imagens();
	}
}

