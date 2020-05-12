import java.util.Scanner;

public class ex1_switch {

	public static void main(String[] args) {
		
		int cod;
		
		System.out.println(" Código  │ Produto    │");
		System.out.println(" 001     │ Parafuso   │");
		System.out.println(" 002     │ Porca      │");
		System.out.println(" 003     │ Prego      │");
		System.out.println(" 004     │ Ferramenta │");
		
		
		System.out.println("Digite o código do produto desejado:");
		
			
			Scanner leitor = new Scanner (System.in);
			cod = leitor.nextInt();

			
		
		switch (cod) {
		
		case 001:
			System.out.println("Parafuso");
			break;
		case 002:
			System.out.println("Porca");
			break;
		case 003:
			System.out.println("Prego");
			break;
		case 004:
			System.out.println("Ferramenta");
			break;
		default:
			System.out.println("Diversos");
			
	
		
		
		
	 }
		}	
	}	
	
		
