//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

public class RegistroAdmin extends Personas{
	protected String puesto;

	public RegistroAdmin(String nombre, String dpi, String email, String contrasena, String puesto, int id){
		super(nombre, dpi, email, contrasena, id);
	}

	public void setPuesto(String puesto){
		this.puesto = puesto;
	} 

	public String getPuesto(){
		return puesto;
	}
}