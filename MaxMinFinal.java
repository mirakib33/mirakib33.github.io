
package examPractice;

import java.util.Scanner;

public class MaxMinFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter your number: ");
        for(int i = 0; i<5; i++) {
            num[i] = input.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for(int i = 1; i < 5; i++) {
            if(max < num[i]) {
                max = num[i];
            }
            if(min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}
