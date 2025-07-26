import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)){
                int userInput;
                String calculatorUserInput;
                int inputForSquare;
                while (true){
                    System.out.print("--------------------\n 1 - addition\n 2 - subtraction\n 3 - multiplication\n 4 - division\n 5 - square\n 6 - history\n 7 - quit\n--------------------\n - Choose action: ");
                    userInput = input.nextInt();
                    input.nextLine();
                    System.out.println("--------------------");
                    System.out.println(" ");
                    if (userInput == 7) {
                        System.out.println("quitting!");
                        break;
                    }
                    switch (userInput){
                        case 1:
                            System.out.print("Please enter the numbers you want to add (separated by space): ");
                            calculatorUserInput = input.nextLine();
                            System.out.println(" ");
                            System.out.println("--------------------");
                            System.out.println(" ");
                            History.addTempHistory(inputTrimmer(calculatorUserInput));
                            MathOperations.add(inputTrimmer(calculatorUserInput));
                            break;
                        case 2:
                            System.out.print("Please enter the numbers you want to subtract (separated by space): ");
                            calculatorUserInput = input.nextLine();
                            System.out.println(" ");
                            System.out.println("--------------------");
                            System.out.println(" ");
                            History.addTempHistory(inputTrimmer(calculatorUserInput));
                            MathOperations.subtract(inputTrimmer(calculatorUserInput));
                            break;
                        case 3:
                            System.out.print("Please enter the numbers you want to multiple (separated by space): ");
                            calculatorUserInput = input.nextLine();
                            System.out.println(" ");
                            System.out.println("--------------------");
                            System.out.println(" ");
                            History.addTempHistory(inputTrimmer(calculatorUserInput));
                            MathOperations.multiple(inputTrimmer(calculatorUserInput));
                            break;
                        case 4:
                            System.out.print("Please enter the numbers you want to divide (separated by space): ");
                            calculatorUserInput = input.nextLine();
                            System.out.println(" ");
                            System.out.println("--------------------");
                            System.out.println(" ");
                            History.addTempHistory(inputTrimmer(calculatorUserInput));
                            MathOperations.divide(Arrays.stream(inputTrimmer(calculatorUserInput)).asDoubleStream().toArray());
                            break;
                        case 5:
                            System.out.print("Please enter the number you want to square(just first number): ");
                            inputForSquare = input.nextInt();
                            System.out.println(" ");
                            System.out.println("--------------------");
                            System.out.println(" ");
                            History.addTempHistory(inputForSquare);
                            MathOperations.square(inputForSquare);
                            break;
                        case 6:
                            System.out.println(" ");
                            System.out.println("=====================");
                            System.out.println(" ");
                            History.printHistory();
                            System.out.println(" ");
                            System.out.println("=====================");
                            System.out.println(" ");
                            break;
                        default:
                            System.out.println("please enter right input!");
                    }
                    System.out.println(" ");
                    System.out.println("-+ Press enter for continue +-");
                    input.nextLine();
                    System.out.println(" ");
                }
            }catch (InputMismatchException e){
                System.out.println("Just use numbers!");
            }
    }
    public static int[] inputTrimmer(String line){
        String[] tokens = line.trim().split("\\s+");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++){
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        return numbers;
    }
}