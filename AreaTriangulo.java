import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		double b, h, area;
		System.out.print("Digite a base do tri�ngulo: ");
		b = in.nextDouble();
		System.out.print("Digite a altura do tri�ngulo: ");
		h = in.nextDouble();
		area = (b * h) /2;
		System.out.println();
		System.out.print("A �rea do triangulo � "+ area);
		in.close();
		
	}
}
