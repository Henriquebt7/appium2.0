import core.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SampleScreen extends BasePage {

    @AndroidFindBy(xpath = "mapear")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IntegerA']")
    public String _lblValor1;

    @AndroidFindBy(xpath = "mapear")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='IntegerB']")
    public WebElement _lblValor2;

    @AndroidFindBy(xpath = "mapear")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='ComputeSumButton']")
    public WebElement _btnSoma;


}
