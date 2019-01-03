package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySignInPage extends BrowserDriver {

    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    private WebElement signIn;


    public void clickSignIn(){
        signIn.click();
    }




}
