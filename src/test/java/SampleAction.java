import core.BasePage;
import org.openqa.selenium.By;

public class SampleAction extends BasePage {

    SampleScreen sampleScreen = new SampleScreen();


    public void soma(String valor1, String valor2) {
        getDriver().findElement(By.xpath("//XCUIElementTypeTextField[@name='IntegerA']")).click();
        getDriver().findElement(By.xpath("//XCUIElementTypeTextField[@name='IntegerA']")).sendKeys(valor1);
        getDriver().findElement(By.xpath("//XCUIElementTypeTextField[@name='IntegerB']")).click();
        getDriver().findElement(By.xpath("//XCUIElementTypeTextField[@name='IntegerB']")).sendKeys(valor1);
        getDriver().findElement(By.xpath("//XCUIElementTypeButton[@name='ComputeSumButton']")).click();
    }


}
