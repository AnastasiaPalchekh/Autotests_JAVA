import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args)   {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\anast\\Autotests\\MyProject\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");


    }
}
