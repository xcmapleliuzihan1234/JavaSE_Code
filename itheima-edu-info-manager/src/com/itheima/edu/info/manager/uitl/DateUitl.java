package com.itheima.edu.info.manager.uitl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUitl {
    private DateUitl(){
    }
    public static String getAge(String date){
        Date date1 = new Date();
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        long time = 0;
        try {
            time = spf.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long time1 = date1.getTime();

        int birth =(int)( (time1 - time)/(1000L*3600*24*365));
        return birth + "";
    }
}
