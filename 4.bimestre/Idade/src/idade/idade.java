package idade;
import java.util.*;
public class idade {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1;
		int atual, nasc, idade, res;
		do {
			System.out.println ("Digite o ano atual");
			atual = in.nextInt();
			System.out.println ("Digite a data de nascimento do usu�rio");
			nasc = in.nextInt ();
			idade = atual-nasc;
			if (idade<=18) {
				System.out.println ("Menor de idade");
			}else {
				System.out.println ("Maior de idade");
			}
			System.out.println ("Deseja continuar? Digite 1 para sim e 2 para n�o");
			res = in.nextInt ();
			
		} while (i==1);
	}

}
