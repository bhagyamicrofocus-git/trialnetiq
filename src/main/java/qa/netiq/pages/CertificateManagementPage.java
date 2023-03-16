package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CertificateManagementPage {
	private Page page;
	private String tile = "Certificate Management Create, Manage and Issue Certificates";
	private String headerLoc= "div[class=\"titleSection\"] h2";
	private String pageurl=HelperMethods.getPageUrl("#/certificateManagement");
	private String expectedheader= "Certificate Management";

	public CertificateManagementPage(Page page) {
		this.page = page;
		page.click(HelperMethods.homeLoc);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tile)).click();
	}

	public void certificateManagementPage() {
		String header = page.textContent(headerLoc);
		System.out.println(header);
		HelperMethods.validation(header, expectedheader, "header not matched");
	}
	public CertificateManagementPage certificateManagementPageUrl() {
		page.waitForURL(pageurl);
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,pageurl);
		return this;
	}
}