package bicha3;
import java.util.Scanner;
	public class somat�ria {
		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			int i=2 ,  r ,f;
			f=1; 
			while (i<101) {
				f= f+i; 
				System.out.println("somat�ria realizada � " +f);
				i++;
		}
	}
}