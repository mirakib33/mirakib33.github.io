
package examPractice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int val = input.nextInt();
        int a = 0;
        int b = 1;
        for( int i = 0; i <= val; i++ ) {
            int fi = a + b;
            System.out.println(fi);
            a = b;
            b = fi;
        }
    }
}
