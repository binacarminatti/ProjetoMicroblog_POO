package Entidades;

public class Administrador extends Usuarios {

	public Administrador(String nome, String email, String cpf) {
		super(nome, email, cpf);
		// TODO Auto-generated constructor stub
	}
	
	public void bloquearPruu (Pruu pruuBloqueado) {
		pruuBloqueado.setBloqueado(true);
	}
}
