/**
 * Herencia en POO
 * 
 * Nos permite heredar atributos y metodos con la finalidad  de reutilizar código y generar una realción
 * entre clases superiores(padres) y las subclases(hijos).
 * 
 * Superclase
 * SubClase
 * 
 * Para heredar, usamos la palabara reservada llamada extends.
 * Esta palabra se coloca a lado del nombre de mi clase(Empleado), y despues definimos el lugar de donde
 * nos vamos a traer las cosas que queremos heredar(Persona).
 * 
 * Para heredar constructores de una forma muy rápida, daremos click derecho sobre nuestro editor de código
 * despues buscaremos la opción source y despues en la opción de Generate Using Field
 */

package entidades;

//Primero dar a instrucción de que quero heredar
public class Empleado extends Persona{
	
	//1. Atributos
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	//2. Constructores con parámetros (heredamos "la mitad" del constructor de Persona
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);	//Nos indica que heredamos (esto es de la clase SUPERIOR
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//Heredar constructores sobrecargados
	public Empleado(String nombre, int edad, String correo, String numEmpleado, String nss, String puesto) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}

	public Empleado(String nombre, int edad, String numEmpleado, String nss, String puesto) {
		super(nombre, edad);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	
	//3. Metodo para imprimir información del empleado
	public void mostrarInformacion() {
		System.out.println("El nombre de la persona es: " + nombre);
		System.out.println("La edad de la persona es: " + edad);
		System.out.println("El correo de la persona es: " + correo);
		System.out.println("El telefono de la persona es: " + telefono);
		System.out.println("El numero de empleado es: " + numEmpleado);
		System.out.println("El nss del empleado es: " + nss);
		System.out.println("El puesto de la persona es: " + puesto);
		System.out.println("\n");
	}	//cierre
	
	//4. ToString
	//ToString es un método en JAVA que proviene de la clase Objeto(el antecesor o precursor de todos los objetos que existen en JAVA).
	
}
