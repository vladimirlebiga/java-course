package input;

import java.util.Scanner;

public class InputTypesScanner {

    public static void main(String[] args) {
        // ClassNAME varname = new ClassNAME();
        Scanner inputScanner = new Scanner(System.in);

        // inputScanner.next() -> reads one single word, returns String
        // inputScanner.nextLine() -> reads the whole sentence, returns String
        // inputScanner.nextInt() -> reads the whole number, returns int
        // inputScanner.nextDouble() -> reads the decimal number, returns double
        // inputScanner.nextBoolean() -> reads the true/false, returns boolean

        System.out.println("#1 - Input a number:");
        int x = inputScanner.nextInt();
        System.out.println("#2 - Input a number:");
        int y = inputScanner.nextInt();
        int sum = x + y;
        String result = "Sum of " + x + " and " + y + " is = " + sum;
        System.out.println(result);



    }

}

