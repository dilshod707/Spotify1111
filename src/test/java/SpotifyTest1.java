import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;


public class SpotifyTest1 {

    public static void main(String[] args) throws InterruptedException {

        //STEP 1

        WebDriver driver = new ChromeDriver();
        driver.get("https://open.spotify.com/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class =\"ButtonInner-sc-14ud5tc-0 bABUvF encore-inverted-light-set\" ]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("davidme1988@gmail.com", Keys.TAB, "Fairfax2024",Keys.ENTER);

        Thread.sleep(3000);
        WebElement expectedIcon = driver.findElement(By.xpath("//div[@data-testid='placeholder-wrapper']"));
        System.out.println(expectedIcon.isDisplayed());

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'Search')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@data-testid='search-input']")).sendKeys("Adele Hello");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class = \"_gB1lxCfXeR8_Wze5Cx9\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class=\"ButtonInner-sc-14ud5tc-0 gGxSiT encore-bright-accent-set\"]")).click();

       String songName = driver.findElement(By.xpath("//a[@aria-label='Now playing: Hello by Adele']")).getText();

       //Assert.assertEquals(songName, "Hello by Adele"); Could not implement this code


        driver.findElement(By.xpath("//div[@data-testid='placeholder-wrapper']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(), 'Log out')]")).click();

        Thread.sleep(2000);


        WebElement login2 = driver.findElement(By.xpath("//span[contains(text(), 'Log in')]"));
        System.out.println(login2.isDisplayed());

        driver.quit();




    }
}