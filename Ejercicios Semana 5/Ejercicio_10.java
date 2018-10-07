import java.util.Scanner;

public class Ejercicio_10 {

		public static void main(String[] args) {
			
			double i;
			
			Scanner sc = new Scanner (System.in);
	        System.out.println("Introduce una cantidad de dinero: ");
	        double dinero = sc.nextDouble();
	        
	        i=(int)dinero/500;
	        System.out.println("500€ : " + i);
	        dinero=dinero%500;
	      
	        i=(int)dinero/200;
	        System.out.println("200€ : " + i);
	        dinero=dinero%200;    

	        i=(int)dinero/100;
	        System.out.println("100€ : " + i);
	        dinero=dinero%100;    

	        i=(int)dinero/50;
	        System.out.println("50€ : " + i);
	        dinero=dinero%50;    

	        i=(int)dinero/20;
	        System.out.println("20€ : " + i);
	        dinero=dinero%20;    

	        i=(int)dinero/10;
	        System.out.println("10€ : " + i);
	        dinero=dinero%10;    

	        i=(int)dinero/5;
	        System.out.println("5€ : " + i);
	        dinero=dinero%5;
	        
	        i=(int)dinero/2;
	        System.out.println("2€ : " + i);
	        dinero=dinero%2;
	        
	        i=(int)dinero/1;
	        System.out.println("1€ : " + i);
	        dinero=dinero%1;
	        
	        i=(int)dinero/1;
	        System.out.println("1€ : " + i);
	        dinero=dinero%1;
	        
	        i=(int)(10*dinero)/5;
	        System.out.println("0.50€ : " + i);
	        dinero=dinero%0.5;
	        
	        i=(int)(10*dinero)/2;
	        System.out.println("0.20€ : " + i);
	        dinero=dinero%0.2;
	        
	        i=(int)(10*dinero)/1;
	        System.out.println("0.10€ : " + i);
	        dinero=dinero%0.1;
	        
	        i=(int)(100*dinero)/5;
	        System.out.println("0.05€ : " + i);
	        dinero=dinero%0.05;
	        
	        i=(int)(100*dinero)/2;
	        System.out.println("0.02€ : " + i);
	        dinero=dinero%0.02;
	        
	        i=(int)(100*dinero)/1;
	        System.out.println("0.01€ : " + i);
	        
	        
	        
	     
	        
	       
	        
		}
}
