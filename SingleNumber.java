//1. გვაქვს მთელი რიცხვების ჩამონათვალი სადაც ერთის გარდა ყველა რიცხვი მეორდება, იპოვეთ
//   ის რიცხვი რომელიც არ მეორდება.int singleNumber(int[] nums)

import java.util.HashSet;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        while (true) {
            System.out.print("Enter the size of the array (odd number): ");
            size = scanner.nextInt();

            if (size % 2 != 0) {
                break; // Exit the loop if the size is odd
            } else {
                System.out.println("Please enter an odd number for the size.");
            }
        }

        int[] nums = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int singleNumber = singleNumber(nums);

        System.out.println("The single number in the array is: " + singleNumber);

        scanner.close();
    }
    static int singleNumber(int[] nums){

        HashSet <Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }

        for(int num : set)
            return num;
        return 0;
    }

}
