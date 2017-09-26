//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

import java.util.ArrayList;

public class Comunidad{
	private ArrayList <Personas> administradores;
	private ArrayList <Personas> usuarios;

	public Comunidad(){
		administradores = new ArrayList<Personas>();
		usuarios = new ArrayList<Personas>();
	}

	public void agregarAdministrador(String nombre, String dpi, String email, String contrasena, String puesto, int id){
		RegistroAdmin admin = new RegistroAdmin(nombre, dpi, email, contrasena, puesto, id);
		administradores.add(admin);
	}

	public void agregarUsuario(String nombre, String dpi, String email, String contrasena, String trabajo, int id, String horario){
		RegistroUsuario vendedor = new RegistroUsuario(nombre, dpi, email, contrasena, trabajo, id, horario);
		usuarios.add(vendedor);
	}
}