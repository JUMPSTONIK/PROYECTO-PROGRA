//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017

import java.util.ArrayList;

public class Comunidad{
	private static ArrayList <Personas> administradores = new ArrayList<Personas>();
	private static ArrayList <Personas> usuarios = new ArrayList<Personas>();
        private static ArrayList <String> codigosAdm;
        private static ArrayList <String> codigosUsua;
        private String idAdmin;
        private String idUser;
        private static boolean typeuser;
        private static int indexUser;

	public Comunidad(){
            
                codigosUsua = new ArrayList<String>();
                codigosAdm = new ArrayList<String>();
                generarIDAdmin();
                generarIDUser();
                codigosUsua.add("BBBBB");
                codigosAdm.add("AAAAA");
                char c = (char)83;
                System.out.println(c);
                     
	}
        /**
         * este es el metodo encargada de guardar un objeto tipo persona a administradores, pero antes verifica si es un administrador valido o no
         * @param nombre nombre de la persona que se registra
         * @param dpi dpi de la persona que se registra
         * @param contrasena contraseña de quien se esta registrando
         * @param contrasenarep la repeticion de la contraseña de la persona que volvio a ingresar
         * @param puesto tiene que puesto ocupa en la municipalidad al ser un administrador. ej. policia, alcalde,etc.
         * @param code codigo que fue dado por otro administrador o la muni, que necesita para comprobar si es alguien ajeno a la municipalidad y no es un
         * administrador que se ha autorizado para ser otro administrador
         * @return retorna un mensaje diciendo su id de usuario y si ya es oficial, o en caso algo no haya llenado, le regresa un mensaje diciendo que debe llenarlo
         */
	public String agregarAdministrador(String nombre, String dpi, String contrasena,String contrasenarep, String puesto, String code){
            String mensaje = "";
            //aqui se comprueba si las casilla nombre, dpi y puesto tienen algo
            if (nombre.equals("") || dpi.equals("") || puesto.equals("")) {
             mensaje = "no deje ninguna casilla en blanco. \nDebe llenar todas las casillas que se le piden";   
            }
            else{
                boolean aprovcode = false;
                //comprobamos si existe el codigo de acceso y si coincide
                for (int i = 0; i < codigosAdm.size(); i++) {
                    if (code.equals(codigosAdm.get(i))) {
                     aprovcode = true;
                     codigosAdm.remove(code);
                    }
                }
                //comprue si la contraseña y las contraseña repetirda son iguales, y si se aprobo el codigo
                if (contrasena.equals(contrasenarep) && aprovcode == true) {
                    boolean aceptar = false;
                    while(aceptar == false){
                        
                        //en caso que no exista nigun objeto en administradores, entonces mete el registro de la persona
                        if (administradores.isEmpty() == true) {
                            RegistroAdmin admin = new RegistroAdmin(nombre, dpi, contrasena, puesto, this.idAdmin);
                            administradores.add(admin);
                            aceptar = true;
                            mensaje = "Felicidades, ya es " + puesto + " registrado por la munidipalidad." + "\n" + "Su ID de acceso es: " + administradores.get(0).getID() + "\n" + "Su ID es unico e irrecuperable. por favor, no perderlo";
                        }
                        else{
                            //recorre el ArrayList para saber si no se repite la contraseña de algun otro usuario
                            for (int i = 0; i < administradores.size() ; i++) {

                                if (administradores.get(i).getContrasena().equals(contrasena)) {
                                aceptar = true;
                                mensaje = "Ya existe un Usuario con esta contraseña, elija una nueva";
                                }    
                            }
                            // en caso que no se repita la contraseña, aqui mete el registro de la perssona
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
        /**
         * este es el metodo encargada de guardar un objeto tipo persona a usuarios, pero antes verifica si es un vendedor valido o no
         * @param nombre nombre de la persona que se registra
         * @param dpi dpi de la persona que se registra
         * @param contrasena contraseña de quien se esta registrando
         * @param contrasenarep la repeticion de la contraseña de la persona que volvio a ingresar
         * @param trabajo de que trabaja la persona. ej. payaso, artista, vendedor,etc.
         * @param code codigo que fue dado por otro administrador o la muni, que necesita para comprobar si es alguien ajeno a la municipalidad y no es un
         * vendedor que se ha autorizado para ser otro vendedor oficial
         * @return retorna un mensaje diciendo su id de usuario y si ya es oficial, o en caso algo no haya llenado, le regresa un mensaje diciendo que debe llenarlo
         */
	public String agregarUsuario(String nombre, String dpi, String contrasena, String contrasenarep, String trabajo, String code){
            String mensaje = "";
            if (nombre.equals("") || dpi.equals("") || trabajo.equals("")) {
                
             mensaje = "no deje ninguna casilla en blanco. \nDebe llenar todas las casillas que se le piden";   
            }
            else{
                boolean aprovcode = false;
                
                for (int i = 0; i < codigosUsua.size(); i++) {
                    if (code.equals(codigosUsua.get(i))) {
                     
                     aprovcode = true;
                     codigosUsua.remove(code);
                    }
                }		
                if (contrasena.equals(contrasenarep) && aprovcode == true) {
                    boolean aceptar = false;
                    while(aceptar == false){
                        
                        if (usuarios.isEmpty() == true) {
                            RegistroUsuario trabajador = new RegistroUsuario(nombre, dpi, contrasena, trabajo, this.idUser);
                            this.usuarios.add(trabajador);
                            aceptar = true;
                            mensaje = "Felicidades, ya es " + trabajo + " registrado por la munidipalidad." + "\n" + "Su ID de acceso es: " + usuarios.get(0).getID() + "\n" + "Su ID es unico e irrecuperable. por favor, no perderlo";
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
        
        public boolean log_in(ArrayList<Personas> usuario, String ID, String contrasena){
            System.out.println(usuario);
            
            boolean conectar = false;
            for (int i = 0; i < usuario.size() ; i++) {
                
                
                if (usuario.get(i).getID().equals(ID) && usuario.get(i).getContrasena().equals(contrasena)) {
                    this.indexUser = i;
                    conectar = true;   
                }
            }
            return conectar;
        }
        
        public ArrayList<Personas> QueUsuario(String contra){
            
            ArrayList<Personas> op = new ArrayList<Personas>();
            if (contra.substring(0,1).equals("A")) {
                op = this.administradores;
                this.typeuser= true;
            }
            if (contra.substring(0,1).equals("B")) {
                op = this.usuarios;
                this.typeuser= false;
            }
            return op;
        }
        
        public ArrayList<Personas> getTrabajadores(){
            return this.usuarios;
        }
        
        public ArrayList<Personas> getAdministradores(){
            return this.administradores;
        }
        
        public boolean getTipoUsuario(){
            return this.typeuser;
        }
        public int getIndexUser(){
            return this.indexUser;
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