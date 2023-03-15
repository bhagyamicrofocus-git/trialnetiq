package qa.netiq.pages;

import static org.testng.Assert.assertEquals;

public class HelperMethods {
	public static void validation(String actual, String Desired, String msg) {
		assertEquals(actual, Desired, msg);
	}
}