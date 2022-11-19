/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_javierreyes;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Javier Reyes
 */
public class Lab6P1_JavierReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in); 
        // TODO code application logic here
       boolean salir = false;
       int opcion;
       while(!salir){
           System.out.println("Bienvenido al menu de laboratorio 6");
           System.out.println("las opciones del menu son las siguientes");
           System.out.println("1. El juego de la vida ");
           System.out.println("2. Piedra, papel o ... ");
           System.out.println("3. Blink-182 ");
           System.out.println("4. Salir ");
           opcion = lea.nextInt();
           switch (opcion){
               case 1:
                   System.out.println("");
                   el_juego_de_la_vida();
                   break;
               case 2:
                   System.out.println("");
                   Piedra_papel_o();
                   break;
      
               case 3: 
                   System.out.println("");
                   Blink_182();
                   break;
                   case 4:
                   salir=true;
               break;
           }  
       }  
        System.out.println("Gracias por haber utilizado el menu del laboratorio");
        System.out.println("fin del menu"); 
    }
    
      public static void el_juego_de_la_vida(){      
      Scanner entrada = new Scanner(System.in);
      System.out.println("selecciono el juego de la vida");
      
      
      
      
      
      
      
      
      
      
      System.out.println(""); 
    }    
      public static void Piedra_papel_o(){
      Scanner ola = new Scanner(System.in);
        int res=1,jugadaU;
        String jugada, jugadaM;
        String [] jugadas = {"Piedra", "Papel", "Tijeras","Spock","Lagarto"};
       
        while (res == 1){
        System.out.print( "Jugador. Favor ingresar la jugada: [1:Piedra; 2:Papel; 3:Tijera; 4.Spock; 5.Lagarto]: ");
        jugadaU = ola.nextInt();
            jugada = jugadas [jugadaU - 1];
        jugadaM = jugadas[ 1 + (int) (Math.random () * 1) ];
        
        if ((jugada == "Piedra") && (jugadaM == "Tijeras" ) )
        System.out.print( "GANASTE JUGADOR. La maquina jugo: " + jugadaM + "\n");
            else if ( (jugada == "Papel") && (jugadaM == "Piedra" ) )
            System.out.print( "GANASTE JUGADOR. La maquina jugo: " + jugadaM + "\n");
            else if( (jugada == "Tijeras") && (jugadaM == "Papel" ) )
            System.out.print( "GANASTE JUGADOR. La maquina jugo: " + jugadaM + "\n");
            else if ( (jugada == "Spock") && (jugadaM == "Tijeras" ) )
            System.out.print( "GANASTE JUGADOR. La maquina jugo: " + jugadaM + "\n");
            else if( (jugada == "Lagarto") && (jugadaM == "Spock" ) )
            System.out.print( "GANASTE JUGADOR. La maquina jugo: " + jugadaM + "\n");
        
        
        
            if ( (jugadaM == "Piedra") && (jugada == "Tijeras" ) )  
                System.out.print( "Gano la maquina porque jugo: " + jugadaM + "\n");
                else if ( (jugadaM == "Papel") && (jugada == "Piedra" ) )
                System.out.print ( "Gano la maquina porque jugo: " + jugadaM + "\n");
                else if ( (jugadaM == "Tijeras") && (jugada == "Papel" ) )
                System.out.print( "Gano la maquina porque jugo: " + jugadaM + "\n");
                else if ( (jugadaM == "Spock") && (jugada == "Tijeras" ) )
                System.out.print( "Gano la maquina porque jugo: " + jugadaM + "\n");
                else if( (jugadaM == "Lagarto") && (jugada == "Spock" ) )
                System.out.print( "Gano la maquina porque jugo: " + jugadaM + "\n");
           
            
            if ( ((jugadaM == "Piedra") && (jugada == "Piedra" )) || ((jugadaM == "Papel") && (jugada =="Papel" )) || ((jugadaM == "Tijeras") && (jugada =="Tijeras")) || ((jugadaM == "Spock") && (jugada =="Spock" )) || ((jugadaM == "Lagarto") && (jugada =="Lagarto")) )
               System.out.print( "Empate\n");
               System.out.print( "\nDesea continuar 1:si 0: no");
            res = ola.nextInt();

     }
    
        
        
        
        System.out.println("");   
    }
      public static void Blink_182(){
      Scanner blink = new Scanner(System.in);
      System.out.println("selecciono Blink-182");
          System.out.println("ingrese una fila: ");
          int fila = blink.nextInt();
          System.out.println("ingrese una columna: ");
          int columna = blink.nextInt();
          Random randon = new Random();
		
		int [][] matriz = new int [fila][columna];
		for (char car=97; car<=122;car++ )
                
                
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				matriz[i][j] = randon.nextInt(car); 
			}
		}
		
		String respuesta = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				respuesta = respuesta +" "+ matriz[i][j];
			}
			respuesta = respuesta + "\n";
		}
		System.out.println(respuesta);
          
          System.out.println("");
    }
    
}
