//5.გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
// დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
// Int countVariants(Int stearsCount);

import java.util.Scanner;

public class CountVariants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of floors: ");
        int floors = scanner.nextInt();

        int ways = countVariants(floors);

        System.out.println("Number of ways to climb " + floors + " floors: " + ways);
    }
    public static int countVariants(int stairsCount) {
        if (stairsCount <= 1) {
            return 1;
        }

        int prev = 1;
        int curr = 1;

        for (int i = 2; i <= stairsCount; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}


