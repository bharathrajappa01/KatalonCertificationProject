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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LoginPage TCs/Login_RecordMode_TC'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'RefreshBrowser.refreshBrowser'()
CustomKeywords.'Wait.wait'(5)
int count1 = CustomKeywords.'InputTag.getCountOfInputTags'(findTestObject('Object Repository/HomePage_Objects/homePage_html'))
KeywordUtil.logInfo("No of Inputs tags are: "+count1)

WebUI.click(findTestObject('Object Repository/HomePage_Objects/LeftPanel/My Info'))
int count2 = CustomKeywords.'InputTag.getCountOfInputTags'(findTestObject('Object Repository/HomePage_Objects/homePage_html'))
KeywordUtil.logInfo("No of Inputs tags are: "+count2)

int noOfScriptTags = CustomKeywords.'ScriptCK.getNoOfScriptTags'(By.xpath("//script"))
KeywordUtil.logInfo("No of Script tags are: "+noOfScriptTags)

CustomKeywords.'Close.closeBrowser'()

