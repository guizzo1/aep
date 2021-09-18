package projeto01;

public class Herbicida {
	
	
	private String nome;
	private String grupoPertencente;
	private Boolean �Seletivo;
	private ErvaDaninha ervaDaninhaEmQueFazEfeito;
	private Imagens imagem;
	
	public Herbicida(String nome, String grupoPertencente, Boolean �Seletivo, ErvaDaninha ervaDaninhaEmQueFazEfeito, Imagens imagem) {
		this.nome = nome;
		this.grupoPertencente = grupoPertencente;
		this.�Seletivo = �Seletivo;
		this.ervaDaninhaEmQueFazEfeito = ervaDaninhaEmQueFazEfeito;
		this.imagem = imagem;
	}
	
	
	public String getNome() {
		if(nome == null) {
			throw new RuntimeException ("Nome n�o pode ser nulo");
		}
		return nome;
	}
	
	public String getGrupoPertencente() {
		if (grupoPertencente == null) {
			throw new RuntimeException("Grupo pertencente n�o pode ser nulo");
		}
		return grupoPertencente;
	}
	
	public Boolean get�Seletivo() {
		return �Seletivo;
	}
	
	public ErvaDaninha getErvaDaninhaEmQueFazEfeito() {
		return ervaDaninhaEmQueFazEfeito;
	}
	
	public Imagens getImagem() {
		return imagem;
	}
}
