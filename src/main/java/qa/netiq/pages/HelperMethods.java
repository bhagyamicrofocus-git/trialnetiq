package qa.netiq.pages;

import static org.testng.Assert.assertEquals;

import com.microsoft.playwright.Page;

public class HelperMethods {
	Page page;
	static String homeLoc = "button[title=\"Cancel\"]";

	public static void validation(String actual, String Desired, String msg) {
		assertEquals(actual, Desired, msg);
	}

	public static String headerOpr(Page page, String headerLoc) {
		String headerTxt = page.textContent(headerLoc);
		System.out.println(headerTxt);
		return headerTxt;
	}

	public static String urlOpr(Page page) {
		String actualUrl = page.url();
		System.out.println(actualUrl);
		return actualUrl;
	}
}