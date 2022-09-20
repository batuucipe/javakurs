package ödev10;

public class main {

	public static void main(String[] args) {
		
		String[] ogrenciler=new String[5];
		ogrenciler[0]="engin";
		ogrenciler[1]="derin";
		ogrenciler[2]="salih";
		ogrenciler[3]="ahmet";
		ogrenciler[4]="ali";
		for (int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------------------");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
 	}
		
}}
