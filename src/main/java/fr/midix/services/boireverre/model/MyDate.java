package fr.midix.services.boireverre.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author midix
 */
public class MyDate implements Serializable, Comparable<Object> {

    private GregorianCalendar calendar;
    private static Locale locale = Locale.FRANCE;
    private String dateString;

    public MyDate(int year, int month, int day, int hour, int minute) {
        this.calendar = new GregorianCalendar(locale);
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
        this.setHour(hour);
        this.setMinute(minute);
        this.refreshDateString();
    }
   
    public int getYear(){
        return this.calendar.get(GregorianCalendar.YEAR);
    }
    
    public int getMonth(){
        return this.calendar.get(GregorianCalendar.MONTH)+1;
    }
    
    public int getDay(){
        return this.calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    public int getHour(){
        return this.calendar.get(GregorianCalendar.HOUR_OF_DAY);
    }
    
    public int getMinute(){
        return this.calendar.get(GregorianCalendar.MINUTE);
    }
    
    public void setYear(int year){
        this.calendar.set(GregorianCalendar.YEAR, year);
        this.refreshDateString();
    }
    
    public void setMonth(int month){
        this.calendar.set(GregorianCalendar.MONTH, month-1);
        this.refreshDateString();
    }
    
    public void setDay(int day){
        this.calendar.set(GregorianCalendar.DAY_OF_MONTH, day);
        this.refreshDateString();
    }
    
    public void setHour(int hour){
        this.calendar.set(GregorianCalendar.HOUR_OF_DAY, hour);
        this.refreshDateString();
    }
    
    public void setMinute(int minute){
        this.calendar.set(GregorianCalendar.MINUTE, minute);
        this.refreshDateString();
    }
    
    public String getDateString(){
        return this.dateString;
    }
    
    public int compareTo(Object o) {
        if(!(o instanceof MyDate)){
            throw new IllegalArgumentException();
        }
        else{
            MyDate date2 = (MyDate)o;
            return this.calendar.compareTo(date2.getCalendar());
        }
    }
    
    public GregorianCalendar getCalendar(){
        return this.calendar;
    }
    
    private void refreshDateString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        java.util.Date dateDate = this.calendar.getTime();
 
        this.dateString = dateFormat.format(dateDate);
    }
    
    public static MyDate convertStringToMyDate(String date){
		String[] dates = date.split("/");
        int day = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int year = Integer.parseInt(dates[2]);
        MyDate myDate = new MyDate(year, month, day, 0, 0);
        return myDate;
	}
    
    public static void main(String[] args){
        MyDate date1 = new MyDate(2012, 5, 21, 22, 18);
        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getDay());
        System.out.println(date1.getHour());
        System.out.println(date1.getMinute());
        System.out.println(date1.getDateString());
    }

    
    
}
