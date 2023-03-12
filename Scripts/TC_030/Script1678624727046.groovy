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

WebUI.navigateToUrl('https://www.brusselsairport.be/en/passengers')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Arrivals/Page_All information for passengers  Brusse_cca901/button_Ok, thanks'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Arrivals/Page_All information for passengers  Brusse_cca901/a_Flights'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Arrivals/Page_Departures  Brussels Airport/a_Arrivals'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Arrivals/Page_Arrivals  Brussels Airport/input_Destinations_search-query'), 
    'istanbul')

WebUI.click(findTestObject('Object Repository/Arrivals/Page_Arrivals  Brussels Airport/button_Search'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/BrusselsAirportSearch/Page_Departures  Brussels Airport/searchResult'), 
    'Istanbul')

WebUI.takeScreenshot()

WebUI.closeBrowser()

