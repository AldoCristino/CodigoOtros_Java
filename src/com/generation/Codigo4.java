package com.generation;

import java.util.Scanner;

public class Codigo4 {

	//Falta la clase main para la ejecucion 
	
	public static void main (String[] args) {
		//importar la clase Scanner desde java.util
		//Falta parametro System.in en el constructor de Scanner
		
		Scanner s = new Scanner(System.in);
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    String j2 = s.nextLine();
	    //Poniendo tuLowerCase en los valores de j1 y j2 para reduccion de errores de comparacion 
	    j1 = j1.toLowerCase();
	    j2 = j2.toLowerCase();
	    //Un parentesis de mas
	    //Falta instruccion break en todos los casos
	    //utilizando metodo equals para comparacion de cadenas
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	    	int g = 2;
	      	switch(j1) {
	        case "piedra":
	        	if (j2.equals( "tijeras")) {
	        		g = 1;
	        	}
	        	break;
	        case "papel":
	        	if (j2.equals("piedra")) {//falta llave de cierre del if
	        		g = 1;
	        	}
	        	break;
	        case "tijera":
	        	if (j2.equals("papel")) {
	        		g = 1;
	        		}
	        		break;
	        default:
	        	System.out.println("Eleccion de jugadr incorrecta");
	        	break;
	      }
	      System.out.println("Gana el jugador " + g);
	    }   
	    
	}//main
}//class
