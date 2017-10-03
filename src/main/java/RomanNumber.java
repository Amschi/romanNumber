import java.util.*;


public class RomanNumber {





    private static final Map <Integer, String> numeralEquivalents = new HashMap<Integer, String>();

    private static List <Integer> numeralValues;
    {
        numeralEquivalents.put(10, "X");
        numeralEquivalents.put(5, "V");
        numeralEquivalents.put(1, "I");

        numeralValues = new ArrayList<Integer>(numeralEquivalents.keySet());
        Collections.sort(numeralValues, Collections.reverseOrder());
    }






    public String convertToRomanNumeralForm(int arabicValue) {
        int remainingCounter = arabicValue;
        String result = "";

        for (int numeralValue : numeralValues)
            while (remainingCounter >= numeralValue) {
                result += numeralEquivalents.get(numeralValue);
                remainingCounter -= numeralValue;
            }
            return result;
g
    }

}
