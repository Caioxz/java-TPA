import java.util.Scanner;

public class Distancia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double m, km; 
		
		System.out.print("Digite a quantidade percorrida em metros: ");
		m = in.nextDouble();
		km = m/1000;
		System.out.print("Quantidade percorrida em quil�metros: "+ km);
		
		in.close();
		//deve caulcular primeiro metros(1000 mestros= 1km) e depois quilometros +km 
	}
}
