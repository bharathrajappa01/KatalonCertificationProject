import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class SelectAllAndClear {
	@Keyword
	def selectAllAndClear(TestObject testObj) {
		WebUI.click(testObj)
		WebUI.sendKeys(testObj, Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(testObj, Keys.chord(Keys.DELETE))
	}
}
