package distributor;

import java.util.Scanner;

public class Distributor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println("OPERACIONES");
        //System.out.println(" -- > SUMA : " + a + " + " + b + " = " + (a+b));
        //System.out.println(" -- > RESTA : " + a + " + " + b + " = " + (a-b));
        System.out.println(" -- > MULTIPLICACION : " + a + " + " + b + " = " + (a*b));
        System.out.println(" -- > DIVISION : " + a + " + " + b + " = " + (a/b));
        System.out.println(" -- > MODULO : " + a + " % " + b + " = " + (a%b));
    }
}
