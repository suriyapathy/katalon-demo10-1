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

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/MouseOverTo_Customers,Org,Prop group'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/a_Organizations'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro - Organizations_Listing page/Organizations_Verification'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro - Organizations_Listing page/Creation_New Organization'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/organization_name'), 
    2)

int length = 8 // Length of the random string

String characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789'

Random random = new Random()

String random_Org_Name = 'Org' + (1..length).collect({ 
        characters.charAt(random.nextInt(characters.length()))
    }).join()

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/organization_name'), 
    random_Org_Name)

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Organization_Email'), 
    'Organization@gmail.com')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Org_Billing Address_same-as-service-address'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Organization_Street'), 
    '1st street')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Organization_city'), 
    'chennai')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Organization_State'), 
    'Andhra')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Organization_Landmark'), 
    'Near BSR Mall')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Organization_Zipcode'), 
    '123456')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/Organization_Country'), 
    FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements_Org_Countrys = driver.findElements(By.xpath('//div[contains(@id,"mat-autocomplete")]//mat-option'))

for (WebElement elements_Org_Country : elements_Org_Countrys) {
    String text = elements_Org_Country.getText()

    println('Element Text: ' + text)

    if (text.equals('Afghanistan')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(elements_Org_Country))

        break
    }
}

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/a_Save Organization'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/NewOrganizationCreate_button'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro -Organization_Creation Page/NewOrganizationCreate_button'))

Org_Name = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro - Org_Detail Page/OrganizationName_verification'))

assert Org_Name == random_Org_Name : ' wrong Organization page  !'

//Property Creation
WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/MouseOverTo_Customers,Org,Prop group'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/a_Properties'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Listing page/Properties_Listingpage verifiaction'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Listing page/Create New Property'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/input_Property Name'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/input_Choose Organization'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), random_Org_Name)

Actions actions = new Actions(driver)

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Selecct_circle'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Choose_Organization'))

String random_Property_name = 'Property' + (1..length).collect({ 
        characters.charAt(random.nextInt(characters.length()))
    }).join()

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/input_Property Name'), 
    random_Property_name)

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

List<WebElement> elements_Property_Countrys = driver.findElements(By.xpath('//div[contains(@id,"mat-autocomplete")]//mat-option'))

for (WebElement element_Property_Country : elements_Property_Countrys) {
    String text = element_Property_Country.getText()

    println('Element Text: ' + text)

    if (text.equals('Afghanistan')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element_Property_Country))

        break
    }
}

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/a_Save Property'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/New_Property Create_button'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/New_Property Create_button'))

Property_Name = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Organization/Page_Zuper Pro - Org_Detail Page/OrganizationName_verification'))

assert Property_Name == random_Property_name : ' wrong Property page  !'

// Customer Craetion
WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/MouseOverTo_Customers,Org,Prop group'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Dashboard/a_Customers_Click'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customers_Listing Page/Customers_listingPage_Verification'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customers_Listing Page/a_New Customer_ Link'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_Creationpage_Verification'), 
    2)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/input_Choose Organization'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), random_Org_Name)

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Select_circle_Organization'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Properties/Page_Zuper Pro - Property_Creation page/Choose_Organization'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/input__customer_email'), 
    'testcustomer@gmail.com')

String random_customer_name = 'Customer_' + (1..length).collect({ 
        characters.charAt(random.nextInt(characters.length()))
    }).join()

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_first_name'), 
    random_customer_name)

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_last_name'), 
    'Test')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_home_number'), 
    '1')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_mobile_number'), 
    '2')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_work_number'), 
    '3')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/a_Pick Property'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), random_Property_name)

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Select_circle_Property'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Choose_Property'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_Billing Address_same-as-service-address'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_street address'), 
    '1st street')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_City'), 'chennai')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_State'), 
    'Andhra')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_Landmark'), 
    'Near BSR Mall')

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_Zipcode'), 
    '123456')

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/Customer_Country'), 
    FailureHandling.STOP_ON_FAILURE)

List<WebElement> elements_Customer_Countrys = driver.findElements(By.xpath('//div[contains(@id,"mat-autocomplete")]//mat-option'))

for (WebElement element_Customer_Country : elements_Customer_Countrys) {
    String text = element_Customer_Country.getText()

    println('Element Text: ' + text)

    if (text.equals('Afghanistan')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element_Customer_Country))

        break
    }
}

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/a_Save Customer'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/NewCustomerCreate_button'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Customer_Creation Page/NewCustomerCreate_button'))

Customer_Name = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Customer/Page_Zuper Pro - Cutomer_Detail Page/CustomerName_verification'))

assert ((random_customer_name + ' ') + 'Test') == Customer_Name : ' wrong customer page  !'

//Job craetion 
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

List<WebElement> elements_Job_categorys = driver.findElements(By.xpath('//span[@class=\'mat-option-text\']'))

for (WebElement element_Job_category : elements_Job_categorys) {
    String text = element_Job_category.getText()

    println('Element Text: ' + text)

    if (text.equals('Validation Category')) {
        WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element_Job_category))

        break
    }
}

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Add Organization'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), random_Org_Name)

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Selecct_circle'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Choose_Organization_Jobpage'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Add Customer'))

WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), random_customer_name)

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Selecct_circle'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Choose_Customer'))

//WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Add Property'))
//
//WebUI.setText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Search_Customer'), random_Property_name)
//
//actions.sendKeys(Keys.ENTER).perform()
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Selecct_circle'))
//
//WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Choose_Property_Jobpage'))
WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/input_Due Date'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/Current_date'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/sameAsServiceAddress'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/sameAsServiceAddress'))

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/a_Create Job'))

WebUI.waitForElementClickable(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/NewJobCreate_button'), 
    3)

WebUI.click(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Job_Creation Page/NewJobCreate_button'))

WebUI.verifyElementPresent(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Detail Page/JobTitle'), 1)

Jobtitle = WebUI.getText(findTestObject('Zuper/Page_Zuper Pro - Job/Page_Zuper Pro - Jobs_Detail Page/JobTitle'))

assert Jobtitle == 'Validation Job' : ' wrong Job page  !'

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

