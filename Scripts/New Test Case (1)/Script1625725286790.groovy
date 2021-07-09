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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-staging.imi.chat/QA/')

WebUI.setText(findTestObject('Object Repository/New Folder (2)/Page_engage/input_Username_loginid'), 'aravind.y@imimobile.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (2)/Page_engage/input_Password_password'), 'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/input_QA Staging_202A1515AC5846789D143EC31600A8654'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/button_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/span_Switch to Customer Care'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/span_Ok_icon-search'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/div_-- Select search by --            -- Se_b48d1c'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/li_Mobile Number'))

WebUI.setText(findTestObject('Object Repository/New Folder (2)/Page_engage/input_Search Query_txtsearch'), '447769059971')

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/a_Search'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-staging.imi.chat/QA/')

WebUI.setText(findTestObject('Object Repository/New Folder (2)/Page_engage/input_Username_loginid'), 'aravind.y@imimobile.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (2)/Page_engage/input_Password_password'), 'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/input_QA Staging_202A1515AC5846789D143EC31600A8654'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/button_Yes'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/span_Switch to Customer Care'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/span_IVR to SMS'))

WebUI.setText(findTestObject('Object Repository/New Folder (2)/Page_engage/input_IVR to SMS_ddlhdrTeams_titleText'), 'webs')

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_engage/span_Website to SMS'))

WebUI.setText(findTestObject('Object Repository/New Folder (2)/Page_engage/input_IVR to SMS_ddlhdrTeams_titleText'), 'webs')

