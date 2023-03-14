package playwrightbasic.playwrightbasic;

import static org.testng.Assert.assertEquals;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;


public class App {
private Browser browser;
protected Page page;

public void launch() {
	Playwright playwright = Playwright.create();
	browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setIgnoreHTTPSErrors(true));
	page = browserContext.newPage();
	}

public void login() {
	page.navigate("https://10.71.36.143:9000/identityconsole/login.html#/");
	page.locator("#Username_ID").type("cn=admin,o=novell");
	page.locator("#Password_ID").type("novell");
	page.locator("#Server").type("10.71.36.143");
	page.locator("#loginButton").click();
}

public void logoutPage() {
	page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("admin (idconsole-tree)")).click();
	page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign out")).click();
}

public void tearDown() {
	page.close();
	browser.close();
}

public void urlVerify(String actualUrl, String DesireUrl, String msg) {
	assertEquals(actualUrl,DesireUrl,msg);
}

public void nameVerify(String actualTitle, String DesireTitle, String msg) {
	assertEquals(actualTitle,DesireTitle,msg);
}

//public void textValidation(String text) {
// assert(actualUrl,DesireUrl,msg);
// }
}