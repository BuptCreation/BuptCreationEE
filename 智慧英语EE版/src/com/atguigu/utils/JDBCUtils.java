package com.atguigu.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class JDBCUtils {
    public static Connection getConnection() throws Exception{
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);

    }

}
