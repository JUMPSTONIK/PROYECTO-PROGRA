//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

import java.util.ArrayList;

public class Comunidad{
	private ArrayList <Personas> administradores;
	private ArrayList <Personas> usuarios;
        private ArrayList <String> codigosAdm;
        private ArrayList <String> codigosUsua;
        private String idAdmin;
        private String idUser;

	public Comunidad(){
		administradores = new ArrayList<Personas>();
		usuarios = new ArrayList<Personas>();
                codigosUsua = new ArrayList<String>();
                codigosAdm = new ArrayList<String>();
                generarIDAdmin();
                generarIDUser();
                codigosUsua.add("BBBBB");
                codigosAdm.add("AAAAA");
	}

	public String agregarAdministrador(String nombre, String dpi, String contrasena,String contrasenarep, String puesto, String code){
            String mensaje = "";
            if (nombre.equals("") || dpi.equals("") || puesto.equals("")) {
             mensaje = "no deje ninguna casilla en blanco. \nDebe llenar todas las casillas que se le piden";   
            }
            else{
                boolean aprovcode = false;
                for (int i = 0; i < codigosAdm.size(); i++) {
                    if (code.equals(codigosAdm.get(i))) {
                     aprovcode = true;
                     codigosAdm.remove(code);
                    }
                }
                if (contrasena.equals(contrasenarep) && aprovcode == true) {
                    boolean aceptar = false;
                    while(aceptar == false){
                        System.out.println(5);
                        if (administradores.isEmpty() == true) {
                            RegistroAdmin admin = new RegistroAdmin(nombre, dpi, contrasena, puesto, this.idAdmin);
                            administradores.add(admin);
                            aceptar = true;
                            mensaje = "Felicidades, ya es " + puesto + " registrado por la munidipalidad." + "\n" + "Su ID de acceso es: " + admin.getID() + "\n" + "Su ID es unico e irrecuperable. por favor, no perderlo";
                        }
                        else{
                            for (int i = 0; i < administradores.size() ; i++) {

                                if (administradores.get(i).getContrasena().equals(contrasena)) {
                                aceptar = true;
                                mensaje = "Ya existe un Usuario con esta contraseña, elija una nueva";
                                }    
                            }
                            if (aceptar == false) {

                                RegistroAdmin admin = new RegistroAdmin(nombre, dpi, contrasena, puesto, this.idAdmin);
                                administradores.add(admin);
                                aceptar = true;
                                mensaje = "Felicidades, ya es " + puesto + " registrado por la munidipalidad." + "\n" + "Su ID de acceso es: " + admin.getID() + "\n" + "Su ID es unico e irrecuperable. por favor, no perderlo";

                            }
                        }
                    }
                }
                else{
                    mensaje = "la contraseña y la contraseña de repeticion no es la misma o el codigo que ha ingresado es incorrecto. Vuelva a intentarlo";
                } 	
            }
            return mensaje;
        }
        
	public String agregarUsuario(String nombre, String dpi, String contrasena, String contrasenarep, String trabajo, String code){
            String mensaje = "";
            if (nombre.equals("") || dpi.equals("") || trabajo.equals("")) {
                System.out.println(codigosUsua.get(0));
             mensaje = "no deje ninguna casilla en blanco. \nDebe llenar todas las casillas que se le piden";   
            }
            else{
                boolean aprovcode = false;
                System.out.println(codigosUsua.get(0));
                for (int i = 0; i < codigosUsua.size(); i++) {
                    if (code.equals(codigosUsua.get(i))) {
                     
                     aprovcode = true;
                     codigosUsua.remove(code);
                    }
                }		
                if (contrasena.equals(contrasenarep) && aprovcode == true) {
                    boolean aceptar = false;
                    while(aceptar == false){
                        System.out.println(5);
                        if (usuarios.isEmpty() == true) {
                            RegistroUsuario trabajador = new RegistroUsuario(nombre, dpi, contrasena, trabajo, this.idUser);
                            usuarios.add(trabajador);
                            aceptar = true;
                            mensaje = "Felicidades, ya es " + trabajo + " registrado por la munidipalidad." + "\n" + "Su ID de acceso es: " + trabajador.getID() + "\n" + "Su ID es unico e irrecuperable. por favor, no perderlo";
                        }
                        else{
                            for (int i = 0; i < usuarios.size() ; i++) {

                                if (usuarios.get(i).getContrasena().equals(contrasena)) {
                                aceptar = true;
                                mensaje = "Ya existe un Usuario con esta contraseña, elija una nueva";
                                }    
                            }
                            if (aceptar == false) {

                            RegistroUsuario trabajador = new RegistroUsuario(nombre, dpi, contrasena, trabajo, this.idUser);
							usuarios.add(trabajador);
                            aceptar = true;
                            mensaje = "Felicidades, ya es " + trabajo + " registrado por la munidipalidad." + "\n" + "Su ID de acceso es: " + trabajador.getID() + "\n" + "Su ID es unico e irrecuperable. por favor, no perderlo";
                            }
                        }
                    }
                }
                else{
                    mensaje = "la contraseña y la contraseña de repeticion no es la misma o el codigo que ha ingresado es incorrecto. Vuelva a intentarlo";
                } 	
            }
            return mensaje;
	}
        
        public boolean log_in(ArrayList<Personas> user, String ID, String contrasena){
            boolean conectar = false;
            for (int i = 0; i < user.size() ; i++) {
                if (user.get(i).getID().equals(ID) && user.get(i).getID().equals(contrasena)) {
                    System.out.println(user.get(i).getID());
                 conectar = true;   
                }
            }
            return conectar;
        }
        
        public ArrayList<Personas> QueUsuario(String contra){
            ArrayList<Personas> op = new ArrayList<Personas>();
            if (contra.substring(0,1).equals("A")) {
                op = administradores;
            }
            if (contra.substring(0,1).equals("B")) {
                op = usuarios;
            }
            return op;
        }
        
        public void setCodigoAdmin(String codigo){
            codigosAdm.add(codigo);
        }
        public void setCodigoUser(String codigo){
            codigosUsua.add(codigo);
        }
        
        private void generarIDAdmin(){
            int id = (int)((Math.random()*8999)+1000);
            this.idAdmin = "A" + String.valueOf(id);
        }
        
        private void generarIDUser(){
            int id = (int)((Math.random()*8999)+1000);
            this.idUser = "B" + String.valueOf(id);
        }
}