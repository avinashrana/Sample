package com.maven.sample;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Localization {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");

		
		HashMap<String, String> language = new HashMap<String, String>();
		language.put("en", "English");
		language.put("de", "German");
		language.put("es", "Spanish");
		
		HashMap<String, String> chromePrefs = new HashMap<String, String>();
		chromePrefs.put("intl.accept_languages", language.get("en"));
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		//driver.findElement(By.id(id))
	}

}
