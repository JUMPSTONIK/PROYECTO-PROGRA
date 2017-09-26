//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017
import java.util.Random;

public abstract class Personas{
	
	protected String nombre;
	protected String dpi;
	protected String email;
	private String contrasena;
	protected int id = (int)(Math.random() * 9999) + 1000;
	//aqui estoy viendo cual random me sale mejor
	//private static Random r = new Random();
	//protected int min = 1000;
	//protected int max = 9999;
	//protected int id = r.nextInt(max-min+1)+min;

	public Personas(String nombre, String dpi, String email, String contrasena, int id){
		this.nombre = nombre;
		this.dpi = dpi;
		this.email = email;
		this.contrasena = contrasena;
		this.id = id;
	}

	public String getNombre(){
		return nombre;
	}

	public String getDPI(){
		return dpi;
	}

	public String getEmail(){
		return email;
	}

	public String getContrasena(){
		return contrasena;
	}

	public String toString(){
		String datos;
		datos = "Nombre: " + nombre + "\n";
		datos += "DPI: " + dpi + "\n";
		datos += "Email: " + email + "\n";
		datos += "ID: " + id + "\n";
		return datos; 
	}
}