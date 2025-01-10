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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://stagingv3.zuperpro.com/login')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Zuper/Company_selection Page/Page_Comapany_Selected_Page/Page_Zuper Pro - Login/span_Company Name'), 
    3)

WebUI.sendKeys(findTestObject('Zuper/Company_selection Page/Page_Comapany_Selected_Page/div_Company Name'), 'bg-JacksonvilleFL')

WebUI.click(findTestObject('Zuper/Company_selection Page/Page_Comapany_Selected_Page/button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Zuper/Company_selection Page/Page_Comapany_Selected_Page/Page_Zuper Pro - Login/a_Forgot password'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject('Zuper/Company_selection Page/Page_Comapany_Selected_Page/Page_Zuper Pro - Login/div_Email address'), 
    'suriyapathy.b@zuper.co')

WebUI.sendKeys(findTestObject('Zuper/Company_selection Page/Page_Comapany_Selected_Page/Page_Zuper Pro - Login/div_Password'), 
    '12345678')

WebUI.click(findTestObject('Zuper/Company_selection Page/Page_Comapany_Selected_Page/Page_Zuper Pro - Login/button_Login'))

WebUI.waitForPageLoad(5)

WebUI.deleteAllCookies(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Pop_Msg'), 5)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Pop_Msg'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Dashboard_verification'), 2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/a_Parts  Services'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Listing page/PartsServices_page Verificaion'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Listing page/a_New PartService'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Part Name'), 
    2)

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_prefix'), 'testcustomer@gmail.com')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Part Name'), 'Test')

int length = 3 // Length of the random string

String characters = '0123456789'

Random random = new Random()

String randomString2 = 'Parts' + (1..length).collect({ 
        characters.charAt(random.nextInt(characters.length()))
    }).join()

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Part Number'), randomString2)

//WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Part Number'), '123')
WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Part_Type'), FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.xpath('//div[contains(@id,"mat-select")]//mat-option'))

for (WebElement element : elements) {
    String text = element.getText()

    println('Element Text: ' + text)

    if (text.equals('Product')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element))

        break
    }
}

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_Choose a category'), 
    FailureHandling.STOP_ON_FAILURE)

List<WebElement> elements1 = driver.findElements(By.xpath('//div[contains(@id,"mat-select")]//mat-option'))

for (WebElement element1 : elements1) {
    String text1 = element1.getText()

    println('Element Text: ' + text1)

    if (text1.equals('Test Product Category')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element1))

        break
    }
}

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_Brand'), 'test_brand')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_Specification_specification'), 
    'test_spec')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_Unit of Measurement'), 
    'test_UOM')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_USD_purchasePrice'), 
    '10')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_USD_sellingPrice'), 
    '100')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_Minimum Qty'), '100')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/Parts_Available Qty'), '1')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/a_Save Parts'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/New_Parts Create_button'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Creation Page/New_Parts Create_button'))

Parts_Name = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Parts/Page_Zuper Pro - Parts_Details page -/PartsServices_page Verificaion'))

assert Parts_Name == 'Test' : ' wrong customer page  !'

WebUI.closeBrowser()

