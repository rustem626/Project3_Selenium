package Korhan;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnasayfaCampusGiris extends BaseDriver {

    @Test
    public void AnasayfaCampusGiris_02() {
        WebElement campusLogin = driver.findElement(By.xpath("//div[@class='t228__right_buttons_but']/a[@class='t-btn t-btn_md ']"));
        Assert.assertTrue(campusLogin.isDisplayed(), "Login butonu gözükmüyor");

        MyFunc.Bekle(2);
        campusLogin.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://campus.techno.study/"));
    }
}