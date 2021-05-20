import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods {
    private static WebDriver driver = new ChromeDriver();
    static PageObject element = new PageObject(driver);
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver.exe",Config.driverPath);
        open_page();
        clear_cookie();
        main_page_login();
        main_page_login2();
        username();
        password();
        login_click();
        find_item();
        search_button();
        find_page();
        choose_item();
        add_basket();
        go_basket();
        inc_item();
        item_delete();
        finish();
    }
    public static void open_page(){
        driver.get(Config.url);
        driver.manage().window().maximize();
        String checkUrl = driver.getCurrentUrl();
        if(checkUrl .equals(Config.url) ){
            System.out.println("Correct URL!");
        }
        else {
            System.out.println("Wrong URL!");
        }
    }
    public static void clear_cookie(){
        element.clear_cookie();
    }
    public static void main_page_login() throws InterruptedException {
        element.main_page_login();
    }
    public static void main_page_login2(){
        element.main_page_login2();
    }
    public static void username() throws InterruptedException {
        element.username();
    }
    public static void password() throws InterruptedException {
        element.password();
    }
    public static void login_click() throws InterruptedException{
        Thread.sleep(1000);
        element.login_click();
    }
    public static void find_item() {
        element.find_item();
    }
    public static void search_button(){
        element.search_button();
    }
    public static void find_page(){
        element.find_page();
        String getUrl = driver.getCurrentUrl();
        if (getUrl .equals(Config.checkPage) ){
            System.out.println("You are in the second page!");
        }
        else {
            System.out.println("You are not in the second page!");
        }
    }
    public static void choose_item(){
        element.choose_item();
    }
    public static void add_basket() throws InterruptedException {
        element.add_basket();
    }
    public static void go_basket() throws InterruptedException {
        Thread.sleep(500);
        element.go_basket();
        if (element.getPagePrice().equals(element.getBasketPrice())){
            System.out.println("Price is correct!");
        }
        else{
            System.out.println("Price is incorrect!");
        }
    }
    public static void inc_item() throws InterruptedException{
        element.inc_item();
    }
    public static void item_delete() throws InterruptedException {
        Thread.sleep(1000);
        element.item_delete();
        Thread.sleep(1000);
        if (element.check_empty().equals(Config.checkEmpty)){
            System.out.println("Basket is empty!");
        }
        else{
            System.out.println("Price is not empty!");
        }
    }
    public static void finish()  throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }
}
