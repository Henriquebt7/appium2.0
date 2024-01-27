package core;

import java.io.*;
import java.util.Properties;

public class properties {

    public static String preencherPath() {
        String absolutePathName = (new File("")).getAbsolutePath();
        String resourcesPath = "/src/main/resources/properties/";
        String absoluteResourcesPath = absolutePathName.concat(resourcesPath);
        String absoluteInformationPropertiesPath = absoluteResourcesPath.concat("variables.properties");
        return absoluteInformationPropertiesPath;
    }

    public static String getProperty(String property) {
        Properties prop = new Properties();

        try {
            InputStream input = new FileInputStream(preencherPath());
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String result = prop.getProperty(property);
        return result;
    }




}
