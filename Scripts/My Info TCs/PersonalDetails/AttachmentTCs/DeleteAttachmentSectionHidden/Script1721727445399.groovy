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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.refresh()
WebUI.delay(3)
WebUI.scrollToPosition(0, 9999)
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'))
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Columns/div_File Name'), 5)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Columns/div_Description'), 5)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Columns/div_Size'), 5)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Columns/div_Type'), 5)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Columns/div_Date Added'), 5)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Columns/div_Added By'), 5)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Columns/div_Actions'), 5)
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/Cancel_Btn'))