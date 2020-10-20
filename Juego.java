import java.util.*;
import java.util.Arrays;


public class Juego {

	public static int[] arregloAleatorio(int[] array){
		Random rgen = new Random();

		for (int i = 0; i<array.length; i++){
			int randomPosition = rgen.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomPosition];
			array[randomPosition] = temp;
		}
		return array;
	}

	public static int[] crearIndices(int total)
	{
		int indices[] = new int[total];
		int contador = 0;
		for(int i=0; i<indices.length; i++){
			indices[i] = contador;
			contador+=20;
		}
		return indices;
	}

	public static void imprimirFila(String fila[])
	{
		for (int i=0;i<fila.length;i++) {
			
	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 		}		
			if(fila[i].equals("5"))
	 		{
	 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("6"))
	 		{
	 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("7"))
	 		{
	 			System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
	 		}	
	 		if(fila[i].equals("8"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
	 		}	 				 			 			 			 		 		
		}
		System.out.println(ConsoleColors.RESET);
	}

	public static void dibujarBandera(String[] banderas, int indice)
	{
		for (int i = indice; i<indice+20; i++){

			imprimirFila(banderas[i].split(";"));
		}
	}

	public static void infoBandera(String[] banderas, int indice)
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

	public static void menuPrincipal()
	{
		int centinela = 0;
		int indices[] = crearIndices(24);
		indices = arregloAleatorio(indices);
		String banderas[] = ConsoleFile.read("info_banderas.csv");

		do{
			System.out.println();
			System.out.println("Escoge una opcion: ");
			System.out.println("1. Informacion bandera");
			System.out.println("2. Grafico de banderas");
			System.out.println("3. SALIR");
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1: System.out.println();
						infoBandera(banderas, indices[0]);
						break;
				case 2: System.out.println();
						dibujarBandera(banderas, indices[0]);
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