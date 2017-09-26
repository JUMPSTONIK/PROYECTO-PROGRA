//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

public class RegistroAdmin extends Personas{
	protected String puesto;

	public RegistroAdmin(String nombre, String dpi, String contrasena, String puesto, String id){
		super(nombre, dpi, contrasena, id);
                this.puesto= puesto;
	}

	public String getPuesto(){
		return puesto;
	}
        
}