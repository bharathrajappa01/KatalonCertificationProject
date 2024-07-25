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
WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'), 30)


//allergies
//WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/Alllergies'), 10)
//WebUI.scrollToElement(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/Alllergies'), 5)
//WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/Alllergies'))
//WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/Allergy_Peanut'))

//bloodtype
//WebUI.scrollToElement(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/bloodType'), 10)
WebUI.scrollToPosition(0, 900)
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/bloodType'))
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/BloodType_B_positive'))

//WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/Test_Field'), 'Demo123')
CustomKeywords.'SendText.sendText'(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/Test_Field'), 'Demo123')

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/CustomFields/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 3)

WebUI.closeBrowser()