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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/input_Username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/input_Password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/btn_Login'))

WebUI.click(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/btn_Add to cart'))

WebUI.click(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/a_1'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/btn_Checkout'))

WebUI.setText(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/input_firstName'), 'nana')

WebUI.setText(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/input_LastName'), 'zhou')

WebUI.setText(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/input_PostalCode'), '99880')

WebUI.click(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/btn_Continue'))

WebUI.click(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/btn_Finish'))

WebUI.verifyElementText(findTestObject('Object Repository/vld_Checkout/Page_Swag Labs/success_message'), 'THANK YOU FOR YOUR ORDER')

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

