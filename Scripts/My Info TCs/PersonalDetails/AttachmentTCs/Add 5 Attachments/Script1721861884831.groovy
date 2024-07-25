import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import org.openqa.selenium.StaleElementReferenceException

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('LoginPage TCs/Login_RecordMode_TC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))

WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/input_Employee Full Name_firstName'), 
    30)

WebUI.scrollToElement(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'), 10)

for (int i = 1; i <= 5; i++) {
	WebUI.waitForElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'), 30)
	WebUI.waitForElementVisible(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'), 30)
	
	for(int a = 0; a <3; a++) {
		try {
			WebUI.refresh()
			WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/button_Add'))
			break;
		}
		catch(StaleElementReferenceException e) {
			Thread.sleep(2000)
		}
	}

    WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/div_BrowseNo file selected'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/textarea_Comment_oxd-textarea oxd-textarea-_74c597'), 
        0)

    WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/div_Browse'))

    Robot robot = new Robot()

    WebUI.delay(2)

    StringSelection filePath = new StringSelection('C:\\KatalonTestData\\TestDoc.txt')

    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null)

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)

    WebUI.setText(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/textarea_Comment_oxd-textarea oxd-textarea-_74c597'), 
        commentText)

    WebUI.click(findTestObject('Object Repository/MyInfo_Objects/PersonalDetails/AddAttachment/saveBtn'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/CommonObjects/div_SuccessSuccessfully Updated'), 
        3)
}
