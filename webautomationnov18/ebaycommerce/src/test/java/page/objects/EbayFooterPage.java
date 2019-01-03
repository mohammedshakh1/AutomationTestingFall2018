package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class EbayFooterPage extends BrowserDriver {

    @FindBy(how = How.ID, using = "glbfooter")
    public List <WebElement> ebayFooterList;

    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[1]/h3/a")
    private WebElement aboutEbay;

    public int footerList(){

        int listCount = ebayFooterList.size();
        return listCount;

    }

    public void clickAboutEbay(){
        aboutEbay.isDisplayed();
    }



}
