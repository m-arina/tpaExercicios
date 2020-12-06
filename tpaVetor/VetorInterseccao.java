import java.util.Scanner;
public class VetorInterseccao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 3; // mudar para 10
		int i, a[], b[], c[], j, x = 0, iguais=0;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
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
		
		System.out.println("\n");
		System.out.print("A ∩ B = "); // intersecção dos vetores
		
		for(i=0; i<TAM; i++) {
			for (j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					iguais++;
				}
				
			}
		}
		
		if (iguais == 0) {
			System.out.println("Não há valores iguais, logo o vetor C está vazio");
		}else {
			for(i=0; i<TAM; i++) {
				for (j=0; j<TAM; j++) {
					if (a[i] == b[j]) {
						c[x] = a[i];
						System.out.print(c[x]+" ");
						x++;
					}
					
				}
			}
			
		}
		in.close();
	}
}

// A = [ 2 4 6 8 10]
// B = [ 1 2 4 5 7 ] 
// C = [ 2 4 ]


/* 6. Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um programa que 
 * realize a intersecção  dos vetores A e B para produzir um vetor C. 
 * Interseção de conjuntos = todos os elementos que existem em A e também existem em B.
 */