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

WebUI.openBrowser('https://kibana.imiconnect.io/')

WebUI.click(findTestObject('Page_Kibana/span_imiconnect_api_v1-'))

WebUI.sendKeys(findTestObject('Page_Kibana/input_imiconnect_api_v1-_form-control ui-select-search ng-pristine ng-valid ng-touched'), 
    'sfe_trans')

WebUI.click(findTestObject('Page_Kibana/span_imiconnect_sfe_trans_logs'))

WebUI.sendKeys(findTestObject('Page_Kibana/input_Last 15 minutes_kuiLocalSearchInput kuiLocalSearchInput--lucene ng-pristine ng-valid ng-touched'),
	('tid:' + mt_trans_id) + '*')

WebUI.click(findTestObject('Page_Kibana/button_Uses lucene query syntax_kuiLocalSearchButton'))

WebUI.click(findTestObject('Page_Kibana/div_tnode_name    add'))

WebUI.click(findTestObject('Page_Kibana/button_add_decription'))

WebUI.click(findTestObject('Page_Kibana/div_sequence    add'))

WebUI.click(findTestObject('Page_Kibana/button_add_decription'))

