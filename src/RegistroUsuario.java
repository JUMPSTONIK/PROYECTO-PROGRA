
import java.util.ArrayList;


//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017
/*
 * 29 de septiembre de 2017
 * @author josue David Lopez Florian 17081
 * @author Juan Rodolfo Alonzo Molina 15470
 */

public class RegistroUsuario extends Personas{
	protected  String[] horario = new String[5];
        private  String[] sector = new String[5];
        private static ArrayList <String> multas = new ArrayList<String>();
        
	public RegistroUsuario(String nombre, String dpi, String contrasena, String trabajo, String id){
		super(nombre, dpi,contrasena, id, trabajo);
                
	}

	/**
         * esta funcion es la encargada de asignar a la lista horas los intervalos de horas que tiene y la lista de sectores en los que se asigno
         * @param horas tiene el intervalo de horas la cual se esta queriendo asignar
         * @param sectores tiene el numero del sector a donde se esta asignarno
         * @return regresa un mensaje diciendo si se ha o no logrado la asignacion del sector y su horario.
         */
	public String setHorarioYsector(String horas, String sectores){
            String mensaje ="";
            int cont =0;
            boolean acceso = false;
                //en esta parte se comprueba si hay algo en la posicion 1 y si esta vacia, entonces agrega el sector y horas
                if (this.horario[0] == null) {
                    this.horario[0] = horas;
                    this.sector[0] = sectores;
                    mensaje = "se ha asignado exitosamente";

                }
                else{
                    //aqui se recorre el array al reves para obtener la posicion de siguiente en la cual se puede meter el sector y las horas
                    for (int i = 4; i > 0; i--) {
                        //si el espacio es nulo, entonces asigna el valor de la posicion que esta bucanco en cont para tener el index
                        if (this.horario[i] == null) {
                           cont = i;
                           acceso = true; 
                        }
                        else{
                            //en caso que ya se haya hallado que un valor en cierta posicion no es null, recorre el array
                            //para comparar si este intervalos de horas ya se ha asignado y para ver si se asgina o no
                            for (int j = 0; j < i+1; j++) {
  
                            if (this.horario[j].equals(horas)) {
                                
                                mensaje = "no se puede asignar 2 veces en las mismas horas en uno o varios sectores. Elija uno diferente\n";
                                acceso = false;
                                }
                            }    
                        }
                    }
                    //si al final este intervalo de horas no existia, entoces se asigna aqui
                    if (acceso == true && cont>=0) {
                        
                        this.horario[cont] = horas;
                        this.sector[cont] = sectores;
                        mensaje = "se ha asignado exitosamente";
                    }
                } 
                //aqui comprueba si al final esta llena o no el array para devolver el mensaje de que ya esta lleno su horario y sectores
                if (mensaje.equals("")) {
                mensaje ="no puede tener mas de 5 sectores asignados a su horario";
            }
            
            return mensaje;
	}
        
        /**
         * metodo encargado de devolver la lista de sectores en la cual esta asignada la persona
         * @return devuleve la lista de sectores
         */
        public String[] getSector(){
		return this.sector;
	}
        /**
         * este metodo devuelve la lista de intervalo de horas que ha metido en su lista de horario
         * @return devuleve la lista de intervalos de horas llamada horario
         */
	public String[] getHorario(){
		return this.horario;
	}
        
        public String getMultas(){
            String lasMultas ="";
            if (this.multas.isEmpty()==true) {
                lasMultas = "no tiene multas";
            }
            else{
                for (int i = 0; i < this.multas.size(); i++) {
                    lasMultas += this.multas.get(i) + "\n";
                }
            }
            
            return lasMultas;
            
        }
}