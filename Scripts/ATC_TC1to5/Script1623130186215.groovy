import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.VerifyEqualKeyword as VerifyEqualKeyword
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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

for (i = 1; i <= 1; i++) {
    response = WS.sendRequest(findTestObject('ATC request', [('segment') : findTestData('ATC_TestData').getValue(1, i), ('language') : findTestData(
				'ATC_TestData').getValue(2, i), ('userId') : findTestData('ATC_TestData').getValue(3, i), ('emailAddress') : findTestData(
				'ATC_TestData').getValue(4, i), ('cellNumber') : findTestData('ATC_TestData').getValue(5, i), ('firstName') : findTestData(
				'ATC_TestData').getValue(6, i)]))

    int status_code = response.getStatusCode()

    def mt_trans_id = WS.getElementPropertyValue(response, 'response[0].transid')

    String MT_transID = (('Transid_' + i) + ':') + mt_trans_id

    println(MT_transID)

    for (int j = i; j <= i; j++) {
        String excelFile01 = 'C:\\Users\\aravind.y\\Katalon Studio\\ATC\\Data Files\\ATC_TestData.xlsx'

        workbook01 = ExcelKeywords.getWorkbook(excelFile01)

        sheet01 = ExcelKeywords.getExcelSheet(workbook01, 'Sheet1')

        ExcelKeywords.setValueToCellByIndex(sheet01, j, 6, MT_transID)

        WebUI.openBrowser('https://kibana.imiconnect.io/')

        WebUI.maximizeWindow()

        WebUI.delay(30)

        WebUI.sendKeys(findTestObject('Page_Kibana/input_Last 15 minutes_kuiLocalSearchInput kuiLocalSearchInput--lucene ng-pristine ng-valid ng-touched'), 
            ('tid:' + mt_trans_id) + '*')

        WebUI.click(findTestObject('Page_Kibana/button_Uses lucene query syntax_kuiLocalSearchButton'))

        WebUI.click(findTestObject('Page_Kibana/span_imiconnect_api_v1-'))

        WebUI.sendKeys(findTestObject('Page_Kibana/input_imiconnect_api_v1-_form-control ui-select-search ng-pristine ng-valid ng-touched'), 
            'sfe_trans')

        WebUI.click(findTestObject('Page_Kibana/span_imiconnect_sfe_trans_logs'))

        WebUI.click(findTestObject('Page_Kibana/span_sequence'))

        WebUI.click(findTestObject('Page_Kibana/button_add'))

        WebUI.click(findTestObject('Page_Kibana/span_description'))

        WebUI.click(findTestObject('Page_Kibana/button_add_decription'))

        WebUI.click(findTestObject('Page_Kibana/th_sequence'))

        WebUI.click(findTestObject('Page_Kibana/i_sequence_fa fa-sort-up table-header-sortchange'))

        WebUI.click(findTestObject('Page_Kibana/i_sequence_fa fa-sort-up'))

        String sequence_id = WebUI.getText(findTestObject('Page_Kibana/span_24'))

        String node_decription = WebUI.getText(findTestObject('Page_Kibana/div_Deliveredchannel  SMS   continue flag  2  event   ondrsuccess'))

        println(node_decription)

        if (((sequence_id == '19') && node_decription.contains('Delivered')) && node_decription.contains('RTM')) {
            ExcelKeywords.setValueToCellByIndex(sheet01, j, 7, 'Pass')

            ExcelKeywords.saveWorkbook(excelFile01, workbook01)

            WebUI.closeBrowser()
        } else {
            ExcelKeywords.setValueToCellByIndex(sheet01, j, 7, 'Fail')

            ExcelKeywords.setValueToCellByIndex(sheet01, j, 8, node_decription)

            ExcelKeywords.saveWorkbook(excelFile01, workbook01)

            WebUI.closeBrowser()
        }
    }
}



