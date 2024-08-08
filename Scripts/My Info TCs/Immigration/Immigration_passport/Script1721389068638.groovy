import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LoginPage TCs/Login_RecordMode_TC'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/Immigration/a_Immigration'))
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/Immigration/button_Add'))

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Number_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Number_oxd-input oxd-input--focus'), passportNo)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Issued Date_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Issued Date_oxd-input oxd-input--focus'), issueDate)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Expiry Date_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Expiry Date_oxd-input oxd-input--focus'), expiryDate)

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Eligible Status_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Eligible Status_oxd-input oxd-input--focus'), status)

//IssuedBY
//WebUI.click(findTestObject('Object Repository/MyInfo_Objects/Immigration/div_-- Select --'))
//
//String currentNat = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/div_Indian'), 'innerText')
//
//List<WebElement> nationalities = WebUI.findWebElements(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/Nationality_div_childElements'), 10)
//
//int nationalityCount = nationalities.size()
//
//WebUI.comment('Count of child div elements: ' + nationalityCount)
//
//String parameterizedNationalityXPath = '//*[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[%d]'
//
//CustomKeywords.'SendText.selectValueFromDropdown'(parameterizedNationalityXPath, nationalityCount, nationality, currentNat)
//
//CustomKeywords.'SendText.clearField'(findTestObject('Object Repository/MyInfo_Objects/Immigration/div_-- Select --'))
//WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/Immigration/div_-- Select --'), issuedBy)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Eligible Review Date_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/Immigration/input_Eligible Review Date_oxd-input oxd-input--focus'), reviewDate)

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/Immigration/textarea_Comments'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/Immigration/textarea_Comments'), comments)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/Dependents/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 3)
