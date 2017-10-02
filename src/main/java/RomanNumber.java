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
      }
  }

    public String convert(int number) {

        String result = "";


        for (Digit digit : Digit.values()) {
            if(number >= digit.value) {
                result = digit.name() + convert(number - digit.value);
            }
        }

        return result;
    }

}
