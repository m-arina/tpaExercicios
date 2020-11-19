import java.util.Scanner;
import java.lang.Math;
public class RaizQuadrada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM=10;
		int i, a[];
		double b[];
		
		a = new int[NUM];
		b = new double [NUM];
		
		for(i=0; i<NUM; i++) { 
			System.out.println("Digite o "+(i+1)+"º valor de A para obter sua raiz quadrada: ");
			a[i] = in.nextInt();
			b[i] = Math.sqrt(a[i]);
		}

		System.out.print("A = ");
		for(i=0;i<NUM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		System.out.print("B = ");
		
		for(i=0;i<NUM;i++) {
			System.out.print(b[i]+" ");
		}
		in.close();

	}

}

// a[ _ _ _ _ _ _ _ _ _ _]
//    0 1 2 3 4 5 6 7 8 9