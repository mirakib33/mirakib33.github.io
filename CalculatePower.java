
package examPractice;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        int temp = 1;
        System.out.print("Enter the exponent number: ");
        int exp = sc.nextInt();

        for (int i=1; i<=exp; i++){
           temp = temp*base;
        }
        System.out.println("Result of "+base+" power "+exp+" is "+temp);
    }
}
