import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardTest {

	@Test
	public void Check() {
		assertFalse(CreditCard.Check("4024007104696005")); // a fake cc number //
		assertTrue(CreditCard.Check("4024007104696009")); // a real cc number //
	}

}