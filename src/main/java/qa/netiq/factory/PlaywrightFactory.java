package qa.netiq.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	public static Playwright playwright;
	public static Browser browser;
	public static Page page;
	Properties prop;
	

	public void launch() {
		Playwright playwright = Playwright.create();
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setIgnoreHTTPSErrors(true));
		page = browserContext.newPage();
       //return page;
}
	
	
	
	public Properties init_prop() {
		try {
			FileInputStream ip=new FileInputStream("./src/test/resources/config/config.properties");
			prop=new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}