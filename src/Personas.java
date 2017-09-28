//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017
import java.util.Random;

public abstract class Personas{
	
	protected String nombre;
	protected String dpi;
	private String contrasena;
	protected String id;
        protected String descripcion;
	//aqui estoy viendo cual random me sale mejor
	//private static Random r = new Random();
	//protected int min = 1000;
	//protected int max = 9999;
	//protected int id = r.nextInt(max-min+1)+min;

	public Personas(String nombre, String dpi, String contrasena, String id, String descripcion){
		this.nombre = nombre;
		this.dpi = dpi;
		this.contrasena = contrasena;
		this.id = id;
                this.descripcion = descripcion;
	}

	public String getNombre(){
		return nombre;
	}

	public String getDPI(){
		return dpi;
	}

	public String getContrasena(){
		return contrasena;
	}
        public String getID(){
                return id;
        }
        
        public String getDescripcion(){
		return descripcion;
	}
        
	public String toString(){
		String datos;
		datos = "Nombre: " + nombre + "\n";
		datos += "DPI: " + dpi + "\n";
		datos += "ID: " + id + "\n";
		return datos; 
	}
}