import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double idade, porcent, f15=0, f30=0, f45=0, f60=0, f61=0;
		
		for (int i=1; i<=15; i++) {
			System.out.println("Insira sua idade: ");
			idade = in.nextDouble();
			
			if (idade<=15) {
				f15 = f15+1;
			} else if (idade<=30) {
				f30 = f30+1;
			} else if (idade<=45) {
				f45 = f45+1;
			} else if (idade<=60) {
				f60 = f60+1;
			} else {
				f61 = f61+1;
			}
			
		}
			porcent = (100*f15) / 15;
			System.out.println("A faixa etária de até 15 anos há o total de "+f15+" pessoas, equivalente a "+porcent+"%");
			porcent = (100*f30) / 15;
			System.out.println("A faixa etária de 16 a 30 anos há o total de "+f30+" pessoas, equivalente a "+porcent+"%");
			porcent = (100*f45) / 15;
			System.out.println("A faixa etária de 31 a 45 anos há o total de "+f45+" pessoas, equivalente a "+porcent+"%");
			porcent = (100*f60) / 15;
			System.out.println("A faixa etária de 46 a 60 anos há o total de "+f60+" pessoas, equivalente a "+porcent+"%");
			porcent = (100*f61) / 15;
			System.out.println("A faixa etária acima de 61 anos há o total de "+f61+" pessoas, equivalente a "+porcent+"%");
	}
}