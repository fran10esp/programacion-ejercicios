
public class Ejercicio10 {
	
	public static void main(String arg[]) {
		
		int a=2;
		int b=a;
		System.out.println(b);
		a=10;
		System.out.println(b);
		/*La variable int no cambiará de valor si ejecutamos, porque hemos igualado b y a
		antes de cambiar el valor de a.*/
		
		String c="Hola mundo";
		String d=c;
		System.out.println(d);
		c="Hola Pepe";
		System.out.println(d);
		
		//Con la variable String ocurrirá lo mismo
	}

}
