//Universidad del Valle de Guatemala
//15470
//Juan Rodolfo Alonzo Molina
//21/09/2017
/*
 * 29 de septiembre de 2017
 * @author josue David Lopez Florian 17081
 * @author Juan Rodolfo Alonzo Molina 15470
 */
import java.util.ArrayList;

public class Comunidad{
	private static ArrayList <Personas> administradores = new ArrayList<Personas>();
	private static ArrayList <Personas> usuarios = new ArrayList<Personas>();
        private static ArrayList <String> codigosAdm;
        private static ArrayList <String> codigosUsua;
        private static String idAdmin;
        private static String idUser;
        private static boolean typeuser;
        private static int indexUser;

	public Comunidad(){
            
                codigosUsua = new ArrayList<String>();
                codigosAdm = new ArrayList<String>();
                generarIDAdmin();
                generarIDUser();
                codigosUsua.add("BBBBB");
                codigosAdm.add("AAAAA");
                //String var = generarCodigo();
                //System.out.println(var);
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
        /**
         * este es el metodo utilizado para permitir al usuario administrador o trabajador entrar a su perfil
         * @param usuario lista de los usuarios trabajadores
         * @param ID id del trabajador 
         * @param contrasena la contraseña del trabajador que quiere ingresar
         * @return devuleve un boolean para ver si se permite el ingreso a su perfil
         */
        public boolean log_in(ArrayList<Personas> usuario, String ID, String contrasena){
            //System.out.println(usuario);
            
            boolean conectar = false;
            for (int i = 0; i < usuario.size() ; i++) {
                
                
                if (usuario.get(i).getID().equals(ID) && usuario.get(i).getContrasena().equals(contrasena)) {
                    this.indexUser = i;
                    conectar = true;   
                }
            }
            return conectar;
        }
        
        public boolean log_in2(ArrayList<Personas> usuario, String ID){
            
            boolean conectar = false;
            for(int i = 0; i < usuario.size() ; i++){
                
                
                if (usuario.get(i).getID().equals(ID)){
                    this.indexUser = i;
                    conectar = true;
                }
            }
            return conectar;
        }
        /**
         * este metodo esta hecho para determinar automaticamente a travez del a ID de la persona
         * @param IDuser ID ingresado por la persona que se logeara
         * @return devuelve la lista de con que persona va a trabajar
         */
        public ArrayList<Personas> QueUsuario(String IDuser){
            
            ArrayList<Personas> op = new ArrayList<Personas>();
            if (IDuser.substring(0,1).equals("A")) {
                op = this.administradores;
                this.typeuser= true;
            }
            if (IDuser.substring(0,1).equals("B")) {
                op = this.usuarios;
                this.typeuser= false;
            }
            return op;
        }
        /**
         * este metodo se encarga de devolver la array de trabajadores y vendedores
         * @return lista de vendedores o trabajadores
         */
        public ArrayList<Personas> getTrabajadores(){
            return this.usuarios;
        }
        /**
         * este metodo devuelve la lista de Administradores
         * @return lista de Administradores
         */
        public ArrayList<Personas> getAdministradores(){
            return this.administradores;
        }
        /**
         * metodo que devuleve el tipo de usuario con el que se trabajara. false para trabajadores y true para admins 
         * @return boolean del tipo de usuario correspondiente
         */
        public boolean getTipoUsuario(){
            return this.typeuser;
        }
        /**
         * metodo que devuelve el index del usuario con el que se trabajara o su posicion en el array
         * @return devuleve la posicion donde se encuentra la info del usuario
         */
        public int getIndexUser(){
            return this.indexUser;
        }
        /**
         * con este metodo se guarda el codigo autorizado por la municipalidad par a los otros
         * administradores y lo metera en la lista de codigos autorizados para admins
         * @param codigo codigo que se quiere agregar a la lista de codigos autorizados para administradores
         */
        public void setCodigoAdmin(String codigo){
            codigosAdm.add(codigo);
        }
        /**
         * este metodo es utilizaso para poder guardar en su lista de codigos autorizados por la munidipalidad
         * para los vendedores y trabajadores
         * @param codigo codigo el cual se quiere que se ingrese a la lista de codigos autorizados para los vendedores
         */
        public void setCodigoUser(String codigo){
            codigosUsua.add(codigo);
        }
        /**
         * aqui se genera el id de los administradores
         */
        private void generarIDAdmin(){
            int id = (int)((Math.random()*8999)+1000);
            this.idAdmin = "A" + String.valueOf(id);
        }
        /**
         * esta funcion sirve para generar el Id del vendedor o trabajador
         */
        private void generarIDUser(){
            int id = (int)((Math.random()*8999)+1000);
            this.idUser = "B" + String.valueOf(id);
        }
        /**
         * este metodo es para poder recopilar la informacion de la lista de usuarios o trabajadores
         * y asi mandarlo a guardar y mostrar en el jcomboBox
         * @return contenido listo para el jcomboBox
         */
        //prueba con este metodo a ver si te guarda los datos en el combobox
        //sino, deberas obtener de esta clase la lista de usuarios y mandarla
        //a la clase que tendra el combobox a llenar
        // para llenar un comobox se utiliza esta funcion  ###.addItem("elemento")
        // no olvides el numero indice para cada elemento
        public String genListJCBoxTrabajadores(){
            String var = "";
            for (int i = 0; i < this.usuarios.size(); i++) {
                var += this.usuarios.get(i) + "\n";
            }
            return var;
        }
        /**
         * este metodo genera un codigo aleatorio usando codigo ASCII de 5 letras
         * este codigo sera usado para permitir el ingreso de nuevos usuarios y
         * administradores
         * @return codigo de 5 letras para el acceso de registro
         */
        //no se porque genera 2 diferentes, pero puedes tratar de averiguar que pasa
        public String generarCodigo(){
            String codigo = "";
            for (int i = 0; i < 5; i++) {
                char c = (char)((Math.random()*25)+65);
                codigo += String.valueOf(c);
                
            }
            return codigo;
        }
        
}