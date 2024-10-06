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

WebUI.navigateToUrl('https://www.happyskin.vn/')
WebUI.maximizeWindow()
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/p_Tm kim sn phm'))
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/input_Qun mt khu_query'), 
    Timkiem)

WebUI.sendKeys(findTestObject('Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/input_Qun mt khu_query'), 
    Keys.chord(Keys.ENTER))

//WebUI.verifyTextPresent(Result, false)

String gurl1 = WebUI.getUrl()

if (gurl1 == 'https://www.happyskin.vn/') {
	// Nếu URL khớp
	println('URL khớp với URL mong muốn.') // Thực hiện các bước tiếp theo (nếu có)
	// Nếu URL không khớp
	// Thực hiện hành động khác (ví dụ: báo lỗi)
} else {
	WebUI.verifyTextPresent(Result, false)

	println('URL không khớp với URL mong muốn.')

	WebUI.comment('Error: URL không khớp với URL mong muốn.')
}

WebUI.closeBrowser()

