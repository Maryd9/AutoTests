import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class onetest {
    WebDriver webdriver = new ChromeDriver();
    boolean result = false;

    @BeforeEach
    public void setup() {
        System.out.println("Setup success");
    }

    @Test
    public void goToGoogle() {
        webdriver.get("https://www.google.com/");
        WebElement search = webdriver.findElement(By.xpath("//textarea[@type='search']"));
        search.sendKeys("Hello World");
        search.sendKeys(Keys.ENTER);
        result = webdriver.findElement(By.xpath("//div[contains(text(),'Результатов')]")).isDisplayed();
        webdriver.close();
        System.out.println("Результат: " + result);
    }

    @Test
    public void goToOzon() {
        webdriver.get("https://www.ozon.ru/");
        WebElement ozon = webdriver.findElement(By.xpath("//img[@alt='Ozon']"));
        result = ozon.isDisplayed();
        System.out.println("Результат: " + result);
        webdriver.close();
    }

    @AfterEach
    public void closebrowser() {

        System.out.println("Все классно");

    }
}
