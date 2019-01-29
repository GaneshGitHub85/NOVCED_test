package com.novced.testcases.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//*[contains(@id,'img_container')]/div[2]/table/tbody/tr[1]/td[5]/span"));
		//System.out.println(grColor);
		}finally {
		driver.quit();
		
	}
	}

}
