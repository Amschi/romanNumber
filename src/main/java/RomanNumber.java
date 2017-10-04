import java.util.*;


public class RomanNumber {




        private static final Map<Integer, String> numeralEquivalents = new HashMap<Integer, String>();

        private static List<Integer> numeralValues;



        {

            numeralEquivalents.put(1000, "M");
            numeralEquivalents.put(900, "CM");
            numeralEquivalents.put(500, "D");
            numeralEquivalents.put(400, "CD");
            numeralEquivalents.put(100, "C");
            numeralEquivalents.put(90, "XC");
            numeralEquivalents.put(50, "L");
            numeralEquivalents.put(40, "XL");
            numeralEquivalents.put(10, "X");
            numeralEquivalents.put(9, "IX");
            numeralEquivalents.put(5, "V");
            numeralEquivalents.put(4, "IV");
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

    }



}

