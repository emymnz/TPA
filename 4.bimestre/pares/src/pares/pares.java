package pares;
import java.util.*;
public class pares {
	public static void main (String [] args) {
		Scanner in= new Scanner(System.in);
		int i=1;
		double n;
		do {
			System.out.println("Digite o número");
			n=in.nextDouble();
			if(n/2==0) {
				System.out.println("par");
				
			}else {
				System.out.println("impar");
			}
			i++;
		}while(i<=1);
	}
	
	

}
