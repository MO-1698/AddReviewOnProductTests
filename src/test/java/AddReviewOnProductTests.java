import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.AddReviewOnProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddReviewOnProductTests {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate user review")
    private void validateReview(){
        new AddReviewOnProductPage(driver).navigateToURL("https://automationexercise.com/")
                .clickOnProductButton().ValidateAllProduct().clickOnViewProduct().ValidateWriteYourReviewButton()
                .fillName("Mohamed").fillEmail("Mohamed@gmail").fillReview("Tarsh").clickOnSubmitButton()
                .ValidateVerifySucessMessage();
    }
}

