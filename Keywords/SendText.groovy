import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class SendText {

	@Keyword
	def sendText(TestObject testObj, String text) {
		CustomKeywords.'ClearField.clearField'(testObj)
		WebUI.setText(testObj, text)
	}
}
