package com.generation;

import java.util.Scanner;

public class Codigo5 {

	//falta clase main para la ejecucion
	
	public static void main (String[] args) {
		
			//importar la clase Scanner desde Java.util
			//Falta parametro System.in en el constructor de Scanner
		    Scanner s = new Scanner(System.in);
		    System.out.print("Introduzca un número: "); //Error en el mensaje cerrando con ' en lugar de "
		    String ni = s.nextLine();
		    //Error dando un valor String a una variable int 
		    int c = Integer.parseInt(ni);
		    
		    int afo = 0;
		    int noAfo = 0;
		    //Error en variable de comparación, cambiando de ni a c
		    while (c > 0) {
			  int digito = (int)(c % 10);
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
		    }//else
		      
		      //Error en colocacion de segmento de codigo
		      c /= 10;
	
		    
		  }//While
		    //Error en la colocación de segmento de codigo
		    if (afo > noAfo) {
		    	//Error en la salida de mensaje, falta una letra t
		    	//Cambiando variable de c a ni para mostrar el numero introducido al inicio
		      System.out.println("El " + ni+ " es un número afortunado.");
		    } else {
		      System.out.println("El " + ni + " no es un número afortunado.");
		    }
		
	}//main
	
}//class
