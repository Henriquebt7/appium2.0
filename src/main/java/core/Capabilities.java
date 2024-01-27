package core;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;


public class Capabilities {
    public static IOSDriver driveriOS = null;
    public static AndroidDriver driverAndroid = null;
    static String plataforma = properties.getProperty("plataforma").toLowerCase();

    public static AppiumDriver inicializarAppiumDriver() throws InterruptedException {
        switch (plataforma) {
            case "ios":
                if (driveriOS == null) {
                    System.out.println("Executando na plataforma: " + plataforma);
                    createDriverIos();
                    System.out.println("*********************");
                    System.out.println("****Driver Criado****");
                    System.out.println("*********************");
                    return driveriOS;
                }
                break;

            case "android":
                if (driverAndroid == null) {
                    System.out.println("Executando na plataforma: " + plataforma);
                    createDriverAndroid();
                    System.out.println("*********************");
                    System.out.println("****Driver Criado****");
                    System.out.println("*********************");
                    return driverAndroid;
                }
                break;
        }
        return null;
    }



    static void createDriverAndroid() throws InterruptedException {
        UiAutomator2Options optionsCapabilities = new UiAutomator2Options();
        optionsCapabilities.setPlatformName("Android");
        optionsCapabilities.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        optionsCapabilities.setDeviceName("RQCR5001D3M");
        optionsCapabilities.setAppPackage("com.itau");
        optionsCapabilities.setAppActivity("br.com.itau.pf.ui.activity.SplashActivity");

        try {
            driverAndroid = new AndroidDriver(new URL("http://127.0.0.1:4723/"), optionsCapabilities);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void createDriverIos() throws InterruptedException {
        XCUITestOptions optionsCapabilities = new XCUITestOptions();
        optionsCapabilities.setPlatformName("iOS");
        optionsCapabilities.setAutomationName("XCUITest");
        optionsCapabilities.setDeviceName("iPhone 15");
        optionsCapabilities.setBundleId("io.appium.TestApp");

        try {
            driveriOS = new IOSDriver(new URL("http://127.0.0.1:4723/"), optionsCapabilities);
            System.out.println("Driver iOS criado com sucesso!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public AppiumDriver getDriver() {
        switch (plataforma) {
            case "ios":
                return driveriOS;

            case "android":
                return driverAndroid;
            default:
                return null;
        }
    }
}