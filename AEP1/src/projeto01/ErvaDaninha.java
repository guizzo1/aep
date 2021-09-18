package projeto01;

public class ErvaDaninha {
	
	
	private String nomeUsual;
	private String nomeCientifico;
	private String breveDescrição;
	private Herbicida herbicidaRecomendado;
	private Imagens imagem;

	//imagem;
	
	public ErvaDaninha(String nomeUsual, String nomeCientifico, String breveDescrição, Herbicida herbicidaRecomendado, Imagens imagem) {
		this.nomeUsual = nomeUsual;
		this.nomeCientifico = nomeCientifico;
		this.breveDescrição = breveDescrição;
		this.herbicidaRecomendado = herbicidaRecomendado;
		this.imagem = imagem;
	}
	
	public String getNomeUsual() {
		return nomeUsual;
	}
	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	
	public String getBreveDescrição() {
		return breveDescrição;
	}
	
	public Herbicida getHerbicidaRecomendado() {
		return herbicidaRecomendado;
	}
	
	public Imagens getImagem() {
		return imagem;
	}
}
