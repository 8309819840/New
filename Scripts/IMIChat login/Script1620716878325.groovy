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

WebUI.sendKeys(findTestObject('Object Repository/New Folder (1)/Page_engage/input_Username_loginid'), 'aravind.y@imimobile.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (1)/Page_engage/input_Password_password'), 'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/input_QA Staging_202A1515AC5846789D143EC31600A8654'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/button_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_Switch to Customer Care'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_Ok_icon-search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_-- Select search by --            -- Se_b48d1c'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/li_Mobile Number'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/input_Search Query_txtsearch'), '447384335179')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/a_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/td_CSRZ8R17D96MAZK0'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/td_447384335179'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/td_SMS'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/td_Active'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/td_IVR to SMS'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/td_aravind.y'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_Loading_icon-Chat-console'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/h3_447384335179'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/div_clear_divMsg'), '')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_4YesReceived 45m08 Jul 2021 075740 - A _34eb8b'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_clear'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/div_yhhh'), 'yhhh')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/a_SendCtrlenter'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/div_yhhh'), 'yhhh')

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/div_clear_divMsg'), '')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_Clear Flag_nicescroll-cursors'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_BGS_GENERAL_ENQUIRIES'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_BGS_GENERAL_ENQUIRIES'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_true'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-staging.imi.chat/QA/')

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/input_Username_loginid'), 'aravind.y@imimobile.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (1)/Page_engage/input_Password_password'), 'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/input_QA Staging_202A1515AC5846789D143EC31600A8654'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/button_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_Switch to Customer Care'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_Ok_icon-search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_-- Select search by --            -- Se_b48d1c'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/li_Mobile Number'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/input_Search Query_txtsearch'), '447508350738')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/a_Search'))

String CSR = WebUI.getText(findTestObject('Object Repository/New Folder (1)/Page_engage/td_CSROPVIYZVY83VVK'))

String CustomerIdentifier = WebUI.getText(findTestObject('Object Repository/New Folder (1)/Page_engage/td_447508350738'))

String Channel = WebUI.getText(findTestObject('Object Repository/New Folder (1)/Page_engage/td_SMS'))

String Status = WebUI.getText(findTestObject('Object Repository/New Folder (1)/Page_engage/td_Close'))

String CurrentTeam = WebUI.getText(findTestObject('Object Repository/New Folder (1)/Page_engage/td_IVR to SMS'))

String CurrentAssignee = WebUI.getText(findTestObject('Object Repository/New Folder (1)/Page_engage/td_aravind.y'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/i_aravind.y_fa fa-sign-in'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/button_Yes_1'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_Loading_icon-Chat-console'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/h3_Mohan Prasad'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_MTest2Received 32m08 Jul 2021 101616 - _304781'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_clear'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/div_Hello test'), 'Hello test')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/a_SendCtrlenter'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/div_Hello test'), 'Hello test')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_Clear Flag_nicescroll-cursors'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_engage/div_clear_divMsg'), '')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_BGS_GENERAL_ENQUIRIES'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_BGS_GENERAL_ENQUIRIES'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/span_true'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/div_Clear Flag_nicescroll-cursors'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/button_Toggle Dropdown'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/a_CLOSE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_engage/select_SelectDrive to OnlineResolvedClosedC_c80a72'), 
    '4416', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_engage/button_Yes_1'))

