import java.util.*;
import java.util.Arrays;


public class Juego {

	public static int elegirCapital(int[] indices)
	{
		int opc = 0;

		do{
			System.out.println();
			System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"               Que pais crees que es?"+"\033[0m");
			opc = ConsoleInput.getInt();
	
		}while(opc==0);

		return opc-1;
		
	}


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
			System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"Vamos a visitar paises!\n ingresa un numero entre 1 y "+indices.length+"\033[0m");
			opc = ConsoleInput.getInt();

			if(opc>24)
		{
			System.out.println("Opcion no valida");
		}

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
				fila = banderas[i].split(";");
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"Haz llegado a: "ConsoleColors.WHITE_BOLD_BRIGHT+fila[0]+ConsoleColors.RESET);
				System.out.println("Capital: "ConsoleColors.WHITE_BOLD_BRIGHT+fila[1]);
				System.out.println("Idioma: "ConsoleColors.WHITE_BOLD_BRIGHT+fila[2]);
				System.out.println("Continente: "ConsoleColors.WHITE_BOLD_BRIGHT+fila[3]);
			}	
			else{
				//System.out.println(banderas[i]);
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
			 	System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +"  _____               _        _    _____   _                ");         
			  	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" / ____|          (_)| |      | |  / ____(_) | (_)           ");         
			 	System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +" | |     __ _ _ __  _| |_ __ _| | | |     _| |_ _  ___   __  ");  
			 	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" | |    / _` | '_  | | __/ _` | | | |    | | __| |/ _  / __| ");
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +" | |___| (_| | |_) | | || (_| | | | |____| | |_| |  __/ __   ");
			  	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" |_____ __,_ | .__/|_|__|__,_ |_| |_____ |_| __|_| ___||___/ ");
			  	System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +"             | |                                             ");
			  	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"             |_|                                             "+"\033[0m");					
            System.out.println();                                     
			//System.out.println("Escoge una opcion: ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"1. Comenzar");
			//System.out.println("2. Grafico de banderas");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"2. SALIR"+ConsoleColors.RESET);
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1: System.out.println();
						elegir_bandera = elegirBandera(indices);
						infoBandera(banderas, indices[elegir_bandera]);
						dibujarBandera(banderas, indices[elegir_bandera]);
						elegirCapital(indices);
						break;
				/*case 2: System.out.println();
						elegir_bandera = elegirBandera(indices);
						dibujarBandera(banderas, indices[elegir_bandera]);
						break;*/
				case 2: System.out.println("Gracias por jugar!");
						break;

				default: System.out.println();
				System.out.println(ConsoleColors.RED_BRIGHT+"Opcion no disponible");
			}

		}while(centinela!=2);
		
	}
	// Funcion principal e invocacion menu principal
	public static void main(String[] args) {
		menuPrincipal();
	}
}