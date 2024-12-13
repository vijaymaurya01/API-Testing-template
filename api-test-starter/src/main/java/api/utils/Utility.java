package api.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
    private static FileInputStream fileInput;
    private static Properties properties;

    public static String getProperty(String property) {

        try {
            fileInput = new FileInputStream(new File("src/test/resources/microsoft_ce_url.properties"));
            properties = new Properties();
            properties.load(fileInput);
            fileInput.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
        return properties.getProperty(property);
    }



}
