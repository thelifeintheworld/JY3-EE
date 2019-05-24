package com.test.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Proutil {
//拿到商品id
    public  static  String getProId(){
        String s = null;
        Random random = new Random();
        int i = random.nextInt(100);
        s = String.valueOf(System.currentTimeMillis());
        if(i<10){
            s += "0"+i;
        }else{
            s += i;
        }
        return  s;
    }
//    字符串转换为date
    public static Date stringToDate(String s){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try {
            java.util.Date parse= sdf.parse(s);
         date  = new Date(parse.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  date;
    }

}
