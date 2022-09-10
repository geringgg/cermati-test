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

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/h1_Daftar Akun'), 
    30)

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Email'), 
    'geringgg@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_No. Handphone_mobilePhone'), 
    '081245678910')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Kata Sandi_password'), 
    'H1ZwjeOaiJdNcCivmWMWBw==')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_Daftar'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Ulangi Kata Sandi_confirmPassword'), 
    30)

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Ulangi Kata Sandi_confirmPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Ulangi Kata Sandi_confirmPassword'), 
    'H1ZwjeOaiJdNcCivmWMWBw==')

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Depan_firstName'))

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Depan_firstName'), 
    'Gerhat')

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Belakang_lastName'))

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Belakang_lastName'), 
    'Ringo')

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'))

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'), 
    'Kota Jakarta timur')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuransi  Tabungan Online Terbaik/svg_KabupatenKota_svg-inline--fa fa-search fa-w-16'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_Daftar'), 30)

WebUI.click(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/button_Daftar'))

WebUI.waitForElementPresent(findTestObject(null), 0)

