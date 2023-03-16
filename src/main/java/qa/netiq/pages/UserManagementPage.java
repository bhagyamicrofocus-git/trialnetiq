package qa.netiq.pages;

import com.microsoft.playwright.Page;

public class UserManagementPage {
	private Page page;
	private String pageLoc = "a[routerlink=\"userpage\"]";
	private String headerLoc = "div[class=\"floatLeft wordWrap_heading\"] h2";
	private String expectedUrl = HelperMethods.getPageUrl("#/userpage");
	private String expectedHeader = "Users";

	public UserManagementPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.click(pageLoc);
		page.waitForURL(expectedUrl);
	}

	public UserManagementPage headerVal() {
		String headerTxt = HelperMethods.headerOpr(page, headerLoc);
		HelperMethods.validation(headerTxt, expectedHeader, "header not matched");
		return this;
	}

	public UserManagementPage urlVal() {
		String actualUrl = HelperMethods.urlOpr(page);
		HelperMethods.validation(actualUrl, expectedUrl, "url not matched");
		return this;
	}
}