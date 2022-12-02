package futbol;
import java.util.Scanner;
public class escolaFutbol {
public static void main (String[] args) {
	Scanner in = new Scanner (System.in);
	int a=0;
	System.out.println("Digite classifcar alunos");
	a = in.nextInt();
	switch (a) {
	case 6: 
	System.out.println("Digite dente de leite");
	break;
	case 7:
		System.out.println("Digite junior");
			break;
	case 8:
			System.out.println("Digite junior max");
			break;
	case 9:
			System.out.println("Digite junior master");
			break;
	case 10:
			System.out.println("Digite master");
			break;
	default:
			System.out.println("Inválido");
	}
	in.close();
	}
}
//o programa tem q classificar os niveis dos jogadores, se o nivel daquele jogador for maior que o esperado ele vai para proxima case, se passar do nivel max vai dar invalido

