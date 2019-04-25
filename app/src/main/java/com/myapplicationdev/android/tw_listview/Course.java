package com.myapplicationdev.android.tw_listview;

public class Course {

    private String module;
    private boolean prog;

    public Course(String module, boolean prog) {
        this.module = module;
        this.prog = prog;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public boolean isProg(){
        return prog;
    }
}
