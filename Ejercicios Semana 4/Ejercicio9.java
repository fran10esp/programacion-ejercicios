import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String [] args ) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número de tipo double");
		double a = entrada.nextDouble();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduzca un número de tipo int");
		int b = entrada2.nextInt();
		
		float c;
		c=(float)a+b;
		System.out.println("El resultado de la suma es: "+c);
		
	
	}
}
