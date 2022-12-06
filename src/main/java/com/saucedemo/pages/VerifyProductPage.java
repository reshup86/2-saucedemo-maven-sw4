package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VerifyProductPage extends Utility {
    By textMessage = By.xpath("//div/span[text()='Products']");
    By errorProductNumber = By.className("inventory_item");


    public String getTextMessage(){
        return getTextFromElement(textMessage);
    }
    public int getProductsError(){
        List<WebElement> list = driver.findElements(errorProductNumber);
        int actualNumber = list.size();
        return actualNumber;
    }

}
