import java.util.Scanner;

public class ex6_switch {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner (System.in);

		float s1, s2, df;
		int cargo;
		
		System.out.println("Descubra todos os dados sobre sua mudan�a salarial.");
		System.out.println("Digite seu sal�rio atual:");
		s1 = leitor.nextFloat();
		 
		System.out.println("Digite o c�digo de seu cargo:");
		System.out.println("001 - Diretor");
		System.out.println("002 - Engenheiro");
		System.out.println("003 - T�cnico");
		System.out.println("004 - Gerente");
		System.out.println("005 - Analista");
		System.out.println("006 - Coodenador");
		cargo = leitor.nextInt();
		
		
		
		switch (cargo) {
		
		case 001:
			System.out.println("Seu novo sal�rio:   "+(s1+(s1/100*10))+" , seu antigo sal�rio: "+s1+" e a diferen�a � de "+s1/100*10 );
		break;
		case 002:
			System.out.println("Seu novo sal�rio:   "+(s1+(s1/100*20))+" , seu antigo sal�rio: "+s1+" e a diferen�a � de "+s1/100*20 );
		break;
		case 003:
			System.out.println("Seu novo sal�rio:   "+(s1+(s1/100*30))+" , seu antigo sal�rio: "+s1+" e a diferen�a � de "+s1/100*30 );
		break;
		case 004:
			System.out.println("Seu novo sal�rio:   "+(s1+(s1/100*10))+" , seu antigo sal�rio: "+s1+" e a diferen�a � de "+s1/100*10 );
		break;
		case 005:
			System.out.println("Seu novo sal�rio:   "+(s1+(s1/100310))+" , seu antigo sal�rio: "+s1+" e a diferen�a � de "+s1/100*30 );
		break;
		case 006:
			System.out.println("Seu novo sal�rio:   "+(s1+(s1/100*20))+" , seu antigo sal�rio: "+s1+" e a diferen�a � de "+s1/100*20 );
		break;
			default:
				System.out.println("Seu novo sal�rio:   "+(s1+(s1/100*40))+" , seu antigo sal�rio: "+s1+" e a diferen�a � de "+s1/100*40 );
		
		
		
		
		
		
		
		
		
		
		
		 
}
}
}
