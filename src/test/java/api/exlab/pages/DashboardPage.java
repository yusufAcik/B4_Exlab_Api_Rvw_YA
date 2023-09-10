package api.exlab.pages;


import api.exlab.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//li[@class='breadcrumb-item'][2]")
    public WebElement dashboardElement;

    public String getProfileDetails(String details){
        return Driver.get().findElement(By.xpath("//div[text()='"+details+"']")).getText();
    }
}
