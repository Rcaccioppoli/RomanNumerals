import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test() {
		assertEquals(500, RomanNumerals.convertToInteger("DM"));
	}

}
