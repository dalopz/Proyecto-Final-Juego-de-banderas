public class Juego {

	public static void menuPrincipal()
	{
		int centinela = 0;

		do{
			System.out.println();
			System.out.println("Escoge una opcion: ");
			System.out.println("1. Jugar con personajes");
			System.out.println("2. Jugar con capitales");
			System.out.println("3. SALIR");
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1: System.out.println();
						break;
				case 2: System.out.println();
						break;
				case 3: System.out.println("Gracias por jugar!");
						break;
				default: System.out.println("Opcion no disponible");
			}

		}while(centinela!=3);
		
	}
	
	public static void main(String[] args) {
		menuPrincipal();
	}
}
