import java.util.Scanner;

public class Ejercicio_4 {
	
	public static void main(String[] argv) {
		
		float precio=9;
		float precioTotal;
		
		Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        if(edad<5) {
        	
        	precioTotal = precio - precio*60/100;
        	System.out.println("El precio total será de: " + precioTotal + "€");
        }
        else if (edad>5 && edad<26) {
        	
        	precioTotal = precio - precio*20/100;
        	System.out.println("El precio total será de: " + precioTotal + "€");
        }
        else if (edad>65) {
        	
        	precioTotal = precio - precio*40/100;
        	System.out.println("El precio total será de: " + precioTotal + "€");
        }
        else {
	}
  }     
}
