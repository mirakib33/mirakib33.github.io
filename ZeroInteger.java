
package examPractice;

import java.util.Scanner;

public class ZeroInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i>=0; i++) {
            System.out.println("Enter value here: ");
            int val = input.nextInt();
            if(val == 0) {
                break;
            } else{
                sum = sum + val;
            }
            System.out.println("Total: "+sum);
        }
    }
}
