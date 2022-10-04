package com.generation;

import java.util.Scanner;

public class Codigo6 {
	//Falta clase main para ejecucion
	public static void main (String [] args) {
		
		//Falta palabara reservada new
		int[] n = new int[20];
		
		//Flata signo + para el correcto aumento del contador
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      //Error la salida de mensaje | cambiando a System.out.print
	      System.out.print(n[i] + " "); 
	    }
	    
	    //Error en la salida de mensaje| falta una n
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //Error falta cierre de parentesis
	    //cambiando metodo de entrada de datos a utilizacion de Scanner
	    
	    Scanner s = new Scanner(System.in);
	    int opcion = Integer.parseInt(s.nextLine());
	    
	    //Error en la colocacoin de simbolos : y ? 
	    int multiplo = (opcion == 1) ? 5 : 7;
	    
	    //Error en la declaracioin de objets del arreglo | cambiando de char a int
	    //Error en la declaracion del for
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	        //Error en el if, falta } de cierre
	      }else {
	    	  //Error en la salida dle mansaje | Cambiando de in a out
	        System.out.print(e + " ");
	      }
	    }
		
	}//main
}//class
