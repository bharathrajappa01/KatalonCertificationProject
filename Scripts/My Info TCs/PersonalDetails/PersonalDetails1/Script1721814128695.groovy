import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.callTestCase(findTestCase('LoginPage TCs/Login_RecordMode_TC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))

String headerText = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/PIM'), 'innerText')
WebUI.verifyMatch(headerText, 'PIM', false)

WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'), 30)
CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'), firstName)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_middleName'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_middleName'), middleName)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_lastName'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_lastName'), lastName)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 3)
WebUI.refresh()
String actualUserName = WebUI.getText(findTestObject('Object Repository/HomePage_Objects/UserDropDown/UserName'))
WebUI.verifyMatch(actualUserName, firstName+' '+lastName, false)





