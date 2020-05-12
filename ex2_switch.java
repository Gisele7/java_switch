import java.util.Scanner;

public class ex2_switch {

	
		public static void main(String[] args) {
			
			int cod, qtd;
			double valor_total = 0;
			
			Scanner leitor = new Scanner (System.in);
			
			System.out.println("Produto         │ Código │ Preço " );
			System.out.println("Cachorro-quente │ 100    │ 3,20  " );
			System.out.println("Bauru simples   │ 101    │ 4,30  " );
			System.out.println("Bauru com ovo   │ 102    │ 5,50  " );
			System.out.println("Hambúrger       │ 103    │ 3,20  " );
			System.out.println("Cheeseburguer   │ 104    │ 4,30  " );
			System.out.println("Refrigerante    │ 105    │ 4,00  " );
			
			
		
			System.out.println("Digite o código do produto:");
			cod = leitor.nextInt();
			
			System.out.println("Digite a quantidade:");
			qtd = leitor.nextInt();
			
			switch (cod) {
			case 100:
				System.out.println("Cachorro-quente");
				valor_total = qtd * 3.2;
				break;
			case 101:
				System.out.println("Bauru simples");
				valor_total = qtd * 4.3;
				break;
			case 102:
				System.out.println("Bauru com ovo");
				valor_total = qtd * 5.5;
				break;
			case 103:
				System.out.println("Hambúrguer");
				valor_total = qtd * 3.2;
				break;
			case 104:
				System.out.println("Cheeseburger");
				valor_total = qtd * 4.3;
				break;
			case 105:
				System.out.println("Refrigerante");
				valor_total = qtd *4.0;
				break;
				
		}			
			System.out.println("Valor total: " +valor_total);
			
		
			}	
		}	