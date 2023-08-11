package org.roomBooking;

import java.io.IOException;

import org.mavenBaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelRoomBooking extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		openchrome();
		max();
		geturl("http://adactinhotelapp.com/");
     
		WebElement e1 = driver.findElement(By.id("username"));
	    Filltextbox(e1, readData("Hotel", 1,4));
		WebElement e2 = driver.findElement(By.id("password"));
		Filltextbox(e2, readData("Hotel", 1,6));
		WebElement login = driver.findElement(By.name("login"));
		toclick(login);
		
		wight(2000);
		WebElement l = driver.findElement(By.id("location"));
		Filltextbox(l, readData("Hotel", 2, 2));
		
		WebElement H = driver.findElement(By.id("hotels"));
		Filltextbox(H,readData("Hotel", 3, 2) );
		
		WebElement R = driver.findElement(By.id("room_type"));
        Filltextbox(R, readData("Hotel", 4, 2));
		
        WebElement N = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Filltextbox(N, readData("Hotel", 5, 2));
		
		WebElement A = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Filltextbox(A, readData("Hotel", 6, 2));
		
		WebElement C = driver.findElement(By.xpath("//select[@id='child_room']"));
		Filltextbox(C, readData("Hotel", 7, 2));
		
		WebElement search= driver.findElement(By.xpath("//input[@id='Submit']"));
		movetoelement(search);
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		movetoelement(radio);
		
		WebElement search2 = driver.findElement(By.xpath("//input[@id='continue']"));
		movetoelement(search2);
		wight(3000);
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	    Filltextbox(Firstname, readData("Hotel", 8, 2));
	    
	    WebElement Lastname= driver.findElement(By.xpath("//input[@name='last_name']"));
	    Filltextbox(Lastname, readData("Hotel", 9, 2));
	    
	    WebElement BillAdd = driver.findElement(By.xpath("//textarea[@name='address']"));
	    Filltextbox(BillAdd, readData("Hotel", 10, 2));
	    
	    WebElement CardNo = driver.findElement(By.xpath("//input[@name='cc_num']"));
	    Filltextbox(CardNo, readData("Hotel", 11, 2));
	    
	    WebElement CardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		selectvisibletext(CardType, readData("Hotel", 12, 2));
		
		WebElement ExpiryDate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		selectvisibletext(ExpiryDate, readData("Hotel", 13, 2));
		
		WebElement Expiryyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		selectvisibletext(Expiryyear, readData("Hotel", 14, 2));
		
		WebElement name = driver.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
		Filltextbox(name, readData("Hotel", 15, 2));

		WebElement BookNow = driver.findElement(By.xpath("//input[@name='book_now']"));
		movetoelement(BookNow);
		
		wight(6000);
		
		  WebElement ele = driver.findElement(By.xpath("//input[@id='order_no']"));
		  String atte = getAttribute(ele);
		  rightdata(2, 9, atte);
		  

	}
}