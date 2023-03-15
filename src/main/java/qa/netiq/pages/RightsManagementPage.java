package pages;

import com.microsoft.playwright.Page;

public class RightsManagementPage {
	private Page page;
	String pageLoc = "a[routerlink=\"rightsmanagement\"]";
	String expectedUrl = "https://10.71.36.143:9000/identityconsole/#/rightsmanagement";
	String headerLoc = "div[class=\"pageHeading wordWrap\"] h2";
	private String expectedHeader = "Rights Management";

	public RightsManagementPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.click(pageLoc);
		page.waitForURL(expectedUrl);
	}

	public RightsManagementPage headerVal() {
		String headerTxt = HelperMethods.headerOpr(page, headerLoc);
		HelperMethods.validation(headerTxt, expectedHeader, "header not matched");
		return this;
	}

	public RightsManagementPage urlVal() {
		String actualUrl = HelperMethods.urlOpr(page);
		HelperMethods.validation(actualUrl, expectedUrl, "url not matched");
		return this;
	}
}