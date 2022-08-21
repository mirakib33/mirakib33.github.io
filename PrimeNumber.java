
package examPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        boolean isPrime = true;


        if (num == 1) {
            System.out.println("1 is neither prime nor composite number.");
        }else if (num > 1) {
               for (int i = 2; i < num; i++) {
               if (num % i == 0) {
               isPrime = false;
               break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        }
        else {
            System.out.println(num + " " + "is not a prime number.");
        }
        }
    }
