package Korhan;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KullanimSartlariSayfaErisim extends BaseDriver {
    @Test
    public void KullanimSartlariSayfaErisim_08 ()
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;


      // WebElement bizeUlas= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
       WebElement bizeUlas= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Bize ulaşın!']")));
        js.executeScript("arguments[0].scrollIntoView(true);", bizeUlas);
        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement sartlar=driver.findElement(By.xpath("//*[@class='t-checkbox__labeltext']//*[text()='Şartları']"));
        Assert.assertTrue(sartlar.isDisplayed(),"Şartları okudum anladım görünür değil");
        sartlar.click();

        Assert.assertFalse(driver.getPageSource().contains("Kullanım Şartları"), "Sayfa değişmedi");
        //sayfanın değişmediğini veya beklenen metni içermediğini kontrol ettim
        // Eğer sayfa değişmemişse veya beklenen metin sayfada bulunmuyorsa,
        // assert başarısız olur ve bir hata mesajı görüntülenir. Bu şekilde,
        // sayfanın değişmediğini doğrulayabilirsiniz.
        // Eğer sayfanın değişmesi gerekiyorsa ve bu beklenmiyorsa, assert başarılı olur.



    }
}
