import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RomanNumberTest {

    private RomanNumber romanNumber;

    @Before
    public void setUp() throws Exception {
        romanNumber = new RomanNumber();
    }

    @Test
    public void convert_shouldReturnIfor1() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(1)).isEqualTo("I");
    }

    @Test
    public void convert_shouldReturnIIfor2() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(2)).isEqualTo("II");
    }

    @Test
    public void convert_shouldReturnIIIfor3() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(3)).isEqualTo("III");
    }

    @Test
    public void convert_shouldReturnVfor5() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(5)).isEqualTo("V");
    }

    @Test
    public void convert_shouldReturnVIfor6() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(6)).isEqualTo("VI");
    }

    @Test
    public void convert_shouldReturnXfor10() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(10)).isEqualTo("X");
    }


    @Test
    public void convert_shouldReturnXXfor20() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(20)).isEqualTo("XX");
    }

    @Test
    public void convert_shouldReturnIVfor4() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(4)).isEqualTo("IV");
    }

    @Test
    public void convert_shouldReturnIXfor9() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(9)).isEqualTo("IX");
    }


    @Test
    public void convert_shouldReturnMCMXLIXfor1949() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(1949)).isEqualTo("MCMXLIX");
    }

    @Test
    public void convert_shouldReturnCDLXXVIIfor477() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convertToRomanNumeralForm(477)).isEqualTo("CDLXXVII");
    }
}


