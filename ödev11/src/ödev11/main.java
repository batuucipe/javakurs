package ödev11;

public class main {

	public static void main(String[] args) {
		double[] mylist= {1.2,1.3,4.3,5.6};
		double total=0;
		double max=mylist[0];
		for (double number:mylist) {
			if (max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		
		}
		
		System.out.println("toplam="+total);
		System.out.println("en büyük="+max);
	}

}
