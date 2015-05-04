package com.json;


import org.apache.log4j.Logger;

public class Log {
    private static Logger logger =  Logger.getLogger(Log.class);   
    public static void main(String[] args) {
       String s = "123456789";
       s.contains("123");
       System.out.println(s.contains("123"));
    }
}
