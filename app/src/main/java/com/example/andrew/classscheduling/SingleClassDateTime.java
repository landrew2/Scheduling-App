package com.example.andrew.classscheduling;


import java.util.Arrays;

/**
 * Created by Andrew on 1/23/2017.
 */

//Class that contains data about 1 particular class time for 1 specific class
public class SingleClassDateTime {

    private int startTime;
    private int endTime;
    private boolean[] daysOccupied = new boolean[7]; // true denotes there is a class on that day
    private String section = "";//optional section label
    private String comments = "";//optional comments for this section of the class

    //constructor
    public SingleClassDateTime(int startHour, int startMin, int endHour, int endMin, boolean[] daysOccupied, String section, String comments) {
        this.daysOccupied = daysOccupied;
        this.section = section;
        this.comments = comments;

        //sets up the date times
        this.startTime = startHour*100+ startMin;
        this.endTime = endHour*100+endMin;

    }

    @Override
    public String toString() {
        return "SingleClassDateTime{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", daysOccupied=" + Arrays.toString(daysOccupied) +
                ", section='" + section + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    //GETTERS AND SETTERS
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public boolean[] getDaysOccupied() {
        return daysOccupied;
    }

    public void setDaysOccupied(boolean[] daysOccupied) {
        this.daysOccupied = daysOccupied;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
