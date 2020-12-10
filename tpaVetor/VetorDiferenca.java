import java.util.Scanner;
public class VetorDiferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10; // mudar para 10
		int i, j, a[], b[], c[], x=0, diferenca=0;
		boolean igual = false; 
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º elemento de A:");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º elemento de B:");
			b[i] = in.nextInt();
		}
		
		System.out.print("A = "); // elementos do vetor A
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
	
		System.out.println("\n");
	
		System.out.print("B = "); // elementos do vetor B
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
	
	
		for(i=0; i<TAM; i++) {
			for (j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					igual = true;
				}
			}
			if (igual == false) {
				c[x] = a[i];
				x++;
				diferenca++; // elementos diferentes
			}
			igual = false; // resetar
		}
		
		System.out.println("\n");
		
		System.out.print("A - B = "); // diferença dos vetores (vetor C)
		for(i=0;i<x;i++) {
			System.out.print(c[i]+" ");
		}
		in.close();
	}

}
		


//A = [ 1 2 3 4 5 ]
//B = [ 1 2 3 6 7 ] 
//C = [ 4 5 ]


/*7. Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um programa que crie um vetor C que é a 
 * diferença dos conjuntos formados pelos elementos dos vetores A e B. Diferença de conjuntos = todos os elementos do 
 * conjunto A que não existem no conjunto B.
 */