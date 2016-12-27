package com.wangl1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by seentech on 2016/12/27.
 */
public class GetProperity {


    public static void main(String[] args) throws IOException {
        String ConfPath = "E:\\WLGIT\\Sword\\src\\com\\wangl1\\Test.properties";

        Properties properties = new Properties();

        //获取文件输入流
        FileInputStream fileInputStream = new FileInputStream(ConfPath);

        //加载文件输入流
        properties.load(fileInputStream);

        //获取配置文件中key列表
        Enumeration enumeration = properties.propertyNames();

        //通过key获取相应的value
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            String value = properties.getProperty(key);

            System.out.println(key + "=" + value);
        }
    }
}
