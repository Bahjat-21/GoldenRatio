import java.util.Scanner;
public class GoldenRatio {
    public static double golden(double n){
        if (n==0){
            return 1;
        }else {
            return 1.0 + 1.0 / golden( n - 1 );
        }
    }
    public static void main (String[] args){
        double n;
        Scanner s = new Scanner(System.in);
        n = s.nextDouble();
            System.out.println("ergebnis:\t" + Math.abs(golden(n)));
        }
    }

