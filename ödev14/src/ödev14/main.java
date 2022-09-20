package ödev14;

public class main {

	public static void main(String[] args) {
		int number=-1;
		boolean isprime=true;
		if(number==1) {
			System.out.println("sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("gecersiz sayı");
			return;
		}
		
		
		
		
		for (int i=2;i<number;i++) {
			if(number%i == 0) {
				isprime=false;
				
			}
			
			
			
		}
		
		
		if (isprime==true) {
			System.out.println("sayı asaldır");
		}
		else {
			System.out.println("sayı asal degildir");
		}
		
		
	}

}
