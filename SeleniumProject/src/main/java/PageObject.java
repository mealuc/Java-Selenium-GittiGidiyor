import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
   public static WebDriver myDriver;

    public PageObject (WebDriver driver) {
        this.myDriver = driver;
    }
    public void clear_cookie(){
        WebElement clear_cookie = myDriver.findElement(By.cssSelector("#__next > main > section > section > a"));
        clear_cookie.click();
    }
    public void main_page_login() throws InterruptedException{
        WebElement main_page_login = myDriver.findElement(By.xpath("//div[@data-cy='header-user-menu']"));
        main_page_login.click();
        Thread.sleep(1000);
    }
    public void main_page_login2(){
        WebElement main_page_login2 = myDriver.findElement(By.cssSelector("[data-cy='header-login-button']"));
        main_page_login2.click();
    }
    public void username() throws InterruptedException{
        WebElement username = myDriver.findElement(By.name("kullanici"));
        username.sendKeys(Config.username);
        Thread.sleep(500);
    }
    public void password() throws InterruptedException{
        WebElement password = myDriver.findElement(By.name("sifre"));
        password.sendKeys(Config.password);
        Thread.sleep(500);
    }
    public void login_click(){
        WebElement login_click = myDriver.findElement(By.cssSelector("#gg-login-enter"));
        login_click.click();
    }
    public void find_item(){
        WebElement find_item =myDriver.findElement(By.xpath("//input[@data-cy='header-search-input']"));
        find_item.sendKeys(Config.keyword);
    }
    public void search_button(){
        WebElement search_button = myDriver.findElement(By.xpath("//button[@data-cy='search-find-button']"));
        search_button.click();
    }
    public void find_page(){
        WebElement find_page = myDriver.findElement(By.cssSelector("#best-match-right > div.pager.pt30.hidden-m.gg-d-24 > ul > li:nth-child(2) > a"));
        find_page.click();
    }
    public void choose_item(){
        WebElement choose_item = myDriver.findElement(By.xpath("//li[@product-index="+Config.random+"]"));
        choose_item.click();
    }
    public void add_basket() throws InterruptedException{
        WebElement add_basket = myDriver.findElement(By.xpath("//*[@id=\"add-to-basket\"]"));
        add_basket.click();
        Thread.sleep(1000);
    }
    public String getPagePrice() {
        WebElement getPagePrice = myDriver.findElement(By.xpath("//div[@class='total-price']"));
        return  getPagePrice.getText();
    }
    public String getBasketPrice(){
        WebElement getBasketPrice = myDriver.findElement(By.xpath("//div[@class='gg-d-8 detail-price']"));
        return getBasketPrice.getText();
    }
    public void go_basket(){
        WebElement go_basket = myDriver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a"));
        go_basket.click();
    }
    public String check_amount(){
        WebElement check_amount = myDriver.findElement(By.xpath("//select[@data-value='2'"));
        return check_amount.getText();
    }
    public String check_empty(){
        WebElement check_empty = myDriver.findElement(By.xpath("//*[@id=\"empty-cart-container\"]/div[1]/div[1]/div/div[2]/h2"));
        return check_empty.getText();
    }
    public void inc_item() throws InterruptedException{
        WebElement inc_item = myDriver.findElement(By.xpath("//option[@value="+Config.amount+"]"));
        inc_item.click();
        Thread.sleep(2000);
    }
    public void item_delete(){
        WebElement item_delete = myDriver.findElement(By.xpath("//a[@title='Sil']"));
        item_delete.click();
    }
}
