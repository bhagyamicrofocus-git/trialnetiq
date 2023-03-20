package qa.netiq.pages;

import com.microsoft.playwright.Page;

public class HomePage {
	private Page page;
	private String expectedUrl = HelperMethods.getPageUrl("#/");
	private String headerLoc = "div[class=\"ias-tile-group\"] span";
	private String expectedHeader = "eDirectory";

	public HomePage(Page page) {
		this.page = page;
		page.waitForURL(expectedUrl);
	}

	public HomePage headerVal() {
		String headerTxt = HelperMethods.headerOpr(page, headerLoc);
		HelperMethods.validation(headerTxt, expectedHeader, "header not matched");
		return this;
	}

	public HomePage urlVal() {
		String actualUrl = HelperMethods.urlOpr(page);
		HelperMethods.validation(actualUrl, expectedUrl, "url not matched");
		return this;
	}
}