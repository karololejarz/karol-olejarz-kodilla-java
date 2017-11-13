package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public static final String XPATH_FIRSTNAME = "//*[@name=\"firstname\"]";
    public static final String XPATH_LASTNAME = "//*[@name=\"lastname\"]";
    public static final String XPATH_CONTACT = "//*[@name=\"reg_email__\"]";
    public static final String XPATH_REPEAT_CONTACT = "//*[@name=\"reg_email_confirmation__\"]";
    public static final String XPATH_PASSWORD = "//*[@name=\"reg_passwd__\"]";
    public static final String XPATH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR = "//*[@id=\"year\"]";
    public static final String XPATH_GENDER = "//*[@id=\"u_0_4\"]";

    public static void main(String[] args) throws org.openqa.selenium.ElementNotVisibleException{
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstName = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstName.sendKeys("Selenium");

        WebElement lastName = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastName.sendKeys("Test");

        WebElement contact = driver.findElement(By.xpath(XPATH_CONTACT));
        contact.sendKeys("selenium@test.com");

        WebElement repeatContact = driver.findElement(By.xpath(XPATH_REPEAT_CONTACT));
        repeatContact.sendKeys("selenium@test.com");

        WebElement password = driver.findElement(By.xpath(XPATH_PASSWORD));
        password.sendKeys("123456789");

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByValue("20");

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("6");

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1997");

        //this one likes not to show up on time, we need wait and throw the exception
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(XPATH_GENDER)));
        WebElement gender = driver.findElement(By.xpath(XPATH_GENDER));
        gender.click();
    }
}
