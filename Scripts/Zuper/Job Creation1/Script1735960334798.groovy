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

WebUI.openBrowser('http://159.89.160.200/v2/login')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Zuper/Login_Process/Page_Zuper_Internal Admin - Login/button_Sign in'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Zuper/Login_Process/Page_Zuper_Internal Admin - Login/input_Email Address_email'), 'suriyapathy.b@zuper.co')

WebUI.sendKeys(findTestObject('Zuper/Login_Process/Page_Zuper_Internal Admin - Login/input_Password_password'), 'ZPSacc@Z230')

WebUI.delay(5)

WebUI.click(findTestObject('Zuper/Login_Process/Page_Zuper_Internal Admin - Login/button_Sign in'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementVisible(findTestObject('Zuper/Login_Process/Page_Internal Admin - CustomersPage/header _Customers- verification'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Zuper/Login_Process/Page_Internal Admin - CustomersPage/input_Customersname'), 'Brothergutters-Jacksonville,FL')

WebUI.delay(2)

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - CustomersPage/click-customer'))

WebUI.verifyElementVisible(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers_Login/Page _Account Details_ verification'))

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers_Login/Navigate_Users'))

WebUI.sendKeys(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers_Login/input_Users_ search area'), 'zuper')

WebUI.delay(2)

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers_Login/button_Login'))

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers/Hours_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers/4 hours'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers/Web_selecter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers/Web V3'))

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers/Login Reason'))

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers/Demo_select'))

WebUI.click(findTestObject('Zuper/Login_Process/Page_Internal Admin - Customers/button_Login'))

WebUI.switchToWindowTitle('Zuper Pro - Dashboard')

WebUI.waitForPageLoad(5)

WebUI.deleteAllCookies(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Pop_Msg'), 5)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Pop_Msg'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Jobs Group_mouse over'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/Jobpage_click'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Listing Page/New Job Creation'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Job_Prefix'), 'Test')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Job_title'), 'Validation Job')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Job Category'))

WebDriver driver = DriverFactory.getWebDriver()

WebUI.acceptAlert()

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

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), 'Validation Job')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Selecct_circle'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Choose_Customer'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/input_Due Date'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Current_date'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/sameAsServiceAddress'), 3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/sameAsServiceAddress'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/a_Create Job'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/NewJobCreate_button'), 3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/NewJobCreate_button'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Detail Page/JobTitle'), 2)

Jobtitle = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Detail Page/JobTitle'))

assert Jobtitle == 'Validation Job' : ' wrong Job page  !'

