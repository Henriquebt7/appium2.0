package core;

import io.appium.java_client.AppiumDriver;

public class BasePage extends Capabilities {

    AppiumDriver driver;

    {
        try {
            driver = Capabilities.inicializarAppiumDriver();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
