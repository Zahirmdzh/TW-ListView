package com.myapplicationdev.android.tw_listview;

public class Course {

    private String year;
    private String module;

    public Course(String year, String module) {
        this.year = year;
        this.module = module;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
