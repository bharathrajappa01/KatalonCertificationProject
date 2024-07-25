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
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/a_Emergency Contacts'))
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/button_Add'))


CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Name_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Name_oxd-input oxd-input--focus'), name)

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Relationship_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Relationship_oxd-input oxd-input--focus'), relationship)

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Home Telephone_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Home Telephone_oxd-input oxd-input--focus'), homeTel)

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Mobile_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Mobile_oxd-input oxd-input--focus'), mobile)

CustomKeywords.'ClearField.clearField'(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Work Telephone_oxd-input oxd-input--focus'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/input_Work Telephone_oxd-input oxd-input--focus'), workTel)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/button_Save'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/name_field_added'), 30)

//String actualText = WebUI.getText(findTestObject('Object Repository/MyInfo_Objects/EmergencyContacts/Add/name_field_added'))
//WebUI.verifyMatch(actualText, name, false)

WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 3)

WebUI.closeBrowser()


