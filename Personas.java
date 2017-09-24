//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

public abstract class Personas{
	
	protected String nombre;
	protected String dpi;
	protected String email;
	private String contrasena;
	protected int min;
	protected int max;

	public Personas(String nombre, String dpi, String email, String contrasena){
		this.nombre = nombre;
		this.dpi = dpi;
		this.email = email;
		this.contrasena = contrasena;
		Random r = new Random();
		min = 1000;
		max = 9999;
		id = r.nextInt(max-min) + min;
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