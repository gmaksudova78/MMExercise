package mmExercise.utilities;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BrowserUtil {
    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void verifyElementDisplayed(WebElement element) {
            try {
                assertTrue("Element not visible: "+element, element.isDisplayed());
            } catch (NoSuchElementException e) {
                Assert.fail("Element not found: " + element);

            }
        }

    public static List<Double> getElementsText(List<WebElement> list) {
        List<Double> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(Double.valueOf(el.getText()));
        }
        return elemTexts;
    }
    }

