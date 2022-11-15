package project1nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F/";
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
// Launch the URL

// Get the title of the page.UR

        System.out.println("Page title is"+ driver.getTitle());

        // Get Current URL

       System.out.println("Current URl"+driver.getCurrentUrl());

        // Get page source

       System.out.println("page source"+driver.getPageSource());

        // Find the email field element and send email
        WebElement emailField=driver.findElement(By.id("Email"));
         emailField.sendKeys("test123@gmail.com");

        // Find the password field

           WebElement passwordField=driver.findElement(By.id("Password"));
           passwordField.sendKeys("123pass");

       driver.quit();



    }

}
