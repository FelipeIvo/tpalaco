import java.util.Scanner; 
public class maioresmenoresidade  {
		public static void main (String []args) {
			Scanner in = new Scanner (System.in);
			int i=1, n, adulto=0;
			while (i <= 10) {
				System.out.println("Qual a Idade da "+i+ "ª Pessoa");
				n = in.nextInt ();
					if (n>=18) {
						adulto++; 
					}
				i= i+1;}
			in.close();
			System.out.println("Há "+adulto+ " adulto(s)");
			}
	}


