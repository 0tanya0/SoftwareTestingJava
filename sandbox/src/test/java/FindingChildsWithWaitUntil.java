import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
/**
 * Created by 0tanya0 on 9/18/2016.
 */
public class FindingChildsWithWaitUntil {

    public static void main(String[] args) throws InterruptedException {

        //create a new instance of the IE driver
        WebDriver driver = new FirefoxDriver();

        driver.get("http://demos.telerik.com/aspnet-ajax/webmail/default.aspx");
        new WebDriverWait(driver,10).until(titleIs("Mail"));

        WebElement folder = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ctl00_FolderContent_FolderNavigationControl_rtvFolders']/ul/li[6]/div/span[2]")));
        folder.click();

        List<WebElement> elements = new WebDriverWait(driver,10)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        new ByChained(By.id("ctl00_FolderContent_FolderNavigationControl_rtvFolders"),
                                By.xpath("//li[6]/ul/descendant::li"))));
        for (WebElement element:elements) {
            element.click();
        }


        // Close the driver
        driver.quit();
    }
}
