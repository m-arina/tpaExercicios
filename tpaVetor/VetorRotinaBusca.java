import java.util.Scanner;
public class VetorRotinaBusca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], x;
		boolean analise = false; // variavel booleana para um jeito mais inteligente (～￣▽￣) 
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"º elemento do vetor A: ");
			a[i] = in.nextInt();
		}
		
		System.out.print("A[] = ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n");
		System.out.println("Insira um número para verificar se ele está presente no vetor A: ");
		x = in.nextInt();
		
		for (i=0; i<TAM; i++) {
            if (a[i]==x){
                analise = true ;
            }
        }
		
		if (analise){
            System.out.println("O número "+x+" foi encontrado no vetor A!");
        }else{
            System.out.println("O número "+x+" não foi encontrado no vetor A.");
        }
		
		in.close();
	}
}


/* 8. Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, para pesquisar 
 * se um dado elemento X está armazenado em A.
 */