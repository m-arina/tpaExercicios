import java.util.Scanner;
public class ParesImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int E = 20;
		int i, a[], b[], par=0, impar=0;
		
		a = new int [E];
		b = new int [E];
	
		for(i=0; i<E; i++) {
				System.out.println("Digite o "+(i+1)+"º valor:");
				a[i] = in.nextInt();
				if (a[i] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
		}
			
		System.out.print("A = ");
		for(i=0;i<E;i++) {
				System.out.print(a[i]+" ");
		}
		
		int contPar = 0;
		int contImpar = par;
			
		for(i=0; i<E; i++) {
				if (a[i]%2 == 0) {
				b[contPar] = a[i];
				contPar++;	
				}
		}
			
		for(i=0; i<E; i++) {
				if (a[i]%2 != 0) {
				b[contImpar] = a[i];
				contImpar++;
				}
		}
		
		System.out.println("\n");
		System.out.print("B = ");
		for(i=0;i<E;i++) {
				System.out.print(b[i]+" ");
		}
		
		in.close();
	}
	
}
		
	
// A = 5 2 4 6 7
// B = 2 4 6 5 7

/* 1.	Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A 
 * utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os 
 * elementos pares de A e nas posições restantes do vetor B armazene os elementos de A 
 * que são ímpares.
 */
