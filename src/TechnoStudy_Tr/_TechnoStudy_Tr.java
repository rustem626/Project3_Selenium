package TechnoStudy_Tr;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class _TechnoStudy_Tr extends BaseDriver {

    @Test
    public void AnasayfaKursDropdownMenuGoruntuleme_01()
    {


    }

    @Test
    public void AnasayfaCampusGiris_02 ()
    {

    }

    @Test
    public void AnasayfaKursBasvurusu_03 ()
    {

    }

    @Test
    public void AltMenuKurErisim_04 ()
    {

    }

    @Test
    public void AltMenuSosyalMedyaErisim_05 ()
    {
        driver.get("https://techno.study/tr/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Bekle(2);

        String anaSayfaID = driver.getWindowHandle();


        List<WebElement> sayfaLink= driver.findElements(By.cssSelector("a[target='_blank']"));


        for (WebElement e : sayfaLink) {
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> acilanWindowIDler = driver.getWindowHandles();

        for (String id : acilanWindowIDler) {
            MyFunc.Bekle(2);
            driver.switchTo().window(id);
            System.out.println("Sayda Adı=" + driver.getTitle() + ", link=" + driver.getCurrentUrl());
        }

        MyFunc.Bekle(2);
        for (String id : acilanWindowIDler) {
            if (id.equals(anaSayfaID)) continue;
            driver.switchTo().window(id);
            driver.close();
        }
        MyFunc.Bekle(2);
    }


    @Test
    public void TsLogoAnaSayfaYonlendirme_06 ()
    {

    }

    @Test
    public void KursDetayliBilgi_07 ()
    {

    }

    @Test
    public void KullanimSartlariSayfaErisim_08 ()
    {

    }

}
