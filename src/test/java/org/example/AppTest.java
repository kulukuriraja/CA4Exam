package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class AppTest {


    ChromeDriver driver;

    @BeforeClass
    void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(10000);

        driver.manage().window().maximize();
    }

    @Test
    void JavascriptAlerts() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]/option[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]/option[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]")).click();
        Thread.sleep(2000);



    }
}

