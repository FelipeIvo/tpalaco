package bicha3;
import java.util.Scanner;
	public class somatória {
		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			int i=2 ,  r ,f;
			f=1; 
			while (i<101) {
				f= f+i; 
				System.out.println("somatória realizada é " +f);
				i++;
		}
	}
}