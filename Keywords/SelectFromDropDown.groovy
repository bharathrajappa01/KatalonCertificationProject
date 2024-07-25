import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class SelectFromDropDown {
	/**
	 *
	 * @param baseXPath String xpath
	 * @param childDivCount int divCount
	 * @param nationality String nat
	 * @param currentNat String CurrentNat
	 * @return
	 */

	@Keyword
	def selectValueFromDropdown(String baseXPath, int childDivCount, String nationality, String currentNat) {
		if(currentNat != nationality) {
			for(int i = 1; i<=childDivCount; i++) {
				String currentXPath = String.format(baseXPath, i)
				TestObject dynamicTestObject = new TestObject()
				dynamicTestObject.addProperty('xpath', ConditionType.EQUALS, currentXPath)
				String innerText = WebUI.getText(dynamicTestObject)

				if(innerText == nationality) {
					WebUI.click(dynamicTestObject)
					break;
				}
			}
		}
	}
}
