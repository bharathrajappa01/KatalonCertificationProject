import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class ClickElement {

	@Keyword
	def clickElement(String testObjectId) {
		try {
			WebUI.click(findTestObject(testObjectId));
			KeywordUtil.markPassed("Element clicked successfully");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Unable to find the element");
		} catch (Exception e) {
			KeywordUtil.markFailed("Failed to click the element");
		}
	}
}
