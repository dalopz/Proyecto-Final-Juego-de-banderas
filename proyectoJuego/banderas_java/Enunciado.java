public class Enunciado{
	public static void main(String[] args) {

		
		ConsoleFile.read("recursos/info_banderas.csv");

		System.out.println("Ingrese una cadena");
		String temp = ConsoleInput.getString();
		System.out.println("La cadena leida fue:"+temp);

		System.out.println("Ingrese un numero entero");
		int entero = ConsoleInput.getInt();
		System.out.println("El entero leido fue:"+entero);

		System.out.println("Ingrese un numero flotante");
		float flotante = ConsoleInput.getFloat();
		System.out.println("El flotante leido fue:"+flotante);

		int centinela = 0;

		do{
			System.out.println("Ingrese una opcion asi:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. salir");
			centinela = ConsoleInput.getInt();
		}while(centinela!=5);

	}
}