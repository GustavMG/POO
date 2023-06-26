package entidades;

public class Test {

	public static void main(String[] args) {
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@gmail.com", "555-333-4444", "ABC123", "90876567389", "Bell Boy");
		Empleado otroEmpleado = new Empleado("Mariana", 19, "mariana@gmail.com", "ABC123", "90876567389", "Bell Boy");
		
		otroEmpleado.mostrarInformacion();
		EvilFelipe.mostrarInformacion();
		
		//Instancia cliente
		System.out.println();
		System.out.println("Instancia de un Cliente");
		
		Cliente jesus = new Cliente("Jesus Gonzalez", "ABCD1234", 157654.00f, "1234");
		
		jesus.mostrarInfoCliente();
		
		jesus.nombre = "Gustav";
		jesus.setSaldo(0.00f);
		jesus.mostrarInfoCliente();
	}

}
