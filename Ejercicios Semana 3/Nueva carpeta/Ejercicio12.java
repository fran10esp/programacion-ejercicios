
public class Ejercicio12 {
	
	public static void main(String arg[]) {
		
		int a=3,b=5,c;
		short d=7,e=9,f;
		long g=2,h=3,i;
		byte j=4,k=5,l;
		char m='a';
		char n='b';	
		char o;
		c=a+b;
		//f=d-e;
		/*al operar dos variables short el resultado se guarda como int,
		y al estar f definida como short no guarda el resultado. Lo mismo ocurre
		con la variable tipo byte */
		i= g/h; // El resultado al ser long no coje decimales
		//l=j*k;		
		//o=m+n;	no se puede operar con variables tipo char
		System.out.println(c);
		System.out.println(i);
	}

}
