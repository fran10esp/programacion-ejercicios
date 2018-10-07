import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String args []) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca los segundos: ");
		int s = entrada.nextInt();
		
		int h,m,r;
		
		h=s/3600;
		m=s%3600/60;
		r=m%60;
		System.out.println(h+ " hora/s " + m + " minuto/s " + r + " segundo/s");
		
	}
}
