package pages;

import com.microsoft.playwright.Page;

public class ObjectManagementPage {
	private Page page;
	private String pageLoc = "a[routerlink=\"objectpage\"]";
	private String expectedUrl = "https://10.71.36.143:9000/identityconsole/#/objectpage";
	private String headerLoc = "div[class=\"floatLeft wordWrap_heading\"] h2";
	private String expectedHeader = "Objects";

	public ObjectManagementPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.click(pageLoc);
		page.waitForURL(expectedUrl);
	}

	public ObjectManagementPage headerVal() {
		String headerTxt = HelperMethods.headerOpr(page, headerLoc);
		HelperMethods.validation(headerTxt, expectedHeader, "header not matched");
		return this;
	}

	public ObjectManagementPage urlVal() {
		String actualUrl = HelperMethods.urlOpr(page);
		HelperMethods.validation(actualUrl, expectedUrl, "url not matched");
		return this;
	}
}