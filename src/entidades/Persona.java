/**
 * Notas para trabajar con POO en JAVA
 * 
 * Establecemos los pasos para trabajar en nuestras clases, definiendo el siguiente orden:
 * 	
 * 	- Primero nuestras propiedades o atributos usando variables de JAVA
 * 	- Definimos un constructor con parámetros (este constructor se define en la clasa).
 * 	
 * Tambien tenemos un constructor llamado "constructor por defecto", que se define en la instancia de la clase
 * El inconveniente que tenemos es que solo podemos usar uno de los dos.
 * 
 * Por ultimo, definimos los metodos que nuestro objetivo va a utilizar. Aqui utilizamos la teoria de funciones
 * (funciones vacias, funciones que retornan un tipo de valor).
 * 
 * Notas adicionales:
 * 
 * Sobrecarga de metodos.
 * 
 * La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (Persona) e ir variando sus
 * parámetros. Con esto evitamos usar "Persona1", "Persona2", etc., para utilizar el mismo metodo en diferentes situaciones.
 * 
 * Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda a comprender
 * distintas situaciones donde tal vez uno de los campos solicitados en el formulario NO sea requerido u obligatorio
 * de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como
 * indefinido), ya que esto podría acarrear errores en la ejecución de nuestro código.
 * De preferencia, es mejor que el dato quede como NULO.
 * 
 */

package entidades;

public class Persona {
	
	//1. Propiedades o atributos
	//2. Constructor
	//3. Metodos
	
	//1. Propiedades o atributos
	public String nombre;
	public int edad;
	public String correo;
	public String telefono; //null
			
	//2. Constructor (con parámetros)
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	//Sobrecarga de metodo(overloading)
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	//Sobrecarga de metodo(overloading)
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		}
	
			
	//3. Metodos
	public void mostrarInformacion() {
		System.out.println("El nombre de la persona es: " + nombre);
		System.out.println("La edad de la persona es: " + edad);
		System.out.println("El correo de la persona es: " + correo);
		System.out.println("El telefono de la persona es: " + telefono);
		System.out.println("\n");
	}
	//CIERRE DE INFORMACIÓN
	
	//Metodo main es una función "ejecutora"
	public static void main(String[] args) {
		Persona gmg = new Persona("Gustavo", 28, "gmg@gmail.com", "999-999-9999");
		Persona maldonado = new Persona("Maldonado", 27, "maldonado@gmail.com", "999-123-456");
		Persona gonzalez = new Persona("Gonzalez", 27, "gonzalez@gmail.com", "999-999-1234");
		Persona gustavito = new Persona("Gustavito", 15, "gustavito@gmail.com", "9911-999-1245");
		Persona tavo = new Persona("Tavo", 35, "tavo@gmail.com", "9993-333-4444");
		Persona Mariana = new Persona("Mariana", 19, "mariana@gmail.com");
		
		gmg.mostrarInformacion();
		maldonado.mostrarInformacion();
		gonzalez.mostrarInformacion();
		gustavito.mostrarInformacion();
		tavo.mostrarInformacion();
		
		Mariana.mostrarInformacion();
		
	}

}
