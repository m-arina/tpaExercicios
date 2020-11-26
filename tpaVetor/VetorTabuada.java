import java.util.Scanner;
public class VetorTabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int E = 5;
		int i, r, j, a[];
		
		a = new int[E];
		
		
		for(j=0; j<=4; j++) {
			System.out.println("Insira um número para obter sua tabuada:");
			a[j] = in.nextInt();
			
				for (i=0; i<=10; i++) {
					r = a[j]*i;
			System.out.println(a[j]+" x "+i+ " = "+r);
			
			}
		}
		in.close();
	}

}


/* 2. Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um 
 * dos elementos do vetor A.
 */