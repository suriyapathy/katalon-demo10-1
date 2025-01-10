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
import java.util.Random as Random

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

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/MouseOverTo_Customers,Org,Prop group'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/a_Properties'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Listing page/Properties_Listingpage verifiaction'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Listing page/Create New Property'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/input_Property Name'), 
    2)

int length = 8 // Length of the random string

String characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'

Random random = new Random()

String randomString1 = 'Property' + (1..length).collect({ 
        characters.charAt(random.nextInt(characters.length()))
    }).join()

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/input_Property Name'), 
    randomString1)

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Property_Street'), 
    '1st street')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Property-city'), 
    'chennai')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Property_State'), 
    'Andhra')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Property_Landmark'), 
    'Near BSR Mall')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Property_Zipcode'), 
    '123456')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Property_Country'), 
    FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.xpath('//div[contains(@id,"mat-autocomplete")]//mat-option'))

for (WebElement element : elements) {
    String text = element.getText()

    println('Element Text: ' + text)

    if (text.equals('Afghanistan')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element))

        break
    }
}

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/a_Save Property'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/New_Property Create_button'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/New_Property Create_button'))

Property_Name = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro - Org_Detail Page/OrganizationName_verification'))

assert Property_Name == randomString1 : ' wrong Property page  !'

WebUI.closeBrowser()

