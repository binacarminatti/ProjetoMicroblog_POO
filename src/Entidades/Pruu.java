package Entidades;

import java.util.Date;

public class Pruu {

	private String texto;
	private Date dataCriacao = new Date();
	private int totalLike;
	private boolean bloqueado;
	private Usuarios usuario;
	
	public String toString() {
		if(this.isBloqueado()) {
			return usuario.getNome() + ": " + usuario + " - Pruu: '" + texto + "'" + " Likes: " + totalLike;
		}else
			return "Pruu bloqueado!";
	}
	
	//Construtor
	public Pruu(String texto, Date dataCriacao, int totalLike, boolean bloqueado, Usuarios usuario) {
		super();
		if (quantidadeCaracteres(texto)) {
			this.texto = texto;
		}else {
			this.texto = "Tamanho de texto inválido para publicação!";
		}
		this.texto = texto;
		this.dataCriacao = dataCriacao;
		this.totalLike = totalLike;
		this.bloqueado = bloqueado;
		this.usuario = usuario;
	}
	
	
	//Métodos
	public void somarLike() {
		this.totalLike++;
		
	}
	
	public boolean quantidadeCaracteres(String texto) {
		int caracteres = texto.length();
		if (caracteres > 0 && caracteres < 301) {
			return true;
		}else {
			return false;
		}
		
	}

	//Getters and Setters
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public int getTotalLike() {
		return totalLike;
	}

	public void setTotalLike(int totalLike) {
		System.out.println("Likes: " + this.totalLike);
		this.totalLike += totalLike;
		System.out.println("Likes: " + this.totalLike);
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
}
