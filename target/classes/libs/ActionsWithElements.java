package libs;


import org.apache.http.util.Asserts;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsWithElements {

    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;

    public ActionsWithElements (WebDriver webDriver) {
        this.webDriver = webDriver; // ЭТО ЧТО!!!!
    }

    public void linkTothePage(String pageLink) {
        try {
            webDriver.get(pageLink);
            logger.info("The page was opened");
        } catch (Exception e) {
            logger.error("The page wasn't opened" + e);
        }
    }

    public void openSite () {
        try {
            webDriver.get("https://www.drogas.lv/");
            logger.info("The site has been opened");
        } catch (Exception e) {
            logger.error("The site wasn't opened");
            //тут должен быть вссерт, но он не добавдяется
        }
    }

    public void click (WebElement element) {
        try {
            element.click();
            logger.info("The element " + element + " was clicked");
        } catch (Exception e) {
            logger.error("The element " + element + " WASN'T CLICKED");

        }
    }


    public void clickOnElement (WebElement element, String textToEnter) {
        try {
            element.click();
            element.sendKeys(textToEnter);
            logger.info("The element --" + element + " -- was clicked");
        } catch (Exception e) {
            logger.error("The element --" + element + " -- WASN'T clicked");
        }
    }




    public boolean isElementPresent(WebElement element) {
        try {
            boolean isDisplayed = element.isDisplayed();
            logger.info("Element -- " + element + " --is displayed");
            return isDisplayed;

        } catch (Exception e) {
            logger.error("Element -- " + element + " -- IS NOT displayed");
            return false;
        }
    }
}
