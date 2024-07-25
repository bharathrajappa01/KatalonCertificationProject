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
 *  Open a browser, navigate to a specific URL, maximize the window, login to a website, and verify the presence of a text.
 *
 *  1. Open a browser with an empty URL.
 *  2. Navigate to 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'.
 *  3. Maximize the window.
 *  4. Set text 'Admin' in the username input field.
 *  5. Set encrypted text in the password input field.
 *  6. Click on the login button.
 *  7. Verify that the text 'Dashboard' is present on the page.


 *
 */
// Open a browser with an empty URL
WebUI.openBrowser('')

// Navigate to 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

// Maximize the window
WebUI.maximizeWindow()

// Set text 'Admin' in the username input field
WebUI.setText(findTestObject('Object Repository/Studio Assist AI Obj Repo/Login/input_Username_username'), 'Admin')

// Set encrypted text in the password input field
WebUI.setEncryptedText(findTestObject('Object Repository/Studio Assist AI Obj Repo/Login/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

// Click on the login button
WebUI.click(findTestObject('Object Repository/Studio Assist AI Obj Repo/Login/button_Login'))

// Verify that the text 'Dashboard' is present on the page
WebUI.verifyElementText(findTestObject('Object Repository/Studio Assist AI Obj Repo/Login/h6_Dashboard'), 'Dashboard')