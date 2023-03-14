//import org.testng.annotations.Test;
//
//public class NewTest {
//  @Test
//  public void f() {
//  }
//}
package testNG;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
public class NewTest {
	private Browser browser;
	private Page page;
	@BeforeMethod
	public void beforeMethodSetUp() {
		Playwright playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setIgnoreHTTPSErrors(true));
		page = browserContext.newPage();
	}
	@Test
	public void homePageValidation() {
		page.navigate("https://www.saucedemo.com/");
		page.fill("#user-name", "standard_user");
		page.fill("#password", "secret_sauce");page.click("#login-button");
		assertEquals(page.url(), "https://www.saucedemo.com/inventory.html", "url not matched");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open Menu")).click();
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Logout")).click();
	}
	@AfterMethod
	public void afterMethodTearDown() {
		page.close();
		browser.close();
	}
}
