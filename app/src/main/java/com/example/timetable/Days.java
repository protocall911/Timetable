package com.example.timetable;

import java.util.ArrayList;

public class Days {

    private String dayName;
    private String class_1;
    private String class_2;
    private String class_3;
    private String class_4;
    private String class_5;
    private String class_6;

    public Days(String dayName, String class_1, String class_2, String class_3,
                String class_4, String class_5, String class_6){
        this.dayName = dayName;
        this.class_1 = class_1;
        this.class_2 = class_2;
        this.class_3 = class_4;
        this.class_4 = class_4;
        this.class_5 = class_5;
        this.class_6 = class_6;
    }

    public String getDayName(){
        return dayName;
    }
    public String getClass_1(){
        return class_1;
    }
    public String getClass_2(){
        return class_2;
    }
    public String getClass_3(){
        return class_3;
    }
    public String getClass_4(){
        return class_4;
    }
    public String getClass_5(){
        return class_5;
    }
    public String getClass_6(){
        return class_6;
    }
}
