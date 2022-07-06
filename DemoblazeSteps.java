package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.DemoBlazePage;


public class DemoblazeSteps {

    public WebDriver driver;
    public DemoBlazePage dbpage;

    @Given("a user is on the demo blaze website")
    public void a_user_is_on_the_demo_blaze_website() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        dbpage = new DemoBlazePage(driver);
        //Thread.sleep(3000);
        dbpage.getURLForDemo();

    }
    @When("a user clicks on login button link text")
    public void a_user_clicks_on_login_button_link_text() {
        dbpage.click_on_login_button_link_text();

    }
    @When("a user enters username as {string} and password as {string}")
    public void a_user_enters_username_as_admin_and_password_as(String  userN, String pWord) {
        dbpage.enter_username(userN);
        dbpage.enter_password(pWord);
    }
    @And("a user clicks on login button")
    public void a_user_clicks_on_login_button() throws InterruptedException {
       dbpage.click_login_button();
       Thread.sleep(300);
    }
    @When("a user selects Samsung galaxy s6")
    public void a_user_selects_samsung_galaxy_s6() throws InterruptedException {
        dbpage.select_item();
    }
    @When("a user clicks on Add to cart button")
    public void a_user_clicks_on_add_to_cart_button() throws InterruptedException {
        dbpage.add_item_to_cart();
        driver.switchTo().alert().accept();
    }
    @And("a user clicks on Cart button")
    public void a_user_clicks_on_cart_button() throws InterruptedException {
        dbpage.cart_tab();
    }
    @When("a user clicks on Place Order button")
    public void a_user_clicks_on_place_order_button() throws InterruptedException {
        dbpage.place_order_button();
    }
    @When("a user enters name as {string}")
    public void a_user_enters_name_as(String name) {
        dbpage.enter_name(name);
    }
    @And("a user enters country as {string}")
    public void a_user_enters_country_as(String country) {
        dbpage.enter_country(country);
    }
    @And("a user enters my city as {string}")
    public void a_user_enters_my_city_as(String citi ) {
        dbpage.enter_city(citi);
    }
    @And("a user enters credit card as {string}")
    public void a_user_enters_credit_card_as(String cCard) {
        dbpage.enter_credit_card(cCard);
    }
    @And("a user enters month as {string}")
    public void a_user_enters_month_as(String month) {
        dbpage.enter_month(month);
    }
    @And("a user enters year as {string}")
    public void a_user_enters_year_as(String year) {
        dbpage.enter_year(year);
    }
    @And("a user clicks on purchase button")
    public void a_user_clicks_on_purchase_button() {
        dbpage.click_purchase_button();
    }
    @Then("a user should see get the purchase id")
    public void a_user_should_see_get_the_purchase_id() {
        dbpage.extract_item_id();
    }
}
