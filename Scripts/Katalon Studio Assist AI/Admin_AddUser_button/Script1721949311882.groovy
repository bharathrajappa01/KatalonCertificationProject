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
 *  3. Click on Add button
 *  4. Verify that Add User screen is shown
 *  5. Click on Cancel button
 *  6. Verify that System users screen is shown
 */
// Call Login_AI_TC test case
WebUI.callTestCase(findTestCase('Test Cases/Katalon Studio Assist AI/Login_AI_TC'), [:], FailureHandling.STOP_ON_FAILURE)

// Click on Admin_LeftPanel element from Admin object repository
WebUI.click(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Admin_LeftPanel'))

// Click on Add button
WebUI.click(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/Add button'))

// Verify that Add User screen is shown
WebUI.verifyElementPresent(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/AddUser_Header'), 10)

// Click on Cancel button
WebUI.click(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/AddUser_Cancel button'))

// Verify that System users screen is shown
WebUI.verifyElementPresent(findTestObject('Object Repository/Studio Assist AI Obj Repo/Admin/SystemUser_Header'), 10)