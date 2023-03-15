package qa.netiq.pages;

import com.microsoft.playwright.Page;

public class SearchPage {
	private Page page;
	private String pageLoc = "a[routerlink=\"searchpage\"]";
	String expectedUrl = HelperMethods.getPageUrl("searchpage");
	String headerLoc = "div[class=\"titleSection wordWrap_search\"] h2";
	private String expectedHeader = "Search";

	public SearchPage(Page page) {
		this.page = page;
		page.click(pageLoc);
		page.waitForURL(expectedUrl);
	}

	public SearchPage headerVal() {
		String headerTxt = HelperMethods.headerOpr(page, headerLoc);
		HelperMethods.validation(headerTxt, expectedHeader, "header not matched");
		return this;
	}

	public SearchPage urlVal() {
		String actualUrl = HelperMethods.urlOpr(page);
		HelperMethods.validation(actualUrl, expectedUrl, "url not matched");
		return this;
	}
}