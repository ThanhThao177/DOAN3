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

WebUI.navigateToUrl('https://www.happyskin.vn/login')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - HappySkin Vit Nam/input_a ch email_Email'), 'hoangthanhthao177dr@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp - HappySkin Vit Nam/input_Mt khu_Password'), 'yHYQs2kKwkHnC57uTklRHw==')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - HappySkin Vit Nam/button_ng nhp'))

String gurl = WebUI.getUrl()

WebUI.verifyEqual(gurl, 'https://www.happyskin.vn/')

WebUI.delay(5)

WebUI.click(findTestObject('Page_HappySkin.Vn  M Phm Chnh Hng v Clinic _18ea77/img_Xem nhanh_lozad'))

WebUI.click(findTestObject('Object Repository/Page_My Ra Mt Emmi Premium Facial Cleansing_c1d88d/span_Thm vo gi hng'))

WebUI.click(findTestObject('Object Repository/Page_My Ra Mt Emmi Premium Facial Cleansing_c1d88d/span_Xem gi hng  thanh ton'))

WebUI.closeBrowser()

