public class MathOperations {
    public static void add(int... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        System.out.println("The result of the addition: " + result);
        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        History.addHistory(result,"+");
    }

    public static void subtract(int... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        System.out.println("The result of the subtraction: " + result);
        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        History.addHistory(result,"-");
    }

    public static void multiple(int... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }

        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        System.out.println("The result of the multiplication: " + result);
        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        History.addHistory(result,"*");
    }

    public static void divide(double... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("At least one number is required!");

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) throw new ArithmeticException("Cannot divide by 0");
            result /= numbers[i];
        }

        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        System.out.println("The result of the division: " + result);
        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        History.addHistory(result,"/");
    }

    public static void square(int number) {
        int result = number*number;

        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        System.out.println("The result of the squaring: " + result);
        System.out.println("=+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+=");
        History.addHistory(result, "square to ");
    }
}
