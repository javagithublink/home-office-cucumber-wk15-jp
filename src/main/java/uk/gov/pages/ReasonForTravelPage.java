package uk.gov.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

import java.util.List;

public class ReasonForTravelPage extends Utility {
   @CacheLookup
   @FindBy (xpath = "//div[@class='govuk-radios']//label")
   List<WebElement> reasonForVisitList;


    @CacheLookup
    @FindBy (xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement nextStepButton;


    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectReasonForVisit(String reason){

               for(WebElement reason1 : reasonForVisitList){
            if(reason1.getText().equalsIgnoreCase(reason)){
               pmwaitWithThreadSleep(10);
                reason1.click();
                break;
            }
        }


        }


            public void clickNextButton(){

            pmClickOnElement(nextStepButton);
        }
}
