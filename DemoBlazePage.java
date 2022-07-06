package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DemoBlazePage {

    public WebDriver adriver;

    public DemoBlazePage(WebDriver mdriver){
        adriver = mdriver;
        PageFactory.initElements(mdriver, this);
    }
    //These are all the elements for this project
    @FindBy(xpath = "//a[contains(text(), \"Log in\")]")
    WebElement login_tab;

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(), \"Log in\")]")
    WebElement login_button;

    @FindBy(xpath = "//a[contains(text(), \"Samsung galaxy s6\")]")
    WebElement item;

    @FindBy(xpath = "//a[contains(text(), \"Add to cart\")]")
    WebElement add_to_cart;

    @FindBy(xpath = "//a[@href='cart.html']")
    WebElement cart_tab;

    @FindBy(xpath = "//button[contains(text(), \"Place Order\")]")
    WebElement place_order_button;

    @FindBy(id ="name")
    WebElement name;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "card")
    WebElement credit_card;

    @FindBy(id = "month")
    WebElement month;

    @FindBy(id = "year")
    WebElement year;

    @FindBy(xpath = "//button[contains(text(), \"Purchase\")]")
    WebElement purchase_button;

    @FindBy(xpath = "//p[@style=\"display: block;\"]")
    WebElement item_id;


    // These are all the methods for clicks, set text and clear text
    public void getURLForDemo(){
        String dburl = "https://www.demoblaze.com/";
        adriver.get(dburl);
        adriver.manage().window().maximize();
    }

    public void click_on_login_button_link_text(){
        login_tab.click();

    }
    public void enter_username(String username_text){
        username.clear();
        username.sendKeys(username_text);
    }
    public void enter_password(String password_text){
        password.clear();
        password.sendKeys(password_text);
    }
    public void click_login_button() throws InterruptedException {
        login_button.click();
        Thread.sleep(3000);
    }
    public void select_item() throws InterruptedException {
        item.click();
        Thread.sleep(5000);
    }
    public void add_item_to_cart() throws InterruptedException {
        add_to_cart.click();
        Thread.sleep(5000);

    }

    public void cart_tab() throws InterruptedException {
        cart_tab.click();
        Thread.sleep(5000);
    }
    public void place_order_button() throws InterruptedException {
        place_order_button.click();
        Thread.sleep(5000);
    }
    public void enter_name(String name_text){
        name.clear();
        name.sendKeys(name_text);
    }
    public void enter_country(String country_text){
        country.clear();
        country.sendKeys(country_text);
    }
    public void enter_city(String city_text){
        city.clear();
        city.sendKeys(city_text);
    }
    public void enter_credit_card(String credit_card_text){
        credit_card.clear();
        credit_card.sendKeys(credit_card_text);
    }
    public void enter_month(String month_text){
        month.clear();
        month.sendKeys(month_text);
    }
    public void enter_year(String year_text){
        year.clear();
        year.sendKeys(year_text);
    }
    public void click_purchase_button(){
        purchase_button.click();
    }
    public void extract_item_id(){
        String actual_id = item_id.getText();
        actual_id = actual_id.substring(0,10);
        System.out.println(actual_id);
        adriver.close();
    }
}

