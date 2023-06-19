/**
 * Pojo to hold time related data.
 */

package com.git.learn.model;

public class Time {

    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hour;
    private Integer minute;
    private Integer seconds;
    private Integer milliSeconds;
    private String dateTime;
    private String date;
    private String time;
    private String timeZone;
    private String dayOfWeek;
    private Boolean dstActive;

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public void setMilliSeconds(Integer milliSeconds) {
        this.milliSeconds = milliSeconds;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setDstActive(Boolean dstActive) {
        this.dstActive = dstActive;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public Integer getMilliSeconds() {
        return milliSeconds;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public Boolean getDstActive() {
        return dstActive;
    }

    @Override
    public String toString() {
        return "Time{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour=" + hour +
                ", minute=" + minute +
                ", seconds=" + seconds +
                ", milliSeconds=" + milliSeconds +
                ", dateTime='" + dateTime + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", dstActive=" + dstActive +
                '}';
    }
}
