package projeto01;

public class ErvaDaninha {
	
	
	private String nomeUsual;
	private String nomeCientifico;
	private String breveDescri��o;
	private Herbicida herbicidaRecomendado;
	private Imagens imagem;

	//imagem;
	
	public ErvaDaninha(String nomeUsual, String nomeCientifico, String breveDescri��o, Herbicida herbicidaRecomendado, Imagens imagem) {
		this.nomeUsual = nomeUsual;
		this.nomeCientifico = nomeCientifico;
		this.breveDescri��o = breveDescri��o;
		this.herbicidaRecomendado = herbicidaRecomendado;
		this.imagem = imagem;
	}
	
	public String getNomeUsual() {
		return nomeUsual;
	}
	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	
	public String getBreveDescri��o() {
		return breveDescri��o;
	}
	
	public Herbicida getHerbicidaRecomendado() {
		return herbicidaRecomendado;
	}
	
	public Imagens getImagem() {
		return imagem;
	}
}
