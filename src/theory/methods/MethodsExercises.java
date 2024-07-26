package theory.methods;

public class MethodsExercises {

    // (1) Create function to get sum of two numbers int - x and y
    public static int getSum(int x, int y) {
        return x + y;
    }

    // (2) Create function to return true if the user is adult and false otherwise
    public static boolean checkIfAdult(int age) {
//        if (age >= 18) {
//            return true;
//        } else {
//            return false;
//        }
        return (age >= 18);
    }

    // (3) Create a void method that prints sum of two numbers x and y
    public static void calculateSum(int x, int y) {
        System.out.println("Sum of " + x + " and " + y + " is " + (x + y) );
    }

    public static void main(String[] args) {
        // calling a method:
        int sum = getSum(5, 5);
        System.out.println("Result of 5 + 5 = " + sum);

        boolean result = checkIfAdult(20);
        System.out.println("User is adult? -> " + result);

        calculateSum(5, 5);
    }

}
