/**
 * 
 */
package Principal;

import Entidades.Usuarios;
import Entidades.Pruu;
import Entidades.Administrador;

import java.util.Date;
import java.util.ArrayList;

public class PrincipalPruu {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Usuarios> listaUsuarios = new ArrayList<>();
		
		//Cadastrar usuários
		Usuarios marijane = new Usuarios ("Mariana", "mariana@gmail.com", "123.456.789-10");
		Usuarios banguela = new Usuarios ("Pretinho", "banguela@hotmail.com", "321.654.987-01");
		Administrador sabri = new Administrador ("Sabrina", "sabrinacarminatti@gmail.com", "789.741.852-69");
		listaUsuarios.add(marijane);
		listaUsuarios.add(banguela);
		listaUsuarios.add(sabri);
		
		//Os Pruus dos usuários
		
		Pruu marijanePruu1 = new Pruu("Lava minha roupa?", new Date(), 7, false, marijane);
		Pruu marijanePruu2 = new Pruu("Saudade do que a gente ainda não viveu", new Date(), 10, false, marijane);
		marijane.enviaPruu(marijanePruu1);
		marijane.enviaPruu(marijanePruu2);
						
		Pruu banguelaPruu1 = new Pruu("Não toca sua mão suja em mim, humana", new Date(), 798, false, banguela);
		Pruu banguelaPruu2 = new Pruu("Tô com fome", new Date(), 537, false, banguela);
		banguela.enviaPruu(banguelaPruu1);
		banguela.enviaPruu(banguelaPruu2);
		
		Pruu sabriPruu1 = new Pruu("Vamos no jogo do Avaí", new Date(), 13, false, sabri);
		Pruu sabriPruu2 = new Pruu("Amo papelaria", new Date(), 38, false, sabri);
		sabri.enviaPruu(sabriPruu1);
		sabri.enviaPruu(sabriPruu2);
		
		//Dar like
		marijane.like(sabriPruu2);
		
		//Adm bloquear um pruu
		sabri.bloquearPruu(marijanePruu1);
		
		for (Usuarios usuario : listaUsuarios) {
			usuario.mostraPruus(usuario);
		}
	}

}
