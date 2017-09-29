
//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

public class RegistroUsuario extends Personas{
	protected  String[] horario = new String[5];
        private  String[] sector = new String[5];
        
	public RegistroUsuario(String nombre, String dpi, String contrasena, String trabajo, String id){
		super(nombre, dpi,contrasena, id, trabajo);
                
	}

	

	public String setHorarioYsector(String horas, String sectores){
            String mensaje ="";
            int cont =0;
            boolean acceso = false;
            
                if (this.horario[0] == null) {
                    this.horario[0] = horas;
                    this.sector[0] = sectores;
                    mensaje = "se ha asignado exitosamente";

                }
                else{
                    
                    for (int i = 4; i > 0; i--) {
                        if (this.horario[i] == null) {
                           cont = i;
                           acceso = true; 
                        }
                        else{
                            for (int j = 0; j < i+1; j++) {
  
                            if (this.horario[j].equals(horas)) {
                                
                                mensaje = "no se puede asignar 2 veces en las mismas horas en uno o varios sectores. Elija uno diferente\n";
                                acceso = false;
                                }
                            }    
                        }
                    }
                    if (acceso == true && cont>=0) {
                        
                        this.horario[cont] = horas;
                        this.sector[cont] = sectores;
                        mensaje = "se ha asignado exitosamente";
                    }
                } 
                if (mensaje.equals("")) {
                mensaje ="no puede tener mas de 5 sectores asignados a su horario";
            }
            
            return mensaje;
	}
        
        
        public String[] getSector(){
		return this.sector;
	}
        
	public String[] getHorario(){
		return this.horario;
	}
        
}