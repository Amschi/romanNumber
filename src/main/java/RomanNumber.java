public class RomanNumber {


  private enum Digit {
      I(1),
      IV(4),
      V(5),
      IX(9),
      X(10),
      XL(40),
      L(50),
      C(100),
      CD(400),
      D(500),
      M(1000);

      private final int value;

      Digit(int value) {
          this.value = value;
      }git s
  }

    public String convert(int number) {

        String result = "";


        int remainingCounter = number;

        while (remainingCounter > 0) {


            if (remainingCounter >= 10) {
                result += "X";
                remainingCounter -= 10;
            } else if (remainingCounter >= 5) {
                result += "V";
                remainingCounter -= 5;
            } else if (remainingCounter == 4) {
                result += "IV";
                remainingCounter = -4;
            } else {
                result += "I";
                remainingCounter--;
            }
        }

        return result;
    }

}
