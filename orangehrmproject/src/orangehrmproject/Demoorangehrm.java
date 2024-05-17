package orangehrmproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoorangehrm {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKHI\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
          driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("http://localhost:8080/orangehrm/orangehrm-5.6.1/web/index.php/auth/login");
         driver.findElement(By.name("username")).sendKeys("rakhi.1534");
        driver.findElement(By.name("password")).sendKeys("Rakhi@123$");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.linkText("PIM")).click();
        driver.findElement(By.linkText("Add Employee")).click();
        driver.findElement(By.name("firstName")).sendKeys("RAKHI");
        driver.findElement(By.name("middleName")).sendKeys("M");
        driver.findElement(By.name("lastName")).sendKeys("S");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1030");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
    }
}
