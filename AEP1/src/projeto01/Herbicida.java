package projeto01;

public class Herbicida {
	
	
	private String nome;
	private String grupoPertencente;
	private Boolean ÈSeletivo;
	private ErvaDaninha ervaDaninhaEmQueFazEfeito;
	private Imagens imagem;
	
	public Herbicida(String nome, String grupoPertencente, Boolean ÈSeletivo, ErvaDaninha ervaDaninhaEmQueFazEfeito, Imagens imagem) {
		this.nome = nome;
		this.grupoPertencente = grupoPertencente;
		this.ÈSeletivo = ÈSeletivo;
		this.ervaDaninhaEmQueFazEfeito = ervaDaninhaEmQueFazEfeito;
		this.imagem = imagem;
	}
	
	
	public String getNome() {
		if(nome == null) {
			throw new RuntimeException ("Nome n„o pode ser nulo");
		}
		return nome;
	}
	
	public String getGrupoPertencente() {
		if (grupoPertencente == null) {
			throw new RuntimeException("Grupo pertencente n„o pode ser nulo");
		}
		return grupoPertencente;
	}
	
	public Boolean getÈSeletivo() {
		return ÈSeletivo;
	}
	
	public ErvaDaninha getErvaDaninhaEmQueFazEfeito() {
		return ervaDaninhaEmQueFazEfeito;
	}
	
	public Imagens getImagem() {
		return imagem;
	}
}
