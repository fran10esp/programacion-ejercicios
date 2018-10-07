import java.util.Scanner;

public class Ejercicio_2 {
	
	public static void main(String[] arg){
		
		int resultado;
		
		Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();
       
        if(num2==0) {
        	
        	System.out.println("No se puede dividir por cero usando enteros");
        }
        else {
        	resultado= num1/num2;
            System.out.println("El resultado es: " + resultado);
                    }
        
	}
}
