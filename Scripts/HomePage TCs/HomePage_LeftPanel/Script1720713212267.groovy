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

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Admin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/PIM'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Leave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Time'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Recruitment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Performance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Dashboard'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Directory'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Maintenance'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Claim'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HomePage_Objects/LeftPanel/Buzz'))

