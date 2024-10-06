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

WebUI.navigateToUrl('https://www.happyskin.vn/register')

WebUI.setText(findTestObject('Object Repository/Page_ng k - HappySkin Vit Nam_ĐKI/input_Email_Email'), Emaill)

WebUI.setText(findTestObject('Object Repository/Page_ng k - HappySkin Vit Nam_ĐKI/input_H v tn_FullName'), HOTEN)

WebUI.click(findTestObject('Object Repository/Page_ng k - HappySkin Vit Nam_ĐKI/input_H v tn_FullName'))

WebUI.setText(findTestObject('Object Repository/Page_ng k - HappySkin Vit Nam_ĐKI/input_Mt khu_Password'), Pass)

WebUI.setText(findTestObject('Object Repository/Page_ng k - HappySkin Vit Nam_ĐKI/input_Nhp li mt khu_ConfirmPassword'), Pass01)

WebUI.click(findTestObject('Object Repository/Page_ng k - HappySkin Vit Nam_ĐKI/button_ng k'))
String gurl = WebUI.getUrl()

if (gurl == 'https://www.happyskin.vn/') {
	// Nếu URL khớp
	println("URL khớp với URL mong muốn.")
	// Thực hiện các bước tiếp theo (nếu có)
} else {
	WebUI.verifyTextPresent(Result, false)
	// Nếu URL không khớp
	println("URL không khớp với URL mong muốn.")
	// Thực hiện hành động khác (ví dụ: báo lỗi)
	WebUI.comment('Error: URL không khớp với URL mong muốn.')
}

//WebUI.verifyTextPresent(Result, false)

WebUI.closeBrowser()

