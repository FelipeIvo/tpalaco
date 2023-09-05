package banana;
import java.util.Scanner; 
public class tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int i= 1, n , r;
        System.out.println("Entre com um número para a tabuada:");
        n= in.nextInt();
        while (i<=10) {
            r = n* i;
            System.out.println(n+"x" + "=" + r);
            i ++;

    }
    in.close ();
    }
}