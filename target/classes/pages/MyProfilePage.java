package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends ParentPage {

    public MyProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy (xpath = "//span[@itemprop='name' and contains (text(), 'Мой профиль')]")
    WebElement profileNameSection;

    public boolean sectionMyProfilepresent() {
        return actionsWithElements.isElementPresent(profileNameSection);
    }
}
