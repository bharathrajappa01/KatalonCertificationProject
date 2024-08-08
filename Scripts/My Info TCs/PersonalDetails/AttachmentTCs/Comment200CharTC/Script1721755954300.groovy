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


WebUI.scrollToPosition(0, 9999)
WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'))
WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/textarea_Comment'), commentText)
WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/200CharMsg'), 10)
String text = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/200CharMsg'), 'innerText')
WebUI.verifyMatch(text, 'Should not exceed 200 characters', false)

TestObject commentBox = findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/textarea_Comment')
WebUI.sendKeys(commentBox, Keys.chord(Keys.END))
WebUI.sendKeys(commentBox, Keys.chord(Keys.BACK_SPACE))
WebUI.verifyElementNotPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/200CharMsg'), 10)

WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/Cancel_Btn'))