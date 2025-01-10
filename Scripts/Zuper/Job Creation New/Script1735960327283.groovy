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
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.Keys as Keys

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

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Jobs Group_mouse over'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Jobpage_click'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Listing Page/JobsLisiting_page _verification'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Listing Page/New Job Creation'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/JobsCreationpage _verification'), 
    2)

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Job_Prefix'), 'Test')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Job_title'), 'Validation Job')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Job Category'))

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.xpath('//span[@class=\'mat-option-text\']'))

for (WebElement element : elements) {
    String text = element.getText()

    println('Element Text: ' + text)

    if (text.equals('Validation Category')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element))

        break
    }
}

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Add Customer'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), 'zuper customer')

Actions actions = new Actions(driver)

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Selecct_circle'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Choose_Customer'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/input_Due Date'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Current_date'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/sameAsServiceAddress'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/sameAsServiceAddress'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/a_Create Job'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/NewJobCreate_button'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/NewJobCreate_button'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Detail Page/JobTitle'), 2)

Jobtitle = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Detail Page/JobTitle'))

assert Jobtitle == 'Validation Job' : ' wrong Job page  !'

