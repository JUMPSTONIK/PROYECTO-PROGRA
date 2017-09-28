
//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

public class RegistroUsuario extends Personas{
	protected String[] horario = new String[5];
        private String[] sector = new String[5];
        
	public RegistroUsuario(String nombre, String dpi, String contrasena, String trabajo, String id){
		super(nombre, dpi,contrasena, id, trabajo);
                
	}

	

	public String setHorario(String horas){
            String mensaje ="";
            for (int j = 0; j < this.horario.length -1; j++) {
                
            if (this.horario[j] == null) {
                if (this.horario.length == 0) {
                    this.horario[0] = horas;
                    mensaje = "se ha asignado exitosamente";
                }
                else{
                    for (int i = 0; i < this.horario.length; i++) {
                        if (this.horario[i].equals(horas)) {
                            mensaje = "no se puede asignar 2 veces en las mismas horas en uno o varios sectores. Elija uno diferente";
                        }
                        else{
                            this.horario[i] = horas;
                            mensaje = "se ha asignado exitosamente";
                        }
                    }
                } 
            }
            else{
                mensaje = "ya esta lleno su horario de asignaciones";
            }
            }
            return mensaje;
	}
        
        public void setSector(String sectores){
            if (this.sector.length <5) {
                if (this.sector.length == 0) {
                    this.sector[0] = sectores;
                }
                else{
                    for (int i = 0; i < this.sector.length; i++) {
                        if (this.sector[i].equals(sectores)) {
                        }
                        else{
                            this.sector[i] = sectores;
                        }
                    }
                } 
            }
	}
        
        public String[] getSector(){
		return this.sector;
	}
        
	public String[] getHorario(){
		return this.horario;
	}
        
}