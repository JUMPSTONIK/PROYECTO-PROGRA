//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

public class RegistroUsuario extends Personas{
	protected String sector;

	public RegistroUsuario(String nombre, String dpi, String email, String contrasena, String sector){
		super(nombre, dpi, email, contrasena);
	}

	public void setSector(String sector){
		this.sector = sector;
	}

	public String getSector(){
		return sector;
	}
}