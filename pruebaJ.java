import java.util.*;
import java.util.Arrays;
import java.lang.System;


public class pruebaJ {

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

	public static int elegirBandera(int[] indices)
	{
		int opc = 0;

		do{
			System.out.println("Vamos a escoger un pais al azar!\ningresa un valor entre 1 y "+indices.length);
			opc = ConsoleInput.getInt();
		}while(opc==0);

		return opc-1;
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
				imprimirFila(banderas[i].split(";"));
				fila = banderas[i].split(";");
				System.out.println("Pais: "+fila[0]);
			}	
			else{
				System.out.println(banderas[i]);
			}
		}
	}
		//Menu principal del juego
	public static void menuPrincipal()
	{
		
		int centinela = 0, elegir_bandera = 0;
		int indices[] = crearIndices(24);
		indices = arregloAleatorio(indices);
		String banderas[] = ConsoleFile.read("info_banderas.csv");

		do{
			System.out.println();
			System.out.println(ConsoleColors.WHITE_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+"   ___   ___  ___  _____  _____  ____  __ "+"\033[0m"); 
 			System.out.println(ConsoleColors.WHITE_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+"  / _ | / _  / _  / __/ |/ / _  / __/ / / "+"\033[0m");
 			System.out.println(ConsoleColors.WHITE_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+" / __ |/ ___/ , _/ _//    / // / _/  /_/  "+"\033[0m");
 			System.out.println(ConsoleColors.WHITE_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+"/_/ |_/_/  /_/|_/___/_/|_/____/___/ (_)   "+"\033[0m");					
            System.out.println(ConsoleColors.GREEN_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+"  El juego donde aprendes, adivinando...  "+"\033[0m");                                     
			System.out.println();
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"1.COMENZAR"+"\033[0m");
			System.out.println();
			System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"2. SALIR :( "+"\033[0m");
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1: System.out.println();
						elegir_bandera = elegirBandera(indices);
						dibujarBandera(banderas, indices[elegir_bandera]);
						break;
				/*case 2: System.out.println();
						elegir_bandera = elegirBandera(indices);
						dibujarBandera(banderas, indices[elegir_bandera]);
						break;*/
				case 2: System.out.println("Gracias por jugar! ");
						break;

				default: System.out.println();
				System.out.println("Opcion no disponible");
			}

		}while(centinela!=2);
		
	}
	// Funcion principal e invocacion menu principal
	public static void main(String[] args) {
		menuPrincipal();
	}
}