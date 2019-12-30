package com.jgs1902.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*获取系统当前时间*/
public class NowTime {
    public static String now(){
        Date now=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(now);
    }
}
