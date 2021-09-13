import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int sum = 0;
        int place = 1;

        int num = Integer.parseInt(binary);
        while (num > 0) {
            sum += (num % 10) * place;
            num /= 10;
            place *= 2;
        }

        return sum;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String bin = "";

        while (decimal > 0) {
            bin = (decimal % 2) + bin;
            decimal /= 2;
        }

        return bin;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}
