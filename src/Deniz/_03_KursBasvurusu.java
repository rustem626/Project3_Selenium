package Deniz;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_KursBasvurusu extends BaseDriver {

    @Test
    public void KursBasvuruFormu(){

        WebElement basvurBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='t396']//a[@class='tn-atom js-click-zero-stat']")));
        //WebElement basvurBtn = driver.findElement(By.xpath("//div[@class='t396']//a[@class='tn-atom js-click-zero-stat']"));
        Assert.assertTrue(basvurBtn.isDisplayed(), "Başvur butonu görünür değil.");

        MyFunc.Bekle(1);
        basvurBtn.click();

        WebElement bizeUlasin = driver.findElement(By.xpath("//strong[text()='Bize ulaşın!']"));
        Assert.assertTrue(bizeUlasin.isDisplayed(), "Bize Ulaşın formu görünür değil");

        MyFunc.Bekle(1);
        WebElement adSoyad = driver.findElement(By.xpath("//input[@aria-label='name']"));
        adSoyad.sendKeys("Test Deniz Özdem");

        MyFunc.Bekle(1);
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("test_do@gmail.com");

        MyFunc.Bekle(2);
        WebElement ulkeKodu = driver.findElement(By.xpath("//div[@class='t-input-phonemask__select']/span[1]"));
        ulkeKodu.click();

        MyFunc.Bekle(2);
        WebElement ulkeKoduAndorra = driver.findElement(By.xpath("//div[@id='t-phonemask_ad']"));
        ulkeKoduAndorra.click();

        MyFunc.Bekle(1);
        WebElement telNo = driver.findElement(By.xpath("//input[@type='tel']"));
        telNo.sendKeys("999999");

        MyFunc.Bekle(1);
        WebElement ulke = driver.findElement(By.xpath("//select[@name='country']"));
        MyFunc.Bekle(1);
        Select ddUlke = new Select(ulke);
        ddUlke.selectByValue("Andorra");

        MyFunc.Bekle(1);
        WebElement kurs = driver.findElement(By.xpath("//select[@name='course']"));
        MyFunc.Bekle(1);
        Select ddKurs = new Select(kurs);
        ddKurs.selectByValue("SDET Türkçe");

        MyFunc.Bekle(1);
        WebElement anket = driver.findElement(By.xpath("//select[@name='survey']"));
        MyFunc.Bekle(1);
        Select ddAnket = new Select(anket);
        ddAnket.selectByValue("Youtube");

        MyFunc.Bekle(1);
        WebElement sartlar = driver.findElement(By.xpath("//div[@class='t-checkbox__indicator']"));
        sartlar.click();

        MyFunc.Bekle(1);
        WebElement gonderBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        gonderBtn.click();

        //MyFunc.Bekle(15);
        WebElement onayMsg=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tildaformsuccesspopuptext\"]/p[1]/span")));
        //WebElement onayMsg = driver.findElement(By.xpath("//*[ contains( text(), 'Başvurunuz alınmıştır' )]"));
        //System.out.println(onayMsg.getText());
        Assert.assertTrue(onayMsg.isDisplayed(), "Onay mesajı görünmedi.");

    }
}
