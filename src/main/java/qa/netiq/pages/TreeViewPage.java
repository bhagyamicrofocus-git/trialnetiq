package qa.netiq.pages;

import com.microsoft.playwright.Page;

public class TreeViewPage {
	private Page page;
	String pageLoc = "a[routerlink=\"treeview\"]";
	String expectedUrl = "https://10.71.36.143:9000/identityconsole/#/treeview";
	String headerLoc = "div[class=\"treeViewHeading wordWrap\"] h2";
	private String expectedHeader = "Tree View";

	public TreeViewPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.click(pageLoc);
		page.waitForURL(expectedUrl);
	}

	public TreeViewPage headerVal() {
		String headerTxt = HelperMethods.headerOpr(page, headerLoc);
		HelperMethods.validation(headerTxt, expectedHeader, "header not matched");
		return this;
	}

	public TreeViewPage urlVal() {
		String actualUrl = HelperMethods.urlOpr(page);
		HelperMethods.validation(actualUrl, expectedUrl, "url not matched");
		return this;
	}
}