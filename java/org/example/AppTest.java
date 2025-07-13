package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private AndroidDriver driver;

    @BeforeSuite
    public void setUp() {
        File path = new File("src/test/java/resources");
        File apk = new File(path,"General-Store.apk");
        Capabilities options = new BaseOptions()
                .amend("appium:platformName", "android")
                .amend("appium:automationName", "UIAutomator2")
                .amend("appium:deviceName", "Pixel4")
                .amend("appium:udid", "emulator-5554")
                .amend("appium:appPackage", "com.androidsample.generalstore")
                .amend("appium:appActivity", "com.androidsample.generalstore.SplashActivity")
                .amend("appium:app", "C:\\Users\\COMPUTER WORLD\\Downloads\\General-Store.apk")
                .amend("appium:app", apk.getAbsolutePath());
//                .amend("appium:newCommandTimeout", 3600)
//                .amend("appium:connectHardwareKeyboard", true);

        driver = new AndroidDriver(this.getUrl(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void sampleTest() throws InterruptedException {

      driver.findElement(By.xpath("//android.widget.Spinner[@resource-id=\"com.androidsample.generalstore:id/spinnerCountry\"]")).click();
      //driver.findElement(By.xpath("//android.widget.TextView[@text=\"Anguilla\"]")).click();

        WebElement country = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Bangladesh\"))"));
        country.click();

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("BD");
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(2000);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
        //driver.removeApp("com.androidsample.generalstore");
    }

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
