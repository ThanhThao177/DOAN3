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
String titlePageCatalog = WebUI.getWindowTitle()

if (titlePageCatalog.contains('Danh mục')) {
	println('danh mục tìm kiếm ')

	WebUI.click(findTestObject('Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/a_Ty Trang'))
}

//WebUI.click(findTestObject('Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/a_Ty Trang'))
WebUI.delay(5)
String titlePageCatalog01 = WebUI.getWindowTitle()

if (titlePageCatalog01.contains('Tẩy trang')) {
	println('danh mục tẩy trang ')

	WebUI.click(findTestObject('Object Repository/Page_Sn Phm Ty Trang Chnh Hng - An Ton - Gi_b0f7b4/a_Bioderma (4)'))
}
//WebUI.click(findTestObject('Object Repository/Page_Sn Phm Ty Trang Chnh Hng - An Ton - Gi_b0f7b4/a_Bioderma (4)'))

WebUI.delay(5)
String titlePageCatalog02 = WebUI.getWindowTitle()

if (titlePageCatalog02.contains('Nước tẩy trang dành cho da nhạy cảm')) {
	println('tẩy trang biodema ')

	WebUI.click(findTestObject('Object Repository/Page_Sn Phm Ty Trang Chnh Hng - An Ton - Gi_b0f7b4/img_Lc sn phm_lozad'))
}

//WebUI.click(findTestObject('Object Repository/Page_Sn Phm Ty Trang Chnh Hng - An Ton - Gi_b0f7b4/img_Lc sn phm_lozad'))
WebUI.delay(5)
String titlePageCatalog03 = WebUI.getWindowTitle()

if (titlePageCatalog03.contains('Nước tẩy trang dành cho da nhạy cảm')) {
	println('đã đến trang chi tiết sản phẩm')

	WebUI.click(findTestObject('Object Repository/Page_Nc Ty Trang Dnh Cho Da Nhy Cm Bioderma_e56f51/span_Thm vo gi hng'))
}

//WebUI.click(findTestObject('Object Repository/Page_Nc Ty Trang Dnh Cho Da Nhy Cm Bioderma_e56f51/span_Thm vo gi hng'))

WebUI.delay(5)
String titlePageCatalog04 = WebUI.getWindowTitle()

if (titlePageCatalog04.contains('ĐH 399k tặng 5 Mask SexyLook trị giá 299k')) {
	println('đã đến trang chi tiết sản phẩm')

	WebUI.click(findTestObject('Object Repository/Page_Nc Ty Trang Dnh Cho Da Nhy Cm Bioderma_e56f51/span_Xem gi hng  thanh ton'))
}
//WebUI.click(findTestObject('Object Repository/Page_Nc Ty Trang Dnh Cho Da Nhy Cm Bioderma_e56f51/span_Xem gi hng  thanh ton'))
//WebUI.delay(5)
//String titlePageCatalog = WebUI.getWindowTitle()

//if (titlePageCatalog.contains('Giỏ hàng của bạn')) {
	//println('đã đến trang giỏ hàng')

	//WebUI.click(findTestObject('Object Repository/Page_Thanh ton - HappySkin Vit Nam/div_'))
//}
//WebUI.click(findTestObject('Object Repository/Page_Thanh ton - HappySkin Vit Nam/div_'))

WebUI.closeBrowser()

