package main;
public class MAİN {

	public static void main(String[] args) {
			int number=5;
			int toplam=0;
			for(int i=1;i<number;i++) {
				if (number%i==0) {
					toplam=toplam+i;
					
				}
				}
				if(toplam==number) {
					System.out.println(" saysısı mükemmel sayıdır");
				}
				else {
					System.out.println(" saysısı mükemmel sayı değildir");
				}
			

	}

}
