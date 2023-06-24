package org.example.stepDefs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configuration {

    //set value(store data) inside config.properties  set value from class to config.properties

  public static void  set(String key,String value) throws IOException {
      //3 classes: properties ,fileinputstream,fileoutputstream;
      Properties prob =  new Properties();
      FileInputStream fis = new FileInputStream("config.properties");
      prob.load(fis);
      prob.setProperty(key, value);
      fis.close();
      FileOutputStream fos = new FileOutputStream("config.properties");
     prob.store(fos,"");

  }


    //set value from config.properties  set value from class

    public  String  get(String key) throws IOException {
        Properties prob =  new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prob.load(fis);
       String value = prob.getProperty(key);
        fis.close();
        return value;


    }









}
