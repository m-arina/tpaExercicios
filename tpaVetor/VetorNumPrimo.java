import java.util.Scanner;
public class VetorNumPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int E = 10; 
		int i, a[], j, resto0= 0;
		
		a = new int[E];
		
		for(j=0; j<E; j++) {
			System.out.println("Insira um número e veja se ele é primo ou não");
			a[j] = in.nextInt();
			
			for (i=1; i<a[j]; i++) {
				if (a[j] % i == 0) {
					resto0++;
				}
			}
		
			if (resto0 >= 2) {
				System.out.println("O número "+a[j]+" NÃO é primo.");
			} else {
				System.out.println("O número "+a[j]+" é primo!");
			}
			resto0 = 0;
		}
		in.close();
		
	}

}


/* 3.	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento 
 * do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.
 */
