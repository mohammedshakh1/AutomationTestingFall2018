package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.EbayFooterPage;
import page.objects.EbayHomePage;

public class EbayFooterPageTest extends EbayFooterPage {

    EbayFooterPage objOfEbayFooterPage = null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfEbayFooterPage = PageFactory.initElements(driver, EbayFooterPage.class);

    }

    @Test
    public void footerListCountTest(){
        int linkList = objOfEbayFooterPage.footerList();
        Assert.assertEquals(1,linkList);

    }

    @Test
    public void aboutEbayTest(){
        objOfEbayFooterPage.clickAboutEbay();
    }


}
