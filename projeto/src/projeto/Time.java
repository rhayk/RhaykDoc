package projeto;

public class Time {

	private String nome;
	private int pontos;
	private int jogos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getJogos() {
		return jogos;
	}
	public void setJogos(int jogos) {
		this.jogos = jogos;
	}
	public Time(String nome) {
		this.nome = nome;
		this.pontos = 0;
		this.jogos = 0;
	}
	
	
}
