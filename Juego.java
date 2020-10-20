public class Juego {

	public static int[] crearIndices(int total)
	{
		
	}
	
	public static void imprimirbandera(string[] banderas, int indice)
	{
		String fila[];

		for (int i = indice; i<indice+20; i++){
			if(i == indice)
			{
				fila = banderas[i].split(";");
				System.out.println("Pais: "+fila[0]);
			}	
			else{
				System.out.println(banderas[i]);
			}
		}
	}

	public static void capitales()
	{
		System.out.println("CAPITALEESSSS");
	}

	public static void personajes()
	{
		System.out.println("comprombacion invocacion");
	}

	public static void menuPrincipal()
	{
		int centinela = 0;
		int indices[] = crearIndices(20);
		indices = RandomizeArray(indices);
		String banderas[] = ConsoleFile.read("info_banderas.csv");

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
						personajes();
						break;
				case 2: System.out.println();
						capitales();
						break;
				case 3: System.out.println("Gracias por jugar!");
						break;

				default: System.out.println();
				System.out.println("Opcion no disponible");
			}

		}while(centinela!=3);
		
	}
	
	public static void main(String[] args) {
		menuPrincipal();
	}
}