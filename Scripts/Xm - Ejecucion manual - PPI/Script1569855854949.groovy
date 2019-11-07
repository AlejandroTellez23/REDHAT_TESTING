import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://172.16.9.103:8080/xm-hgc/#!/login')

WebUI.maximizeWindow()

WebUI.setEncryptedText(findTestObject('Xm-Ejecucion manual - PPI/Login'), 'z3rxwIQP9Pk=')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Xm-Ejecucion manual - PPI/Contrasea'), 'yqP9U4JupnXswLtFatNBcg==')

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/Entrar - Iniciar seccin'))

WebUI.delay(4)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/Men - Entradas'))

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/Ejecucin - manual'))

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/Nombre de mediacin'))

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/a_INDICADORES'))

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/Botn buscar'))

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/Page_ HGC/Variable_PPI'))

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/button_Ejecutar'))

WebUI.delay(1)

WebUI.click(findTestObject('Xm-Ejecucion manual - PPI/Boton - run'))

WebUI.delay(5)

WebUI.closeBrowser()

