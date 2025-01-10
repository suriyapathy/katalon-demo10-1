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

WebUI.navigateToUrl('https://demoqa.com/select-menu')

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Select Option_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Group 1, option 1'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/svg_Group 1, option 1_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Select Title'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Mr'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Mr_1'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Mrs'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Blue'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Blue_1'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Blue_1'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Blue_1'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Red'))

WebUI.click(findTestObject('Object Repository/Page_Dropdown/div_Green'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/select_VolvoSaabOpelAudi'), 'volvo', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/select_VolvoSaabOpelAudi'), 'saab', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/select_VolvoSaabOpelAudi'), 'opel', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/select_VolvoSaabOpelAudi'), 'audi', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/select_VolvoSaabOpelAudi'), 'opel', true)

WebUI.deselectAllOption(findTestObject('Page_Dropdown/select_VolvoSaabOpelAudi'))

WebUI.takeScreenshot()

