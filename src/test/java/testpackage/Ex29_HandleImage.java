package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 

public class Ex29_HandleImage {
    
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";
    
  @Test
  public void test01() throws InterruptedException {
      
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        
        Thread.sleep(2000);
        
        WebElement logo = driver.findElement(By.className("logo"));
        System.out.println(logo.getAttribute("alt"));
        System.out.println(logo.getSize());
        
        Thread.sleep(2000);
        driver.quit();
        
        
      
  }
}