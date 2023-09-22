//3. მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია
//   რომელსაც გადაეცემა ეს მასივი და აბრუნებს მინიმალურ მთელ რიცხვს,
//   რომელიც 0-ზე მეტია და ამ მასივში არ შედის Int notContains(Int[] array);.

import java.util.HashSet;

public class NotContains {
    public static void main(String[] args) {
        int[] arr = {-1,-2,0,1,2,4};
        int num = notContains(arr);
        System.out.println("Min positive number that is not in array: " + num);

    }
    static int notContains(int[] array){

        HashSet <Integer> set = new HashSet<>();

        //fill the hashset just with the positive elements
        for (int num : array)
            if(num > 0)
                set.add(num);

        //find the first positive integer that is not in hashset
        for(int i = 1; i < Integer.MAX_VALUE; i++){
            if(!set.contains(i))
                return i;
        }

        //return -1 if all positive integer is in set
        return -1;

    }
}
