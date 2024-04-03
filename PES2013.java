package lpa2;
import java.util.Scanner;

public class PES2013 {

	public static void main(String[] args) {
		
    Scanner ler = new Scanner(System.in);  
    double bonus;
    System.out.println("Quanto é o seu pagamento?:");
    double pagamento = ler.nextDouble();
    
    System.out.println("Quantos anos na empresa");
    int Anos = ler.nextInt();
        
    if (Anos <= 3) {
    	bonus= (pagamento/20);
    	pagamento = pagamento + bonus;
    	System.out.println("Meu pagamento é R$" + pagamento + " com um bônus de R$" + bonus);
    }

	}

}
