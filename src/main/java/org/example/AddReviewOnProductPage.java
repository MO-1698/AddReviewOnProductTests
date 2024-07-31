package org.example;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class AddReviewOnProductPage {

    private SHAFT.GUI.WebDriver driver ;

    //Constructor
    public AddReviewOnProductPage(SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }
    //Locators
    private By productButton = By.xpath("//a[@href=\"/products\"]");
    private By allProduct = By.xpath("//h2[@class=\"title text-center\"]");
    private By viewProduct = By.xpath("//a[@href=\"/product_details/1\"]");
    private By writeYourReview = By.xpath("//a[@href=\"#reviews\"]");
    private By nameTextField = By.xpath("//input[@type=\"text\"]");
    private By emailAdress = By.xpath("//input[@placeholder=\"Email Address\"]");
    private By addReviewHere = By.xpath("//textarea[@placeholder=\"Add Review Here!\"]");
    private By submitButton = By.xpath("//button[@id=\"button-review\"]");
    private By verifySucessMessage = By.xpath("//div[@class=\"form-row hide\"]");

    //Actions
    public AddReviewOnProductPage navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this ;
    }

    public AddReviewOnProductPage clickOnProductButton() {
        driver.element().click(productButton);
        return this;
    }




    public AddReviewOnProductPage clickOnViewProduct() {
        driver.element().click(viewProduct);
        return this;

    }

    public AddReviewOnProductPage fillName(String name){
        driver.element().type(nameTextField,name);
        return this ;

    }

    public AddReviewOnProductPage fillEmail(String email){
        driver.element().type(emailAdress,email);
        return this ;

    }



    public AddReviewOnProductPage fillReview(String review){
        driver.element().type(addReviewHere,review);
        return this ;

    }


    public AddReviewOnProductPage clickOnSubmitButton() {
        driver.element().click(submitButton);
        return this;

    }





    //Assertions
    @Step("Validate that the user is on product page")
    public AddReviewOnProductPage ValidateAllProduct(){
        driver.element().verifyThat(allProduct).text().isEqualTo("ALL PRODUCTS");
        return this;
    }


    //Assertions
    @Step("Validate that the user is on review page")
    public AddReviewOnProductPage ValidateWriteYourReviewButton() {
        driver.element().verifyThat(writeYourReview).text().isEqualTo("WRITE YOUR REVIEW");
        return this;

    }


    //Assertions
    @Step("Validate that the user receive Thank you for your review")
    public void ValidateVerifySucessMessage() {
        driver.element().verifyThat(verifySucessMessage).text().contains("Thank you for your review.");
    }

}
