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
 *  Once Logged in, click on Admin link on the left side of the page and verify that Admin page is displayed
 *
 *  1. Call Login_AI_TC test case
 *  2. Click on Admin_LeftPanel element from Admin object repository
 *  3. Verify that Username field is displayed
 *  4. Enter Admin in the Username field
 *  5. Click on Search button
 */


// Call Admin_AI_TC test case
WebUI.callTestCase(findTestCase('Katalon Studio Assist AI/Login_AI_TC'), [:], FailureHandling.STOP_ON_FAILURE)

// Click on Admin_LeftPanel element from Admin object repository
WebUI.click(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Admin_LeftPanel'))

// Verify that Username field is displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Username'), 30)

// Enter Admin in the Username field
WebUI.setText(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Username'), 'Admin')

// Click on Search button
WebUI.click(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Search button'))

