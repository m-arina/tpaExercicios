public class Tabuada {
	public static void main(String[] args){
		int r;
		for(int t=1; t<=10; t++){
			for (int i=1;i<=10;i++) {
			r= i*t;
			System.out.println(i+"x"+t+" = " +r);
			}
		}
	}
}