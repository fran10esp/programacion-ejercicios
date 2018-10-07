import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String args []) {
		
		
		float cfs, cfc;
		
		Scanner cantidad = new Scanner(System.in);
		System.out.println("Introduzca la cantidad inicial: ");
		float ci = cantidad.nextFloat();
		
		Scanner interes = new Scanner(System.in);
		System.out.println("Introduzca el interés: ");
		float i = interes.nextFloat();
		
		Scanner anyos = new Scanner(System.in);
		System.out.println("Introduzca los años: ");
		float n = anyos.nextFloat();
		
		float h=1+i;
		float cfcp=(float) Math.pow(h, n);
		cfs= ci *(1+i*n);
		cfc= ci *cfcp;
		
	
		
		System.out.println("La cantidad final con interés simple es " + cfs);
		System.out.println("La cantidad final con interés compuesto es " + cfc);
		
	}
}
