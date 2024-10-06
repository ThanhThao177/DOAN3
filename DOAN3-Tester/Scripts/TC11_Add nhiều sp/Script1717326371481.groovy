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
WebUI.navigateToUrl('https://www.happyskin.vn/') // Thay đổi URL thành trang web thực tế

// Danh sách các sản phẩm cần thêm vào giỏ hàng
def products = [
	'Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/img_Bn chy_lozad',
	'Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/img_Xem nhanh_lozad',
	'Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/img_Xemthm_lozad'
]

// Vòng lặp để thêm từng sản phẩm vào giỏ hàng
for (product in products) {
	// Tìm kiếm sản phẩm
	WebUI.setText(findTestObject('Object Repository/SearchBox'), product)
	WebUI.click(findTestObject('Object Repository/SearchButton'))
	
	// Chọn sản phẩm từ kết quả tìm kiếm
	WebUI.click(findTestObject('Object Repository/ProductLink', [('productName') : product]))
	
	// Thêm sản phẩm vào giỏ hàng
	WebUI.click(findTestObject('Object Repository/AddToCartButton'))
	
	// Điều hướng quay lại trang chính hoặc trang danh sách sản phẩm
	WebUI.navigateToUrl('URL của trang danh sách sản phẩm hoặc trang chính')
}

// Đóng trình duyệt
WebUI.closeBrowser()