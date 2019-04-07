package com.cg.test;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mar2ClassPrac {

	//public static void main(String[] args)
	@Test
	public void Google() throws InterruptedException
	{

			// TODO Auto-generated constructor stub
			System.setProperty("webdriver.chrome.driver", "C:\\Paresh\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.co.in");
			WebElement wE= driver.findElement(By.name("q"));
			//WebElement wE= driver.findElement(By.id("lst-ib"));
			wE.sendKeys("selenium");
			
			
			WebElement ls = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.UUbT9 > div.aajZCb > ul > li:nth-child(1) > div > div.sbtc > div > span"));
			driver.wait(4000);
			ls.click();
			//Iterator<String> ite=ls.iterator();
			/*while(ite.hasNext())
			{
				ite.next();
				ite.
			}*/
			//ls.iterator();
			//wE.submit();
			
			WebElement wB= driver.findElement(By.name("btnk"));
			wB.click();
			driver.close();
			
//			Actions act=new Actions(driver);
//			act.
			

			
	}


}
