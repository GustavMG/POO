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
}
