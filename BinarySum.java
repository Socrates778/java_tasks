//4.მოცემულია ორი binary string a და b, დააბრუნეთ მათი ჯამი, როგორც binary string.
//  მაგ: a = "1010" b = "1011" , მათი ჯამი იქნება "10101"

public class BinarySum {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1010";
        String sum = addBinary(a, b);
        System.out.println("Sum: " + sum);
    }

    public static String addBinary(String a, String b) {
        // Convert binary strings to integers
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int sum = first + second;

        // Convert the result to a binary string
        String binarySum = Integer.toBinaryString(sum);

        return binarySum;
    }
}

