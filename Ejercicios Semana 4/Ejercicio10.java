import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String args []) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca una temperatura en grados celsius: ");
		float C = entrada.nextFloat();
	
		
		float d;
		d=(C/5)*9+32;
		System.out.println("El resultado de la conversión en Fahrenheit será : " + d);
		
	}
}
