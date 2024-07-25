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

WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'),
	30)

WebUI.scrollToPosition(0, 900)

String text = WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Page_OrangeHRM/Record Found'), 'innerText')
String numOfAttachments = text.substring(text.indexOf('(') + 1, text.indexOf(')'))
int noOfRows = numOfAttachments.toInteger()
println noOfRows

int count = 1
while(count <= noOfRows)
{
	WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Page_OrangeHRM/DeleteBtn_FirstRow'))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Delete Panel/DeletePanel'), 30)
	
	WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Delete Panel/button_Yes, Delete'))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Delete Panel/div_SuccessSuccessfully Deleted'), 30)
	
	WebUI.delay(2)
	count++;
}

if(WebUI.getAttribute(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/DeleteAttachment/Page_OrangeHRM/No Records Found Only'), 'innerText') == 'No Records Found') {
	WebUI.closeBrowser()
	
}