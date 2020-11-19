import java.util.Scanner;
public class OrdemInversa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUM=10;
		int i, a[], b[], aux=NUM-1;
		
		a = new int[NUM];
		b = new int[NUM];
		
		for(i=0; i<NUM; i++) { 
			System.out.println("Digite o "+(i+1)+"º valor de a: ");
			a[i] = in.nextInt();
			b[aux] = a[i];
			aux--;
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

//a[ _ _ _ _ _ _ _ _ _ _]  ordem certa
//   0 1 2 3 4 5 6 7 8 9

//b[ _ _ _ _ _ _ _ _ _ _] ordem inversa
//   9 8 7 6 5 4 3 2 1 0
