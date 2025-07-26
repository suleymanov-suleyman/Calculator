import java.util.ArrayList;

public class History {
    private static ArrayList<ArrayList<String>> calculatorHistory = new ArrayList<>();
    private static ArrayList<String> inputs = new ArrayList<>();

    public static void addTempHistory(int... inputsUser){
        inputs.clear();
        for(int s:inputsUser){
            inputs.add(String.valueOf(s));
        }
    }
    public static void addHistory(double result, String operator1){
        ArrayList<String> subHistory = new ArrayList<>();
        subHistory.add(String.valueOf(result));
        subHistory.add(operator1);
        for (String j:inputs){
            subHistory.add(j);
        }
        calculatorHistory.add(subHistory);
        inputs.clear();
    }
    public static void printHistory(){
        System.out.println("----History----");
        for (ArrayList<String> items: calculatorHistory){
            String result = items.getFirst();
            String operator = items.get(1);
            ArrayList<String> inputs = new ArrayList<>(items.subList(2, items.size()));

            StringBuilder action = new StringBuilder();
            for (int i = 0; i < inputs.size(); i++){
                action.append(inputs.get(i));
                if (i < inputs.size()-1){
                    action.append(" ").append(operator).append(" ");
                }
            }
            System.out.println("---------------");
            System.out.println(action + " = " + result);
            System.out.println("---------------");
        }
    }
}
