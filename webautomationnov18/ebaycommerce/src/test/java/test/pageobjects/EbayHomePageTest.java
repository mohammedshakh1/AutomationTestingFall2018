package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.EbayHomePage;

public class EbayHomePageTest extends EbayHomePage {

    EbayHomePage objOfEbayHomePage = null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfEbayHomePage = PageFactory.initElements(driver, EbayHomePage.class);

    }

    @Test
    public void searchBoxTest(){
        objOfEbayHomePage.searchBox();
        System.out.println("Search Box Test Passed");
    }

    @Test
    public void eBayLogoDisplayTest(){
        boolean eBayLogo = objOfEbayHomePage.eBayLogoDisplay();
        Assert.assertEquals(eBayLogo, true);
        System.out.println("Ebay Logo Test Passed");
    }

    //@Test
    //public void untilEndTheSeasonDeals(){
      //  String
    //}

    //@Test
    //public void dailyDeals(){
      //  String dealsText = objOfEbayHomePage.clickDailyDeals();
    //}







}
