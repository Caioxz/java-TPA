import java.util.*;

public class Inteiro {
	public static void main (String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n;
		
		System.out.print ("Digite um número");
		
		n = in.nextInt();
		
		if (n < 0) {
			System.out.println("Negativo");
			
		} else if (n == 0) {
			 		System.out.println("Neutro");	
		} else {
			
			System.out.println("Positivo");
			
		}
				
		in.close();
		
	} 	


}
//se n for menor que 0 vai ser negativo, se n for igual a zero sera neutro