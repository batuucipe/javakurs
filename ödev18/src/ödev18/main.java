package ödev18;

public class main {

	public static void main(String[] args) {
		int i;
		int sayılar[]=new int [] {1,2,5,7,9,0};
		int aranacak=5;
		boolean varmi=false;
		for(i=0;i<sayılar.length;i++) {
			if(sayılar[i]==aranacak) {
				varmi=true;
				break;
			}
		}
			if(varmi) {
				System.out.println("sayı dizinin içindedir");
			}
			else {
				System.out.println("sayı dizinin içinde değildir");
			}
			
		
		
		
		}
		
	

}
