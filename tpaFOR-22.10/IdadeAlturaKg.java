import java.util.Scanner;
public class IdadeAlturaKg {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double alt, peso, sup50=0, alt10=0, id10=0, kg40=0, mediaAlt, porcent40=0;
		double pesoMenor=0, pesoMaior=0;
		int idade, idadeMenor, idadeMaior;
		
		System.out.println("Insira sua idade:");
		idade = in.nextInt();
		System.out.println("Insira sua altura:");
		alt = in.nextDouble();
		System.out.println("Insira seu peso:");
		peso = in.nextDouble();
		
		idadeMaior = idade;
		idadeMenor = idade;
		pesoMaior = peso;
		pesoMenor = peso;
		
		if (idade > 50) {
			sup50 = sup50+1;
		}
		if (idade >=10 && idade<=20) {
			alt10 = alt10+alt;
			id10 = id10+1;
		}
		if (peso < 40) {
		kg40 = kg40+1;
		}
		if (idade < idadeMenor) {
			idadeMenor = idade;
			pesoMenor = peso;
		}
		else if(idade > idadeMaior ) {
			idadeMaior = idade;
			pesoMaior = peso;
		}
		
		for (int i=1; i<=24; i++) {
			
			System.out.println("Insira sua idade:");
			idade = in.nextInt();
			System.out.println("Insira sua altura:");
			alt = in.nextDouble();
			System.out.println("Insira seu peso:");
			peso = in.nextDouble();
		
			if (idade > 50) {
				sup50 = sup50+1;
			}
			if (idade >=10 && idade<=20) {
				alt10 = alt10+alt;
				id10 = id10+1;
			}
			if (peso < 40) {
				kg40 = kg40+1;
			}
			if (idade < idadeMenor) {
				idadeMenor = idade;
				pesoMenor = peso;
			}
			else if(idade > idadeMaior ) {
				idadeMaior = idade;
				pesoMaior = peso;
			}
		}
		mediaAlt = alt10/id10;
		porcent40 = (100*kg40)/25;
		
		System.out.println("A quantidade de pessoas com idade superior a 50 anos é de: "+sup50);
		System.out.println("A média das alturas das pessoas com idade entre 20 e 10 anos é: "+mediaAlt+" metros");
		System.out.println("A porcentagem das pessoas com peso inferior a 40 quilos é de: "+porcent40+"%");
		System.out.println("O peso da pessoa mais nova é: "+pesoMenor+"kg");
		System.out.println("O peso da pessoa mais velha é: "+pesoMaior+"kg");
		
		in.close();
	}
}
