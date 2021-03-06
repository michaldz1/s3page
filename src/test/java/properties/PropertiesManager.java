package properties;

import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by michald on 07/01/2018.
 */
public class PropertiesManager {
    private static PropertiesManager instance = null;
    private static Properties properties = null;
    private PropertiesManager(){}

    private static PropertiesManager getInstance(){
        if (instance==null) {
            instance = new PropertiesManager();}
            return instance;
        }
    private static Properties loadDefaultProperties() {
        if (properties == null){
        try {
            File file=new File("default.properties");
            FileInputStream fileInput=new FileInputStream(file);
            Properties properties=new Properties();
            properties.load(fileInput);
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }}
        return properties;
    }
    public static String getProperty(String key){
        PropertiesManager.getInstance().loadDefaultProperties();
        return properties.getProperty(key);
    }




    }


