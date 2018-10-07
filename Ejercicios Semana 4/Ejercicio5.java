
public class Ejercicio5 {
	
	public static void main(String args []) {
		
		int a,b;
		boolean r,s;
		a = 3;
		b = 8;
		r = a == 0 || b >= a;
		s = a != 0 && b < a;
		System.out.println("r:" + r);
		System.out.println("s:" + s);
		/*En este caso, declaramos las variables de tipo boolean "r" y "s",
		y las comparamos con las variables de tipo entero "a" y "b.
		Tanto en "r" como en "s", una de las dos comparaciones se cumple, por lo que solo
		una imprimirá "true" debido al operador lógico*/
	}
}
