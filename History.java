import java.util.ArrayList;

public class History {
    private static ArrayList<ArrayList<String>> calculatorHistory = new ArrayList<>();
    private static ArrayList<String> subHistory = new ArrayList<>();
    private static String operator;
    private static ArrayList<String> inputs = new ArrayList<>();

    public static void addTemp( String operatorInput, int... inputsUser){
        operator = operatorInput;
        for(int s:inputsUser){
            inputs.add(String.valueOf(s));
        }
    }
    public static void addHistory(int result){
        subHistory.add(String.valueOf(result));
        subHistory.add(operator);
        for (String j:inputs){
            subHistory.add(j);
        }
        calculatorHistory.add(subHistory);
    }
    public static void printHistory(){

    }
}
