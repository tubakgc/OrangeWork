package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class LoginTest {
    String expectedTitle = "OrangeHRM";
    WebDriver driver = new ChromeDriver();


    @Given("Kullanıcı login sayfasına gider")
    public void kullanıcıLoginSayfasınaGider() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Kullanıcı login sayfasını doğrular")
    public void kullanıcıLoginSayfasınıDoğrular() {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    @And("Kullanıcı geçerli kullanıcı adını girer")
    public void kullanıcıGeçerliKullanıcıAdınıGirer() throws InterruptedException {
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("Admin");

    }

    @And("Kullanıcı geçerli  şifre girer")
    public void kullanıcıGeçerliŞifreGirer() throws InterruptedException {
        Thread.sleep(2000);
        WebElement password= driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin123");
    }

    @And("Kullanıcı {string} butonuna tıklar")
    public void kullanıcıButonunaTıklar(String arg0) {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    @Then("Kullanıcı Dashboard ekranını  görür")
    public void kullanıcıDashboardEkranınıGörür() {

        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        assertTrue(expectedUrl.equals(driver.getCurrentUrl()));
        driver.quit();
    }

    @Given("Kullanıcı geçersiz şifre için login sayfasına gider")
    public void kullanıcıGeçersizŞifreIçinLoginSayfasınaGider() {

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Kullanıcı geçerli olan kullanıcı adını girer")
    public void kullanıcıGeçerliOlanKullanıcıAdınıGirer() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
    }

    @And("Kullanıcı geçersiz şifreyi girer")
    public void kullanıcıGeçersizŞifreyiGirer() {
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin1");
    }

    @And("Kullanıcı {string} butona tıklar")
    public void kullanıcıButonaTıklar(String arg0) {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    @Then("Kullanıcı hata mesajı içeren sayfada kalır")
    public void kullanıcıHataMesajıIçerenSayfadaKalır() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed();
        driver.quit();
    }
}

