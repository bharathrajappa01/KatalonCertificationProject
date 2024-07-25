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

/*
 *  Once Logged in, click on Admin link on the left side of the page and search for user that does not exist
 *
 *  1. Call Login_AI_TC test case
 *  2. Click on Admin_LeftPanel element from Admin object repository
 *  3. Verify Username field is present and visible on the screen
 *  4. Verify User Role field is present and visible on the screen
 *  5. Verify Employee Name field is present and visible on the screen
 *  6. Verify Status field is present and visible on the screen
 */
// Call Login_AI_TC test case
WebUI.callTestCase(findTestCase('Test Cases/Katalon Studio Assist AI/Login_AI_TC'), [:], FailureHandling.STOP_ON_FAILURE)

// Click on Admin_LeftPanel element from Admin object repository
WebUI.click(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Admin_LeftPanel'))

// Verify Username field is present and visible on the screen
WebUI.verifyElementPresent(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Username'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Username'))

// Verify User Role field is present and visible on the screen
WebUI.verifyElementPresent(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/User Role'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/User Role'))

// Verify Employee Name field is present and visible on the screen
WebUI.verifyElementPresent(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Employee Name'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Employee Name'))

// Verify Status field is present and visible on the screen
WebUI.verifyElementPresent(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Status'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Status'))