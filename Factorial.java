
package examPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int num = input.nextInt();
        long fact = 1;
        for(int i = 1; i <= num; ++i){
            
            fact *= i;
        }
        System.out.println("Factorial of "+ num + " is "+fact);
    }
}
