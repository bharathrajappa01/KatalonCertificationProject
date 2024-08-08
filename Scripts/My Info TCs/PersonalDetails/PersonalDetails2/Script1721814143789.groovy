import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//WebUI.callTestCase(findTestCase('LoginPage TCs/Login_RecordMode_TC'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))

WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'), 30)
CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Id_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Id_oxd-input oxd-input--focus'), EmpId.toString())

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Other Id_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Other Id_oxd-input oxd-input--focus'), otherId)

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_concat'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_concat'), driverLicenseNo)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_License Expiry Date_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_License Expiry Date_oxd-input oxd-input--focus'), driverLicenseExpiry)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 3)

WebUI.refresh()
String actualEmpId = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Id_oxd-input oxd-input--focus'), 'value')

WebUI.verifyMatch(actualEmpId, EmpId.toString(), false)

// Verify that the two integer values are equal
//assert actualEmpId == EmpId.toString() : "Expected EmpId is ${EmpId}, but actual EmpId is ${actualEmpId}"


