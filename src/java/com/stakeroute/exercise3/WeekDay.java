package com.stakeroute.exercise3;

import java.util.Calendar;
import java.util.Date;

public class WeekDay {
    public Date firstDayOfWeek(Date date){
        Calendar calendar= Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        System.out.println(calendar.getTime());
        return calendar.getTime();
    }

    public Date lastDayOfWeek( Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.SUNDAY);
        System.out.println(calendar.getTime());
        return calendar.getTime();
    }
}
