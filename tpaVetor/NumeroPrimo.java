import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int E = 10; 
		int i, a[], j;
		
		a = new int[E];
		
		for(j=0; j<E; j++) {
			System.out.println("Insira um n�mero e veja se ele � primo ou n�o");
			a[j] = in.nextInt();
			
			int resto0= 0;
			for (i=1; i<a[j]; i++) {
				if (a[j] % i == 0) {
					resto0++;
				}
			}
		
			if (resto0 >= 2) {
				System.out.println("O n�mero "+a[j]+" N�O � primo.");
			} else {
				System.out.println("O n�mero "+a[j]+" � primo!");
			}
		
		}
		in.close();
		
	}

}


/* 3.	Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento 
 * do vetor A e uma mensagem indicando se o respectivo elemento � um n�mero primo ou n�o.
 */
