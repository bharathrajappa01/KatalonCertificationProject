import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



//Login
//WebUI.callTestCase(findTestCase('LoginPage TCs/Login_RecordMode_TC'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))
WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'), 30)

//Nationality
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/div_Indian'))

String currentNat = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/div_Indian'), 'innerText')

List<WebElement> nationalities = WebUI.findWebElements(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/Nationality_div_childElements'), 10)

int nationalityCount = nationalities.size()

WebUI.comment('Count of nationality values: ' + nationalityCount)

String parameterizedNationalityXPath = '//*[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[%d]'

CustomKeywords.'SelectFromDropDown.selectValueFromDropdown'(parameterizedNationalityXPath, nationalityCount, nationality, currentNat)

//Maritial status
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/div_Single'))
String currentMartialStatus = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/div_Single'), 'innerText')
List<WebElement> maritialStatus = WebUI.findWebElements(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/maritalStatus_div_childElements'), 10)

int maritialCount = maritialStatus.size()

WebUI.comment('Count of maritial status values: ' + maritialCount)

String parameterizedMaritialStatusXPath = '//*[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[%d]'

CustomKeywords.'SelectFromDropDown.selectValueFromDropdown'(parameterizedMaritialStatusXPath, maritialCount, 'Single', currentMartialStatus)

//dob

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Date of Birth_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Date of Birth_oxd-input oxd-input--focus'), dob)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/button_Save'))


//Validate the test case
WebUI.refresh()
String actualNat = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/div_Indian'), 'innerText')

WebUI.verifyMatch(actualNat, nationality, false)

WebUI.closeBrowser()