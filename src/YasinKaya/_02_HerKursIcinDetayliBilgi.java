package YasinKaya;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_HerKursIcinDetayliBilgi extends BaseDriver {
    @Test
    public void KursDetayBilgi(){
        driver.get("https://techno.study/tr/");

        List<WebElement> detaylibilgi=driver.findElements(By.linkText("Detaylı bilgi"));

        // detaylı bilgi butonları gözüküyormu
        for (WebElement d:detaylibilgi){
            Assert.assertTrue(d.isDisplayed());
        }

        //herkursta aynı olan TechnoStudy logosu
        WebElement technoStudy=driver.findElement(By.xpath("//img[@alt='TechnoStudy']"));
        Assert.assertTrue(technoStudy.isDisplayed());

        WebElement detay1=driver.findElement(By.xpath("(//a[@class='tn-atom'])[3]"));
        detay1.click();
       // Assert.assertTrue(technoStudy.isDisplayed());
        driver.navigate().back();

        WebElement detay2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='tn-atom'])[2]")));
        detay2.click();
       // Assert.assertTrue(technoStudy.isDisplayed());
        driver.navigate().back();


        WebElement detay3=driver.findElement(By.xpath("(//a[@class='tn-atom'])[1]"));
        detay3.click();
       // Assert.assertTrue(technoStudy.isDisplayed());
        driver.navigate().back();

        //



    }
}
