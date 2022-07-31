package Entidades;

import java.util.ArrayList;

public class Usuarios {
	
	private String nome;
	private String email;
	private String cpf;
	private ArrayList<Pruu> listaPruu = new ArrayList <Pruu>();
	
	//Construtor
	public Usuarios(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	//Métodos
	    //Guardar os Pruus em uma ArrayList
	public void enviaPruu(Pruu pruu) {
		listaPruu.add(pruu);
	}
	
	    //Mostrar todos os Pruu de todos usuários
	public void mostraPruus(ArrayList<Usuarios> listaUsuarios) {
		for (Usuarios usuario : listaUsuarios) {
			for (Pruu pruu : usuario.listaPruu) {
				System.out.println(pruu.toString());
			}
		}
	}
	
	    // Mostrar todos os Pruu de um usuário selecionado
	public void mostraPruus (Usuarios usuario) {
		for (Pruu pruu : usuario.listaPruu) {
			System.out.println(pruu.toString());
		}
	}
	
	    //Permitir o like
	public void like (Pruu pruuComLike) {
		pruuComLike.setTotalLike(1);
	}
	
	//Getters and setters
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public ArrayList<Pruu> getListaPruu() {
			return listaPruu;
		}

		public void setListaPruu(ArrayList<Pruu> listaPruu) {
			this.listaPruu = listaPruu;
		}

}
