package paqtema10;

public class SerieFibbo {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.print(n2);
			do {
				
				n3=n1+n2;
				n1=n2;
				n2=n3;
				
				
			System.out.print(", "+n3);
			
			}while(n3<=1000);
			
			
		
		
		
		
	}

}
