
public class Ejercicio8 {

	public static void main(String args []) {
		
		int a=5,b=3,c=20,d=20;
		c-=++a/b-3+a%b;
		d-=++a/(b+3-4*a)%b;
		 System.out.println("c:" + c);
		 System.out.println("d:" + d);
		 //A pesar de que ambas operaciones son similares, al utilizar paréntesis en la segunda declaración, estos tienen prioridad
	}
}
