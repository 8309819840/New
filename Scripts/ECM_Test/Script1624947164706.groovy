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
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

for (i = 1; i <= 1; i++) {
ResponseObject response = WS.sendRequest(findTestObject('ECM request', [('description') : findTestData('ECM_TestData').getValue(1, i), ('language') : findTestData(
                'ECM_TestData').getValue(2, i)]))

int status_code = response.getStatusCode()

def mt_trans_id = WS.getElementPropertyValue(response, 'response[0].transid')

String MT_transID = (('Transid_' + i) + ':') + mt_trans_id

println(MT_transID)



	for (int j = i; j <= i; j++) {
		String excelFile01 = 'C:\\Users\\aravind.y\\Katalon Studio\\ATC\\Data Files\\ECM_TestData.xlsx'

		workbook01 = ExcelKeywords.getWorkbook(excelFile01)

		sheet01 = ExcelKeywords.getExcelSheet(workbook01, 'Sheet1')

		ExcelKeywords.setValueToCellByIndex(sheet01, j, 3, MT_transID)
		
			}
	}