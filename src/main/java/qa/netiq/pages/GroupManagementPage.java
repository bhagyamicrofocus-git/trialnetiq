package qa.netiq.pages;

import com.microsoft.playwright.Page;

public class GroupManagementPage {
	private Page page;
	private String pageLoc = "a[routerlink=\"grouppage\"]";
	private String expectedUrl = "https://10.71.36.143:9000/identityconsole/#/grouppage";
	private String headerLoc = "div[class=\"pageHeading wordWrap_heading\"] h2";
	private String expectedHeader = "Groups";
	

	public GroupManagementPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.click(pageLoc);
		page.waitForURL(expectedUrl);
	}

	public GroupManagementPage headerVal() {
		String headerTxt = HelperMethods.headerOpr(page, headerLoc);
		HelperMethods.validation(headerTxt, expectedHeader, "header not matched");
		return this;
	}

	public GroupManagementPage urlVal() {
		String actualUrl = HelperMethods.urlOpr(page);
		HelperMethods.validation(actualUrl, expectedUrl, "url not matched");
		return this;
	}
}
