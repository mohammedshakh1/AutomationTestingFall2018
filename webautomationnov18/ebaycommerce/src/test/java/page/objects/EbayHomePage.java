package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class EbayHomePage extends BrowserDriver {

    @FindBy(how = How.ID, using = "gh-logo")
    private WebElement eBayLogoDisplay;


    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    private WebElement searchBox;

    @FindBy(how = How.ID, using = "gh-hsi")
    private WebElement endTheSeasonDeal;

    @FindBy(how = How.ID, using = "gh-p-1")
    private WebElement dailyDeals;





    public void searchBox (){
        searchBox.sendKeys("Iphone xs max case", Keys.ENTER);
        searchBox.click();

    }

    public boolean eBayLogoDisplay(){
        eBayLogoDisplay.isDisplayed();
        return true;
    }

    public String endTheSeasonDeal(){
        String seasonDealText = endTheSeasonDeal.getText();
        return seasonDealText;
    }

    public void clickEndTheSeasonDeal(){
        endTheSeasonDeal.click();
    }

    public void clickDailyDeals(){

        dailyDeals.click();
    }




}
