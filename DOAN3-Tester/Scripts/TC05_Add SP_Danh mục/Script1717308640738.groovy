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

WebUI.click(findTestObject('Object Repository/Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/a_SkinStore'))

String titlePageCatalog = WebUI.getWindowTitle()

if (titlePageCatalog.contains('Home')) {
    println('danh mục sản phẩm ')

    WebUI.click(findTestObject('Object Repository/Page_SkinStore - H Thng Bn L M Phm Chnh Hng_d6af47/a_Chm Sc Ln Da (187)'))
}

//WebUI.click(findTestObject('Object Repository/Page_SkinStore - H Thng Bn L M Phm Chnh Hng_d6af47/a_Chm Sc Ln Da (187)'))
WebUI.delay(5)

String titlePageCatalog01 = WebUI.getWindowTitle()

if (titlePageCatalog01.contains('Chăm sóc làn da')) {
    println('danh sách chăm sóc làn da ')

    WebUI.click(findTestObject('Object Repository/Page_Sn phm chm sc da chnh hng - HappySkin Vit Nam/a_Lm Sch (33)'))
}

//WebUI.click(findTestObject('Object Repository/Page_Sn phm chm sc da chnh hng - HappySkin Vit Nam/a_Lm Sch (33)'))
WebUI.delay(5)

String titlePageCatalog02 = WebUI.getWindowTitle()

if (titlePageCatalog02.contains('Làm sạch')) {
    println('danh sách Làm sạch da ')

    WebUI.click(findTestObject('Object Repository/Page_Sn Phm Lm Sch Da Mt Chnh Hng - HappySk_991369/a_Emmi by HappySkin (10)'))
}

//WebUI.click(findTestObject('Object Repository/Page_Sn Phm Lm Sch Da Mt Chnh Hng - HappySk_991369/a_Emmi by HappySkin (10)'))


String titlePageCatalog03 = WebUI.getWindowTitle()

if (titlePageCatalog03.contains('Sạch mụn-da tráng gương')) {
    println('Dung dịch tẩy tế báo chết ')

    WebUI.click(findTestObject('Object Repository/Page_Sn Phm Lm Sch Da Mt Chnh Hng - HappySk_991369/img_Lc sn phm_lozad'))
}

//WebUI.click(findTestObject('Object Repository/Page_Sn Phm Lm Sch Da Mt Chnh Hng - HappySk_991369/img_Lc sn phm_lozad'))


String titlePageCatalog04 = WebUI.getWindowTitle()

if (titlePageCatalog04.contains('Dung dịch tẩy tế bào chết')) {
    println('Đã đến trang chi tiết sản phẩm ')

    WebUI.click(findTestObject('Object Repository/Page_Dung Dch Ty T Bo Cht Emmi All Target S_910227/span_Thm vo gi hng'))
}

WebUI.closeBrowser()

