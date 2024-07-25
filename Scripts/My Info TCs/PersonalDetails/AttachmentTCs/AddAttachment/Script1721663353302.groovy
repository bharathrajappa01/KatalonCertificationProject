import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

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

WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'), 
    30)

WebUI.scrollToElement(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'), 10)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'))

WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/div_BrowseNo file selected'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/textarea_Comment_oxd-textarea oxd-textarea-_74c597'), 
    0)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/div_Browse'))

Robot robot = new Robot()
WebUI.delay(2)

StringSelection filePath = new StringSelection("C:\\KatalonTestData\\TestDoc.txt")

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null)

robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyPress(KeyEvent.VK_V)
robot.keyRelease(KeyEvent.VK_V)
robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_ENTER)
robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/textarea_Comment_oxd-textarea oxd-textarea-_74c597'), commentText)
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/saveBtn'))
WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 3)
