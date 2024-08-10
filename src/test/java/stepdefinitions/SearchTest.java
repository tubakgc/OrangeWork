package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class SearchTest {
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);


    @Given("kullanıcı giriş yapar")
    public void kullanıcıGirişYapar() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin123");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        loginButton.click();

    }

    @And("Recruitment sayfası gider")
    public void recruitmentSayfasıGider() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/recruitment/viewRecruitmentModule\"]")).click();

    }

    @And("Recruitment sayfasında olduğu doğrular")
    public void recruitmentSayfasındaOlduğuDoğrular() {
        String expectedRecruitmentUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
        assertTrue(expectedRecruitmentUrl.equals(driver.getCurrentUrl()));
    }

    @And("Status tablosunda {string} seçeneğine tıklanır")
    public void statusTablosundaSeçeneğineTıklanır(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        WebElement status = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[4]"));
        status.click();
        Thread.sleep(2000);
        actions.click(status).keyDown(status, Keys.ARROW_DOWN).click().perform();
    }

    @And("search butonuna tıklanır")
    public void searchButonunaTıklanır() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    @And("Açılan tabloda istenilen filtreleme görüntülenir")
    public void açılanTablodaIstenilenFiltrelemeGörüntülenir() {
        driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]")).getText();
        driver.quit();
    }

    @Given("Kullanıci giris yapar")
    public void kullanıciGirisYapar() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin123");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        loginButton.click();

    }


    @And("Date of Application kısmı {string} yazar")
    public void dateOfApplicationKısmıYazar(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("2024-06-02");
    }


    @And("Açılan tabloda istenilen kişi görüntülenir")
    public void açılanTablodaIstenilenKişiGörüntülenir() {
        driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]")).getText();
        driver.quit();
    }


    @And("PIM sayfasına gider")
    public void pımSayfasınaGider() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]")).click();

    }

    @And("Pım sayfasında olduğu doğrulanır")
    public void pımSayfasındaOlduğuDoğrulanır() throws InterruptedException {
        Thread.sleep(2000);
        String pimUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        assertTrue(pimUrl.equals(driver.getCurrentUrl()));
    }

    @And("Employee Id {string} yazar")
    public void employeeIdYazar(String arg0) throws InterruptedException {
        driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("13345");
        Thread.sleep(2000);
    }


    @And("Sub unit tablosunda {string} seçeneği tıklanır")
    public void subUnitTablosundaSeçeneğiTıklanır(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        WebElement subUnit = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text--after\"])[4]"));
        subUnit.click();
        Thread.sleep(2000);
        actions.click(subUnit).keyDown(subUnit, Keys.ARROW_DOWN).click().perform();

    }
    @And("Job Title tablosunda {string} seçeneği tıklanır")
    public void jobTitleTablosundaSeçeneğiTıklanır(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        WebElement jobTitle = driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[3]"));
        jobTitle.click();
        Thread.sleep(2000);
        actions.click(jobTitle).keyDown(jobTitle, Keys.ARROW_DOWN).click().perform();
        Thread.sleep(2000);

    }




    @And("Vacancy tablosunda {string} seçeneğine tıklar")
    public void vacancyTablosundaSeçeneğineTıklar(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        WebElement vacancy = driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[2]"));
       vacancy.click();
        Thread.sleep(2000);
        actions.click(vacancy).keyDown(vacancy, Keys.ARROW_DOWN).click().perform();
        Thread.sleep(2000);


    }

    @And("Method of Application tablosunda {string} seçeneğine tıklar")
    public void methodOfApplicationTablosundaSeçeneğineTıklar(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        WebElement manuel = driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[5]"));
        manuel.click();
        Thread.sleep(2000);
        actions.click(manuel).keyDown(manuel, Keys.ARROW_DOWN).click().perform();
        Thread.sleep(2000);

    }


}
