import java.util.Scanner;

public class ex3_switch {

	public static void main(String[] args) {
		
		int num;
		System.out.println("	MENU   ");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println(" 	1    ");
		System.out.println(" 	2    ");
		System.out.println(" 	3    ");
		System.out.println(" 	4    ");
			
		Scanner leitor= new Scanner (System.in);
		num= leitor.nextInt();
			
			
			
			
			switch (num) {
			 case 1:
					System.out.println("Executa a rotina de Inclusão de Alunos");
				break;
			 case 2:
					System.out.println("Executa a rotina de Alteração de Alunos");
				break;
			 case 3:
					System.out.println("Executa a rotina de Exclusão de Alunos");
				break;
			 case 4:
					System.out.println("Executa a rotina de Consulta de Alunos");
				break;
				
				
				
			
			
			
			
			
			
			
			
  }
 }
}
