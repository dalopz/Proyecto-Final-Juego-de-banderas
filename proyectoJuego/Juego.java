import java.util.*;
import java.util.Arrays;


public class Juego {

public static void continuar()
	{
		int elegir_bandera = 0;
		int indices[] = crearIndices(24);
		indices = arregloAleatorio(indices);
		String banderas[] = ConsoleFile.read("info_banderas.csv");
		int opc = 0;

		do{
			System.out.println();
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"1. "+ConsoleColors.WHITE_BOLD_BRIGHT+"Conocer otro pais\033[0m");
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"2. "+ConsoleColors.WHITE_BOLD_BRIGHT+"Regresar a menu principal\033[0m");
			opc = ConsoleInput.getInt();

			switch(opc)
			{
				case 1:
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT+"                          Volvamos al avion y...\033[0m");
						elegir_bandera = elegirBandera(indices);
						infoBandera(banderas, indices[elegir_bandera]);
						dibujarBandera(banderas, indices[elegir_bandera]);
						break;

				case 2:
						break;

				default: System.out.println();
				System.out.println(ConsoleColors.RED_BRIGHT+"Opcion no disponible");
			}
	
		}while(opc!=2);
		
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
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
	 		}
	 		if(fila[i].equals("2"))
	 		{ 
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
	 		}		
			if(fila[i].equals("5"))
	 		{
	 			System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
	 		}	
	 		if(fila[i].equals("6"))
	 		{ 
	 			System.out.print(ConsoleColors.PURPLE_BACKGROUND+"   ");
	 		}	
	 		if(fila[i].equals("7"))
	 		{
	 			System.out.print(ConsoleColors.CYAN_BACKGROUND+"   ");
	 		}	
	 		if(fila[i].equals("8"))
	 		{
	 			System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
	 		}	 				 			 			 			 		 		
		}
		System.out.println(ConsoleColors.RESET);
	}

	public static int elegirBandera(int[] indices)
	{
		int opc = 0;

		do{

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"                          Vamos a conocer paises!                 ");
			System.out.println();
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                     |                             ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                     |                             ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                     |                             ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                   .-'-.                           ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                  ' ___ '                          ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                        ---------'  .-.  '---------                ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"        _________________________'  '-'  '_________________________");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"        ''''''-|---|--/     ==][^',_m_,'^][==/     --|---|-''''''  ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                        |   /  ||/   H    ||  |    /               ");
			System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                        '--'   OO   O|O   OO   '--'                ");
			System.out.println();
			System.out.println();
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"                       ingresa un numero entre 1 y "+indices.length+ "\033[0m");
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
				fila = banderas[i].split(";");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"                                   &&&&        ");
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"                                 &&    &&      ");
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"                                 &&    &&      ");
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"                                  &&&&&&       ");
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"                                   &&&&        ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                              ******"+"\033[1;91m"+"&&"+"\033[1;97m"+"******   ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                             ****************  ");
				System.out.println();
				System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"                          Has llegado a: "+ConsoleColors.WHITE_BOLD_BRIGHT+fila[0]);
				System.out.println();
				System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT+"              Capital: "+ConsoleColors.WHITE_BOLD_BRIGHT+fila[1]);
				System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT+"  Idioma: "+ConsoleColors.WHITE_BOLD_BRIGHT+fila[2]);
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"  Continente: "+ConsoleColors.WHITE_BOLD_BRIGHT+fila[3]);
				System.out.println();
				System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT+"              Moneda: "+ConsoleColors.WHITE_BOLD_BRIGHT+fila[4]);
				System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT+"  Gentilicio: "+ConsoleColors.WHITE_BOLD_BRIGHT+fila[5]);
				System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT+"  Religion: "+ConsoleColors.WHITE_BOLD_BRIGHT+fila[6]);
				System.out.println(ConsoleColors.RESET+" ");
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
				System.out.println();
				System.out.println();
			 	System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +"  _____               _        _    _____   _                ");         
			  	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" / ____|          (_)| |      | |  / ____(_) | (_)           ");         
			 	System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +" | |     __ _ _ __  _| |_ __ _| | | |     _| |_ _  ___   __  ");  
			 	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" | |    / _` | '_  | | __/ _` | | | |    | | __| |/ _  / __| ");
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +" | |___| (_| | |_) | | || (_| | | | |____| | |_| |  __/ __   ");
			  	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" |_____ __,_ | .__/|_|__|__,_ |_| |_____ |_| __|_| ___||___/ ");
			  	System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT +"             | |                                             ");
			  	System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"             |_|  La Vuelta al Mundo en Java...                                           "+"\033[0m");					
	            System.out.println();                                     
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"1. "+ConsoleColors.WHITE_BOLD_BRIGHT+"Comenzar");
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"2. "+ConsoleColors.WHITE_BOLD_BRIGHT+"Acerca de"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"3. "+ConsoleColors.WHITE_BOLD_BRIGHT+"Salir"+ConsoleColors.RESET);
				
			centinela = ConsoleInput.getInt();

			switch(centinela)
			{
				case 1: System.out.println();
						elegir_bandera = elegirBandera(indices);
						infoBandera(banderas, indices[elegir_bandera]);
						dibujarBandera(banderas, indices[elegir_bandera]);
						continuar();
						break;
				case 2:
				System.out.println();
				System.out.println();
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"  _____        __                                _                ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+" |_   _|      / _|                              (_)               ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"   | |  _ __ | |_ ___  _ __ _ __ ___   __ _  ___ _   ___    _     ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"   | | | '_  |  _/ _  | '__| '_ ` _  )/ _` |/ __| |/ _  | '_  )   ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"  _| |_| | | | || (_) | |  | | | | | | (_| | (__| | (_) | | | |   ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+" |_____|_| |_|_|  ___/|_|  |_| |_| |_| __,_| ___|_| ___/|_| |_|   ");
				System.out.println();
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"Realizado por:"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"* Carlos Tamayo - github/serecosistemico ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"* David Lopez - github/dalopz "+ConsoleColors.RESET);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"Agradecimientos"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"* Felipe Buitrago - github/felipebj18 ");
					System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"* Andres Bedoya - github/xaca               XACA RANA");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                                                        &#&&*            ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                                                   @#.    */(*(%@&(      ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                      ,/(%%#((,               (%@@&&&&&&&&&/  ,@(       *,,,,,,,,%@&,    ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                   &@##%&/*/(*. *&&@%/,.                     ..         #,,,,,,,,*&@@    ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                 @%,,,,,,,,,,,,(*                                       %#(,*,,,,@@@@@   ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"               *@(,,,,,,,,,,,,,,,# .                                    *@@@@@/@@@@@@@(  ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"              @&,,,,,&,,,,,,,,,,%*                                      %@@@@@@@@@@@@    ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"               @*,*,,#@,,,,,*,,,#@(                                    .,.#@@@@@@@@@&    ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"              &&@@@@@%@/#%*(,%@@@@,                                      ,,*@@@@@@&      ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"             @* %&*&@@@@@@@@@@@@@%                                         (   .*@       ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"           *@.   ,(*@@@@@@@@@@@&/                                         .   ,*%&       ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"           @,       ,&@@@@@@%.                                          .  ..   *@       ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"         ,@%/                            ./(/*.                  ,((###((##((#&@&.       ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"          @/ *(****//////*****//(#/,           .,/&@@&@@&&@@@@@@@&                       ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"         ..,@//@&.                 .,*#&@@@&.                                            ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                   *****                                                                 ");
				System.out.println(); 
				System.out.println(ConsoleColors.RESET);
				break;

				case 3: 
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+ "  _ __   ___  ___   __   _____ _ __ ___   ___  ___   _ __  _ __ ___  _ __ | |_ ___   ");
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" | '_  )/ _  / __| |    / / _ | '_ ` _  )/ _  / __| | '_  | '__/ _  | '_  | __/  _   ");
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+ " | | | | (_)| __ |  (  V /  __/ | | | | | (_)  __   | |_) | | | (_) | | | | | | (_)| ");
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+" |_| |_| ___/|___/   ( _/|___ |_| |_| |_| ___/|___/ | .__/|_| ( ___/|_| |_|_|   ___/ ");
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+ "                                                    |_|                              ");
				System.out.println();
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                             ,#@@@@@@@&(.   ,@#&#@@  ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"              ,(@@@@@@@&#,            /@(  &%  &@    ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"            @@%                  %@*    &%    &@     ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"               @@&          &@.      %%      #@      ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                  &@@ .@&         &&        /@       ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                    #@         %&          ,@,       ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                    #@      %&            .@*        ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                    #@    @@@@            @#         ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                    #@  @@.@@@&@%        @&          ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                    #@@@@@.      @@     @@           ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                    (@*            #@@ @@            ");
				System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT+"                                     @@              ");
				System.out.println(ConsoleColors.RESET+" ");
						break;



				default: System.out.println();
				System.out.println(ConsoleColors.RED_BRIGHT+"Opcion no disponible");
			}

		}while(centinela!=3);
		
	}
	// Funcion principal e invocacion menu principal
	public static void main(String[] args) {
		menuPrincipal();
	}
}