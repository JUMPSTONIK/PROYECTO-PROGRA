//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

public class RegistroUsuario extends Personas{
	protected String trabajo;
	protected String horario;

	public RegistroUsuario(String nombre, String dpi, String email, String contrasena, String trabajo, int id, String horario){
		super(nombre, dpi, email, contrasena, id);
	}

	public void setTrabajo(String trabajo){
		this.trabajo = trabajo;
	}

	public String getTrabajo(){
		return trabajo;
	}

	public void setHorario(String horario){
		this.horario = horario;
	}

	public String getHorario(){
		return horario;
	}
}