package org.mavenBaseClass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;
	public static JavascriptExecutor js;
	
	
	
	
	
	static public void openchrome() {		
    	WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
	}
	static public void openfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	static public void openEdge() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	
	static public void max() {
		driver.manage().window().maximize();
	}
	static public void min() {
		driver.manage().window().minimize();
	}
	static public void geturl(String url) {
		driver.get(url);
	}
	static public void getcurrenturl() {
		String txturl = driver.getCurrentUrl();
		System.out.println(txturl);
	}
	static public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	static public void Filltextbox(WebElement ele,String input) {
		ele.sendKeys(input);
	}
	static public void toclick(WebElement c) {
		c.click();
	}
	static public void gettext(WebElement text) {
		String text2 = text.getText();
		System.out.println(text2);
	}
	static public void gettagname(WebElement tagname) {
		tagname.getTagName();
	}
	static public void quit() {
		driver.quit();
	}
	static public void close() {
		driver.close();
	}
	static public void wight(int time) throws InterruptedException {
		Thread.sleep(time);

	}
	static public void movetoelement(WebElement move) {
		 a=new Actions (driver);
		a.moveToElement(move).click().perform();;
	}	
	static public void draganddrop(WebElement sou,WebElement tar) {
		a=new Actions(driver);
		a.dragAndDrop(sou, tar).perform();
	}
	static public void doubleclick(WebElement value) {
		a=new Actions(driver);
		a.doubleClick(value).perform();
	}
	static public void contextclick(WebElement value) {
		a=new Actions(driver);
		a.contextClick(value).perform();
	}
	static public void robotcopy() throws AWTException {
	    r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	static public void robotpast() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	static public void robottab() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	static public void robotup() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	static public void robotdown() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	static public String getAttribute(WebElement ele) {
		String att = ele.getAttribute("value");
		return att;
		
		

	}
	
	
	
	
	
	
	static public void robotenter() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	static public void robotsellectall() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}
	static public void alertaccept() {
		driver.switchTo().alert().accept();
	}
	static public void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}
	static public void alertsentkey(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	static public void alerttext() {
		driver.switchTo().alert().getText();
	}
	static public void selectvisibletext(WebElement element,String text) {
		s= new Select(element);
		s.selectByVisibleText(text);
	}
	static public void selectByValue(WebElement element,String value) {
		s=new Select(element);
		s.selectByValue(value);
	}
	static public void selectByIndex(WebElement element, int index) {
		s=new Select(element);
		s.selectByIndex(index);
	}
	static public void selectall(WebElement element) {
		s=new Select(element);
		s.deselectAll();
	}
	static public void deselectall(WebElement element) {
		s=new Select(element);
		s.deselectAll();
	}
	static public void deselectvisibletext(WebElement element,String text) {
		s=new Select(element);
		s.deselectByVisibleText(text);
	}
	static public void deselectvalue(WebElement element,String value) {
		s=new Select(element);
		s.deselectByValue(value);
	}
	static public void deselectindex(WebElement element,int index) {
		s=new Select(element);
		s.deselectByIndex(index);
	}
	static public void selectgetoptions(WebElement element) {
		s=new Select(element);
		s.getOptions();
	}
	static public void selectgetalloptions(WebElement element) {
		s=new Select(element);
		s.getAllSelectedOptions();
	}
	static public void selectgetfirstselectoptions(WebElement element) {
		s=new Select(element);
		s.getFirstSelectedOption();
	
	}
	static public Object javascriptExecutorgetvalue(WebElement element ) {
		js=(JavascriptExecutor)driver;
		Object tt = js.executeScript("return arguments[0].getAttribute('value')",element);
		return tt;
		
	}
	static public void javascriptExecutorScrolDown(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	static public void javascriptExecutorScrollUp(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	static public void javascriptExecutorToClick(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	static public void takeScreenShort() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File de=new File("C:\\Users\\haris\\eclipse-workspace\\BaseClass\\ScreenShort\\hotel.img");
		FileUtils.copyFile(sr, de);
	}
	 public static String readData(String sheet, int rowno,int cellno ) throws IOException {
		File f= new File("C:\\Users\\haris\\eclipse-workspace\\BaseClass\\Exceldata\\Hotel.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook bk =new XSSFWorkbook(fis);
		
		Sheet sh = bk.getSheet(sheet);
		
		Row r = sh.getRow(rowno);
		
		Cell c = r.getCell(cellno);
		
		int type  = c.getCellType();
		
		String data="";
		if (type == 1 ) {
			
			 data = c.getStringCellValue();		
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MMM-dd-yyyy");
			 data = sim.format(da);		
		}
		
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			data = String.valueOf(l);
		}
		return data;

	}
	 public static void rightdata( int rowno,int cellno, String value) throws IOException {
		File f=new File("C:\\Users\\haris\\eclipse-workspace\\BaseClass\\Exceldata\\Hotel.xlsx");
		FileInputStream bk = new FileInputStream(f);
	
		Workbook bk2= new XSSFWorkbook(bk);
		
	   Sheet sheet2 = bk2.getSheet("Hotel");
	   Row r1 = sheet2.getRow(rowno);
		
		Cell c9 = r1.getCell(cellno);
		
		String input = c9.getStringCellValue();
		
		c9.setCellValue(value);
		
		
		FileOutputStream fout=new FileOutputStream(f);
		bk2.write(fout);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
