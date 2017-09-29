public class RomanNumber {


    public String convert(int number) {

        String result = "";


        int remainingCounter = number;

        while (remainingCounter > 0) {
            if (remainingCounter >= 5) {
                result += "V";
                remainingCounter -= 5;
            } else {
                result += "I";
                remainingCounter--;
            }
        }


        return result;
    }

}
