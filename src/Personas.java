//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017
/*
 * 29 de septiembre de 2017
 * @author josue David Lopez Florian 17081
 * @author Juan Rodolfo Alonzo Molina 15470
 */
import java.util.Random;

public abstract class Personas{
	
	protected String nombre;
	protected String dpi;
	protected String contrasena;
	protected String id;
        protected String descripcion;
	

	public Personas(String nombre, String dpi, String contrasena, String id, String descripcion){
		this.nombre = nombre;
		this.dpi = dpi;
		this.contrasena = contrasena;
		this.id = id;
                this.descripcion = descripcion;
	}
        /**
         * esta funcion devuelve el nombre de la persona
         * @return nombre de la persona
         */
	public String getNombre(){
		return this.nombre;
	}
        /**
         * esta funcion devuelve el DPI de la persona
         * @return devuelve el DPI
         */
	public String getDPI(){
		return this.dpi;
	}
        /**
         * esta funcion ddevuelve la funcion de la persona que se desea
         * @return devuleve la contraseña
         */
	public String getContrasena(){
		return this.contrasena;
	}
        /**
         * esta es la funcion la cual devuelve el ID de la persona que queremos
         * @return devuleve el ID
         */
        public String getID(){
                return this.id;
        }
        /**
         * esta funcion devuleve la descripcion de la persona si es algun tipo de trabajador de la municipalidad o administrador
         * @return 
         */
        public String getDescripcion(){
		return this.descripcion;
	}
        /**
         * en esta funcion se devuelve la informacion completa de la persona de quien se quiere saber
         * @return 
         */
	public String toString(){
		String datos;
		datos = "Nombre: " + this.nombre + "\n";
		datos += "DPI: " + this.dpi + "\n";
		datos += "ID: " + this.id + "\n";
                datos += "Descripcion: " + this.descripcion;
		return datos; 
	}
}