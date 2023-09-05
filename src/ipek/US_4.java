package ipek;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_4 extends BaseDriver {
    @Test
    public void AnasayfaKursDropdownMenuGoruntuleme_01(){
        Actions aksiyonlar=new Actions(driver);
        driver.navigate().to("https://techno.study/tr/");

        WebElement kurslar = driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        aksiyonlar.moveToElement(kurslar).build().perform();
        MyFunc.Bekle(3);

        List<WebElement> list=driver.findElements(By.xpath("//div[@class='t966__menu-item-title t-name']"));
        for(WebElement e: list){
            if(e.getText().contains("Yazılım Test Mühendisi"))
                System.out.println(e.getText());
            else if (e.getText().contains("Android uygulama geliştirme"))
                System.out.println(e.getText());
            else if (e.getText().contains("Veri bilimi"))
                System.out.println(e.getText());
            else if (e.getText().contains("Job Center & Arbeitsamt"))
                System.out.println(e.getText());
            else if (e.getText().contains("Master's Program"))
                System.out.println(e.getText());
        }

        MyFunc.Bekle(3);
        WebElement sdet = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[1]"));
        sdet.click();
        MyFunc.Bekle(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));

        WebElement kurslar2 = driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        aksiyonlar.moveToElement(kurslar2).build().perform();
        MyFunc.Bekle(2);
        WebElement android = driver.findElement(By.xpath("//div[@class='t966__menu-item-title t-name' and text()='Android uygulama geliştirme']"));
        android.click();
        MyFunc.Bekle(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));

        WebElement kurslar3 = driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        aksiyonlar.moveToElement(kurslar3).build().perform();
        MyFunc.Bekle(2);
        WebElement veri = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[3]"));
        veri.click();
        MyFunc.Bekle(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("data"));

        WebElement kurslar4 = driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        aksiyonlar.moveToElement(kurslar4).build().perform();
        MyFunc.Bekle(2);
        WebElement jobCenter = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[4]"));
        jobCenter.click();
        MyFunc.Bekle(2);
        driver.navigate().to("https://techno.study/tr/");

        WebElement kurslar5 = driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        aksiyonlar.moveToElement(kurslar5).build().perform();
        MyFunc.Bekle(2);
        WebElement master = driver.findElement(By.xpath("(//div[@class='t966__menu-item-title t-name'])[5]"));
        master.click();
        MyFunc.Bekle(2);
        driver.navigate().to("https://techno.study/tr/");

    }
}
