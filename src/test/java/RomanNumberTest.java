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
        assertThat(romanNumber.convert(1)).isEqualTo("I");
    }

    @Test
    public void convert_shouldReturnIIfor2() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convert(2)).isEqualTo("II");
    }

    @Test
    public void convert_shouldReturnIIIfor3() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convert(3)).isEqualTo("III");
    }

    @Test
    public void convert_shouldReturnVfor5() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convert(5)).isEqualTo("V");
    }

    @Test
    public void convert_shouldReturnVIfor6() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convert(6)).isEqualTo("VI");
    }

    @Test
    public void convert_shouldReturnXfor10() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convert(10)).isEqualTo("X");
    }

    @Test
    public void convert_shouldReturnIVfor4() {
        // GIVEN
        // WHEN

        // THEN
        assertThat(romanNumber.convert(4)).isEqualTo("IV");
    }


}


