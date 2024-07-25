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
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('LoginPage TCs/Login_RecordMode_TC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/a_Contact Details'))

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_Street 1_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_Street 1_oxd-input oxd-input--focus'), street1)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_Street 2_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_Street 2_oxd-input oxd-input--focus'), street2)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_City_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_City_oxd-input oxd-input--focus'), city)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_StateProvince_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_StateProvince_oxd-input oxd-input--focus'), state)

CustomKeywords.'SelectAllAndClear.selectAllAndClear'(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_ZipPostal Code_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/input_ZipPostal Code_oxd-input oxd-input--focus'), postcode)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/div_India'))

String currentCountry = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/div_India'), 'innerText')

List<WebElement> countries = WebUI.findWebElements(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/Address/div_India_list'), 10)

int countryCount = countries.size()

WebUI.comment('Count of child div elements: ' + countryCount)

String parameterizedCountryXPath = '//*[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[%d]'
CustomKeywords.'SelectFromDropDown.selectValueFromDropdown'(parameterizedCountryXPath, countryCount, country, currentCountry)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/ContactDetails/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 30)

