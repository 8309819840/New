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

WebUI.openBrowser('https://qa-staging.imi.chat/QA/')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_engage/input_Username'), 'aravind.y@imimobile.com')

WebUI.sendKeys(findTestObject('Page_engage/input_Password_password'), 'Test@1234')

WebUI.click(findTestObject('Page_engage/Login'))

WebUI.delay(15)

WebUI.click(findTestObject('Page_engage/span_Switch to Customer Care'))

WebUI.click(findTestObject('Page_engage/span_IVR to SMS'))

WebUI.sendKeys(findTestObject('Page_engage/input_IVR to SMS_ddlhdrTeams_titleText'), 'IVR to SMS')

WebUI.click(findTestObject('Page_engage/span_Website to SMS'))

WebUI.click(findTestObject('Page_engage/span_Ok_icon-search'))

WebUI.click(findTestObject('Page_engage/a_-- Select search by --'))

WebUI.click(findTestObject('Page_engage/li_Mobile Number'))

WebUI.sendKeys(findTestObject('Page_engage/Search box to enter the mbl number'), '447508350738')

WebUI.click(findTestObject('Page_engage/Search button to search with mbl number'))

String CSR = WebUI.getText(findTestObject('Page_engage/td_CSRZ8R17D96MAZK0'))

println(CSR)

String CustomerIdentifier = WebUI.getText(findTestObject('Page_engage/td_447384335179'))

println(CustomerIdentifier)

String Channel = WebUI.getText(findTestObject('Page_engage/td_SMS'))

println(Channel)

String Status = WebUI.getText(findTestObject('Page_engage/td_Queue'))

println(Status)

String CurrentTeam = WebUI.getText(findTestObject('Page_engage/td_IVR to SMS'))

println(CurrentTeam)

String CurrentAssignee = WebUI.getText(findTestObject('Page_engage/td_New Conversation'))

println(CurrentAssignee)

WebUI.click(findTestObject('Page_engage/span_Loading_icon-Chat-console'))

WebUI.click(findTestObject('Page_engage/Load chat confirmation'))

WebUI.click(findTestObject('Page_engage/After entering mobile number'))

WebUI.click(findTestObject('Page_engage/h3_447384335179'))

String chatHistory = WebUI.getText(findTestObject('Page_engage/Chat history'))

println(chatHistory)

WebUI.sendKeys(findTestObject('Page_engage/div_clear_divMsg'), 'Hello test MT')

WebUI.click(findTestObject('Page_engage/a_SendCtrlenter'))

String OtherDetails = WebUI.getText(findTestObject('Page_engage/Other details'))

println(OtherDetails)

WebUI.click(findTestObject('Page_engage/button_On Hold'))

WebUI.click(findTestObject('Page_engage/Onhold_button_Yes'))

