package qa.netiq.tests;

import org.testng.annotations.Test;

import qa.netiq.pages.GroupManagementPage;
import qa.netiq.pages.ObjectManagementPage;
import qa.netiq.pages.RightsManagementPage;
import qa.netiq.pages.SearchPage;
import qa.netiq.pages.TreeViewPage;
import qa.netiq.pages.UserManagementPage;
import qa.netiq.base.BaseTest;
import qa.netiq.pages.HomePage;

public class PageTest1 extends BaseTest {
	@Test(priority=1)
	public void homePage() {
		new HomePage(page)
		.urlVal()
		.headerVal();
	}

	@Test(priority = 2)
	public void searchTest() {
		new SearchPage(page)
		.urlVal()
		.headerVal();
	}

	@Test(priority = 3)
	public void userManagementTest() {
		new UserManagementPage(page)
		.urlVal()
		.headerVal();
	}

	@Test(priority = 4)
	public void groupManagementTest() {
		new GroupManagementPage(page)
		.urlVal()
		.headerVal();
	}

	@Test(priority = 5)
	public void objectManagementTest() {
		new ObjectManagementPage(page)
		.urlVal()
		.headerVal();
	}

	@Test(priority = 6)
	public void rightManagementTest() {
		new RightsManagementPage(page)
		.urlVal()
		.headerVal();
	}

	@Test(priority = 7)
	public void treeViewTest() {
		new TreeViewPage(page)
		.urlVal()
		.headerVal();
	} 
}