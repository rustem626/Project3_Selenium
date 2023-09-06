package YasinKaya;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _01_AltMenudenKurlaraErisim extends BaseDriver {

    @Test
    public void AltMenuErisim(){

        driver.get("https://techno.study/tr/");

        WebElement sdet=driver.findElement(By.linkText("SDET Yazılım Test Mühendisi"));
        sdet.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));

        driver.navigate().back();

        WebElement androidApp=driver.findElement(By.linkText("Android Uygulama Geliştirme"));
        androidApp.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));

        driver.navigate().back();

        WebElement veriBilimi=driver.findElement(By.linkText("Veri bilimi"));
        veriBilimi.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("data"));

        driver.navigate().back();

        WebElement masters=driver.findElement(By.linkText("Master's Program"));
        masters.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("masters"));

        driver.navigate().back();




    }


}
