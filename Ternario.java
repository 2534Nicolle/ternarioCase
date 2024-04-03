package lpa2;
import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		double a;
		Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o valor:");
        a = ler.nextDouble();
        
        System.out.println(a % 5 == 0 ? ("O número " + a + " é multiplo por 5."):("O número " + a + " não é multiplo por 5.") );
        ler.close();
    }

}

