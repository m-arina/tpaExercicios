import java.util.Scanner;
import java.lang.Math;
public class VetorPotencia {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 11;
		int i;
		double a[];
		
		a = new double [TAM];
		
		for(i=0; i<TAM; i++) {
			a[i] = Math.pow(2, i);
		}
		
		System.out.print("A[] = ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+"  ");
		}
		in.close();
	}
}


/*4. Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A
 *  é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento,
 *  ou seja: A[i] = 2i.
 */

   
