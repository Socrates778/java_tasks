//2. გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა (თეთრებში) და
//   აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.Int minSplit(Int amount);

import java.util.ArrayList;
import java.util.Scanner;

public class MinSplit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();
        int minQuantity = minSplit(amount);
        System.out.println("Minimum quantity of coins: " + minQuantity);
    }

    static int minSplit(int amount){

        int[] coins = {50, 20, 10, 5, 1};
        ArrayList <Integer> arr = new ArrayList<>();
        int minQuantity = 0;

        for(int coin : coins){
            while(amount >= coin) {
                amount -= coin;
                arr.add(coin);
                minQuantity++;
            }
        }

        System.out.println("Coins that are used: " + arr);

        return minQuantity;

    }
}
