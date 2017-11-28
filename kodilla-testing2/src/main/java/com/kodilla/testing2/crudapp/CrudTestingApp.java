package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudTestingApp {
    public static final String XPATH_INPUT = "//html/body/main/section/form/fieldset/input";
    public static final String XPATH_TEXTAREA = "//html/body/main/section/form/fieldset[2]/textarea";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT = "//div[contains(@class, \"tasks-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://karololejarz.github.io/github.io");

        WebElement input = driver.findElement(By.xpath(XPATH_INPUT));
        input.sendKeys("New robotic task");

        WebElement textarea = driver.findElement(By.xpath(XPATH_TEXTAREA));
        textarea.sendKeys("The robotic content");

        //Loop executing until element is displayed, without it select is faster than element
        while(!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);
    }
}