package qa.netiq.pages;

import org.testng.Assert;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CertificateManagementPage {
	private Page page;

	public CertificateManagementPage(Page page) {
		this.page = page;
//		page.navigate("https://10.71.36.143:9000/identityconsole/#/");
		page.click("button[title=\"Cancel\"]");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Certificate Management Create, Manage and Issue Certificates")).click();
	}

	public void certificateManagementPage() {
		String header = page.textContent("div[class=\"titleSection\"] h2");
		System.out.println(header);
		HelperMethods.validation(header, "Certificate Management", "header not matched");
	}
	public CertificateManagementPage certificateManagementPageUrl() {
		page.waitForURL("https://10.71.36.143:9000/identityconsole/#/certificateManagement");
		String actualUrl=page.url();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,"https://10.71.36.143:9000/identityconsole/#/certificateManagement");
		return this;
	}
}