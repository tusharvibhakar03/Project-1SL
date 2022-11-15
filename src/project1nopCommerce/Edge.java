package project1nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

    public static void main(String[] args) {
        String baseUrl= "https://demo.nopcommerce.com/login?returnUrl=%2F%22";
        System.setProperty("webdriver.edge.driver","Driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);
        // Launch the URL

// Get the title of the page.

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



    }}
