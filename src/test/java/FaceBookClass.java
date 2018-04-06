import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FaceBookClass {

    private WebDriver browser;

    @BeforeClass
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Yana\\QA\\Проэкты\\chromedriver_win32");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }


    @Test
    public void testSearch(){
        browser.get("https://www.facebook.com/");
       // browser.findElement(By.id("id= email")).click();
       // browser.findElement(By.id("id= email")).sendKeys(" ");

       // browser.findElement(By.id("mat-input-0")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

        //browser.findElement(By.id("mat-input-0")).sendKeys("Kherson");
       // WebElement toInput = browser.findElement(By.cssSelector(".mat-input-element.mat-form-field-autofill-control.ng-tns-c5-1.ng-untouched.ng-pristine.ng-valid"));
       // toInput.sendKeys("Kиїв");
      //  Thread.sleep(1000);
       // toInput.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }



}
