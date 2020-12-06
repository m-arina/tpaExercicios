import java.util.Scanner;
public class VetorFatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 15; // mudar para 15
		int i, j, fat = 1;
		long a[], b[];
		
		a = new long [TAM];
		b = new long [TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"º elemento para obter seu fatorial:");
			a[i] = in.nextInt();
			
			for(j=1; j<=a[i]; j++) {
				fat = fat * j;
			}
			b[i] = fat;
			fat = 1;
		}

			System.out.print("A = "); // apresentar os valores
			for(i=0;i<TAM;i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println("\n");
			
			System.out.print("B = "); // apresentar o fatorial dos valores insiridos
			for(i=0;i<TAM;i++) {
				System.out.print(b[i]+" ");
			}
			in.close();
	}
}




//a[ 3 4 5 6 7 ] meus elementos
//   0 1 2 3 4 

//b[ 6 24 120 720 5040] fatorial de cada elemento
//   0 1   2   3   4 


/* 5. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo 
 * que cada elemento do vetor B seja o fatorial do elemento correspondente em A.
 */