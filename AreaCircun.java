import java.util.Scanner;

public class AreaCircun {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double r, area;
		
		System.out.print("Digite o valor do raio de uma circunferência: ");
		r = in.nextDouble();
		area = 3.14 * (r*r);
		
		System.out.println();
		System.out.print("A área desta circunferência é "+ area);
		
		in.close();
	}
}
