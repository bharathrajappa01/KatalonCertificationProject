import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory






public class RefreshBrowser {

	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing browser !!")
		WebDriver driver = DriverFactory.getWebDriver();
		driver.navigate().refresh()
		KeywordUtil.markPassed("Refreshed successfully !!")
	}
}
