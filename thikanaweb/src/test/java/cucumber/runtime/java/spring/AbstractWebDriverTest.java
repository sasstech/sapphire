package cucumber.runtime.java.spring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractWebDriverTest {

    protected WebDriver getDriver() {
        return new ChromeDriver();  //To change body of created methods use File | Settings | File Templates.
    }

    protected WebDriver goToUrl(String url){
        getDriver().get(url);
        return getDriver();
    }

}
