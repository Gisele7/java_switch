import java.util.Scanner;

public class ex4_switch {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		int cod = 0;
		float n1,n2,n3;
		
		System.out.println("Digite a primeira nota:");
		n1= leitor.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		n2= leitor.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		n3= leitor.nextFloat();
		
		System.out.println("Digite (1) caso queira a média aritmética ou (2) caso queira a média ponderada: ");
		cod = leitor.nextInt();
		
		
		switch (cod) {
		case 1:
			System.out.println("Sua média é: " +(n1+n2+n3)/3) ;
			break;
		case 2:
			System.out.println("Sua média é: " +((n1*3)+(n2*3)+(n3*4))/3);
			break;
		default:
			System.out.println("Código inválido.");
		
		
		
		
		
		
		
		
		
		
}
 }
  }
