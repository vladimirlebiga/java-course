package theory.if_statements;

public class IfStatementsDemo {

    public static void main(String[] args) {
        int number = 10;
        // check if number is positive, even or zero

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }

        // for even number check %, - modulo
        // 10 % 2 = 0
        // 10 % 3 = 1
        // 3 % 10 = 3

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("number is even and positive");
            } else {
                System.out.println("number is odd and positive");
            }
        }

        // AND - && (double ampersand)
        // OR - ||

        // NOT !

        // even четное число
        // odd нечетное число

        if (number > 0 && number % 2 == 0) {
            System.out.println("number is even and positive");
        } else if (number > 0 && number % 2 != 0) {
            System.out.println("number is odd and positive");
        } else if (number < 0 && number % 2 == 0) {
            System.out.println("number is even and negative");
        } else if (number < 0 && number % 2 != 0) {
            System.out.println("number is odd and negative");
        } else {
            System.out.println("number is zero");
        }
    }


}
