package qa.netiq.tests;

import org.testng.annotations.Test;

import qa.netiq.base.BaseTest;
import qa.netiq.pages.AuthenticationManagementPage;
import qa.netiq.pages.CertificateManagementPage;
import qa.netiq.pages.EBAPage;
import qa.netiq.pages.IndexManagementPage;
import qa.netiq.pages.LDAPConfigurationPage;
import qa.netiq.pages.SNMPPage;

public class PageTest3 extends BaseTest {
	

	@Test(priority = 1)
	public void IndexManagementTest() {
		IndexManagementPage indexManagement = new IndexManagementPage(page);
		indexManagement.indexManagementPageUrl();
		indexManagement.indexManagementPage();
	}
	

	@Test(priority = 2)
	public void LDAPConfigurationTest() {
		LDAPConfigurationPage LDAPConfiguration = new LDAPConfigurationPage(page);
		LDAPConfiguration.ldapConfigurationPageUrl();
		LDAPConfiguration.lDAPConfigurationPage();
	}
	
	@Test(priority = 3)
	public void CertificateManagementTest() {
		CertificateManagementPage CertificateManagement = new CertificateManagementPage(page);
		CertificateManagement.certificateManagementPageUrl();
		CertificateManagement.certificateManagementPage();
	}
	
	@Test(priority = 4)
	public void AuthenticationManagementTest() {
		AuthenticationManagementPage AuthenticationManagement = new AuthenticationManagementPage(page);
		AuthenticationManagement.authenticationManagementPageUrl();
		AuthenticationManagement.authenticationManagementPage();
	}
	
	@Test(priority = 5)
	public void SNMPTest() {
		SNMPPage SNMP = new SNMPPage(page);
		SNMP.snmpPageUrl();
		SNMP.sNMPPage();
	}

	@Test(priority = 6)
	public void EBAPageTest() {
		EBAPage EBA = new EBAPage(page);
		EBA.ebaPageUrl();
		EBA.eBAPage();
	}
}
