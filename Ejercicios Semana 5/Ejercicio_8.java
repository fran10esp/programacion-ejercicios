import java.util.Scanner;

public class Ejercicio_8 {
	
	public static void main(String [] argv) {
		
		float sueldoT;
		
		Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu sueldo: ");
        float sueldo = sc.nextInt();
        
        System.out.println("Introduce tus a�os de antig�edad: ");
        int a�os = sc.nextInt();
        
        if(sueldo<500 && a�os>=10) {
        	
        	sueldoT= sueldo + sueldo*20/100;
        	System.out.println("Tu sueldo final es de: " + sueldoT + "�");
        }
        else if(sueldo<500 && a�os<10) {
        	
        	sueldoT= sueldo + sueldo*5/100;
        	System.out.println("Tu sueldo final es de: " + sueldoT + "�");
        }
        else if(sueldo>=500) {
        	
        	System.out.println("Tu sueldo no sufrir� cambios");
        }
        else {
        	
        }
		
	}
}
