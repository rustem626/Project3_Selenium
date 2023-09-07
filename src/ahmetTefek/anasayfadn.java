package ahmetTefek;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class anasayfadn extends BaseDriver {

    @Test
    public void anasayfalogogirme() throws IOException, AWTException {
        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(2);

        WebElement coursesMenu1= driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        coursesMenu1.click();
        MyFunc.Bekle(1);
        WebElement sdet= driver.findElement(By.xpath("//*[@field='li_title__1607692272826']"));
        sdet.click();
        MyFunc.Bekle(1);
        WebElement logoButton1= driver.findElement(By.cssSelector("a[class='t228__imgwrapper']>:nth-child(1)"));
        logoButton1.click();
        MyFunc.Bekle(1);
        TakesScreenshot ts=(TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
        File hafidakiHali=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(hafidakiHali, new File("ekranGoruntuleri\\screenshot.png"));
        MyFunc.Bekle(1);

        WebElement trUrl1= driver.findElement(By.cssSelector("div[class='t228__right_langs_lang']+div>:nth-child(1)"));
        trUrl1.click();
        MyFunc.Bekle(1);
        WebElement coursesMenu2= driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        coursesMenu2.click();
        MyFunc.Bekle(2);
        WebElement android= driver.findElement(By.xpath("//*[@field='li_title__1607692276801']"));
        android.click();
        MyFunc.Bekle(1);
        WebElement logoButton2= driver.findElement(By.cssSelector("a[class='t228__imgwrapper']>:nth-child(1)"));
        logoButton2.click();
        MyFunc.Bekle(1);

        WebElement trUrl2= driver.findElement(By.cssSelector("div[class='t228__right_langs_lang']+div>:nth-child(1)"));
        trUrl2.click();
        MyFunc.Bekle(1);
        WebElement coursesMenu3= driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        coursesMenu3.click();
        MyFunc.Bekle(1);
        WebElement veriTabani= driver.findElement(By.xpath("//*[@field='li_title__1607692281884']"));
        veriTabani.click();
        MyFunc.Bekle(1);
        WebElement logoButton3= driver.findElement(By.cssSelector("a[class='t228__imgwrapper']>:nth-child(1)"));
        logoButton3.click();
        MyFunc.Bekle(1);

        WebElement trUrl3= driver.findElement(By.cssSelector("div[class='t228__right_langs_lang']+div>:nth-child(1)"));
        trUrl3.click();
        WebElement coursesMenu4= driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        coursesMenu4.click();
        MyFunc.Bekle(1);
        WebElement jobCenter= driver.findElement(By.xpath("//*[@field='li_title__1688578135931']"));
        MyFunc.Bekle(1);
        WebElement logoButton4= driver.findElement(By.cssSelector("a[class='t228__imgwrapper']>:nth-child(1)"));
        logoButton4.click();
        MyFunc.Bekle(1);
        WebElement trUrl4= driver.findElement(By.cssSelector("div[class='t228__right_langs_lang']+div>:nth-child(1)"));
        trUrl4.click();
        MyFunc.Bekle(1);
        WebElement coursesMenu5= driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        coursesMenu5.click();
        WebElement master= driver.findElement(By.xpath("//*[@field='li_title__1663426353172']"));
        MyFunc.Bekle(1);
        WebElement trUrl5= driver.findElement(By.cssSelector("div[class='t228__right_langs_lang']+div>:nth-child(1)"));
        trUrl5.click();
        MyFunc.Bekle(1);

    }
}
