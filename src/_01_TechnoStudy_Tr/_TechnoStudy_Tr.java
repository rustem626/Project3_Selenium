package _01_TechnoStudy_Tr;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class _TechnoStudy_Tr extends BaseDriver {

    @Test
    public void AnasayfaKursDropdownMenuGoruntuleme_01()
    {
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

    @Test
    public void AnasayfaCampusGiris_02 ()
    {
        WebElement campusLogin = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']/a[@class='t-btn t-btn_md ']"));
        Assert.assertTrue(campusLogin.isDisplayed(), "Login butonu gözükmüyor");

        MyFunc.Bekle(2);
        campusLogin.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://campus.techno.study/"));

    }

    @Test
    public void AnasayfaKursBasvurusu_03 ()
    {

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

    @Test
    public void AltMenuKurErisim_04 ()
    {
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
    public void TsLogoAnaSayfaYonlendirme_06 () throws IOException {
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

    @Test
    public void KursDetayliBilgi_07 ()
    {
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



    }

}
