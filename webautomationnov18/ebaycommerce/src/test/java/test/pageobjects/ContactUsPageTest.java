package test.pageobjects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ContactUsPage;
import page.objects.HomePage;

public class ContactUsPageTest extends BrowserDriver {

    ContactUsPage objContactUsPage = null;
    HomePage objOfHomePage =null;
    @BeforeMethod
    public void initializationOfElements() {

        objContactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void contactUsTest(){

        objOfHomePage.clickContactUs();
        String actualText = objContactUsPage.contactUs();
        Assert.assertEquals(actualText, "CUSTOMER SERVICE - CONTACT US");
        System.out.println("Contact Us Test Passed");

    }

}
