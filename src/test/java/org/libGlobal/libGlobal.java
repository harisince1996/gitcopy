package org.libGlobal;

import java.io.IOException;

import org.mavenBaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class libGlobal extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		openchrome();
		max();
		
		geturl("http://adactinhotelapp.com/");
		
		WebElement e1 = driver.findElement(By.id("username"));
		Filltextbox(e1, "tigerhari1234");
		
		WebElement e2 = driver.findElement(By.id("password"));
		Filltextbox(e2, "Tigerkkk");
		
	    WebElement login = driver.findElement(By.name("login"));
		toclick(login);
		
		WebElement l = driver.findElement(By.id("location"));
		selectvisibletext(l, "London");
		
		WebElement H = driver.findElement(By.id("hotels"));
		selectvisibletext(H, "Hotel Hervey");
		
		WebElement R = driver.findElement(By.id("room_type"));
        selectvisibletext(R, "Super Deluxe");
		
        WebElement N = driver.findElement(By.xpath("//select[@id='room_nos']"));
		selectvisibletext(N, "6 - Six");
		
		WebElement A = driver.findElement(By.xpath("//select[@id='adult_room']"));
		selectvisibletext(A, "3 - Three");
		
		WebElement C = driver.findElement(By.xpath("//select[@id='child_room']"));
		selectvisibletext(C, "4 - Four");

		WebElement search= driver.findElement(By.xpath("//input[@id='Submit']"));
		movetoelement(search);
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		movetoelement(radio);
		
		WebElement search2 = driver.findElement(By.xpath("//input[@id='continue']"));
		movetoelement(search2);
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	    Filltextbox(Firstname, "HariharaSudhan");
	    
	    WebElement Lastname= driver.findElement(By.xpath("//input[@name='last_name']"));
	    Filltextbox(Lastname, "M");
	    
	    WebElement BillAdd = driver.findElement(By.xpath("//textarea[@name='address']"));
	    Filltextbox(BillAdd, "317,thiruvanmeyur,chennai");
	    
	    WebElement CardNo = driver.findElement(By.xpath("//input[@name='cc_num']"));
	    Filltextbox(CardNo, "1234657856897654");
	    
	    WebElement CardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		selectvisibletext(CardType, "VISA");
		
		WebElement ExpiryDate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		selectvisibletext(ExpiryDate, "November");
		
		WebElement Expiryyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		selectvisibletext(Expiryyear, "2029");
		
		WebElement name = driver.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
		Filltextbox(name, "8564");
		
		takeScreenShort();
		
		WebElement BookNow = driver.findElement(By.xpath("//input[@name='book_now']"));
		movetoelement(BookNow);
		
		wight(6000);
		
	    WebElement ele = driver.findElement(By.xpath("//input[@id='order_no']"));
		javascriptExecutorgetvalue(ele);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}