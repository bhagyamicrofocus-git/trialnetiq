package qa.netiq.pages;

import com.microsoft.playwright.Page;

public class RightsManagementPage {
	private Page page;
	private String pageLoc = "a[routerlink=\"rightsmanagement\"]";
	private String expectedUrl = HelperMethods.getPageUrl("#/rightsmanagement");
	private String headerLoc = "div[class=\"pageHeading wordWrap\"] h2";
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