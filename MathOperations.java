public class MathOperations {
    public static int add(int... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println("The result of the addition: " + result);
        return result;
    }

    public static int subtract(int... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        System.out.println("The result of the subtraction: " + result);
        return result;
    }

    public static int multiple(int... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }

        System.out.println("The result of the multiplication: " + result);
        return result;
    }

    public static double divide(double... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) throw new ArithmeticException("Cannot divide by 0");
            result /= numbers[i];
        }

        System.out.println("The result of the division: " + result);
        return result;
    }

    public static int square(int number) {
        int result = number*number;

        System.out.println("The result of the squaring: " + result);
        return result;
    }
}
