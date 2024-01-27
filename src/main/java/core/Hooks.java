package core;

import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class Hooks {
    private AppiumDriver driver = null;

    @BeforeEach
    public void iniciar() throws InterruptedException {
      driver = Capabilities.inicializarAppiumDriver();
    }

    @AfterEach
    public void finalizar() {

    }

}
