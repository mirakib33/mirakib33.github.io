
package examPractice;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNumbers {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 10; i++)
        {
        numbers.add(i+1);
        }
        Collections.shuffle(numbers);
        System.out.println(numbers);
        
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i=1; i<100; i++)
//        list.add(i);
//        Collections.shuffle(list);
//        for (int i=0; i<10; i++)
//        System.out.println(list.get(i));
    }
}
