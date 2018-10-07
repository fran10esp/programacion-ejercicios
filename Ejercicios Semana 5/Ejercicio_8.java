import java.util.Scanner;

public class Ejercicio_8 {
	
	public static void main(String [] argv) {
		
		float sueldoT;
		
		Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu sueldo: ");
        float sueldo = sc.nextInt();
        
        System.out.println("Introduce tus años de antigüedad: ");
        int años = sc.nextInt();
        
        if(sueldo<500 && años>=10) {
        	
        	sueldoT= sueldo + sueldo*20/100;
        	System.out.println("Tu sueldo final es de: " + sueldoT + "€");
        }
        else if(sueldo<500 && años<10) {
        	
        	sueldoT= sueldo + sueldo*5/100;
        	System.out.println("Tu sueldo final es de: " + sueldoT + "€");
        }
        else if(sueldo>=500) {
        	
        	System.out.println("Tu sueldo no sufrirá cambios");
        }
        else {
        	
        }
		
	}
}
