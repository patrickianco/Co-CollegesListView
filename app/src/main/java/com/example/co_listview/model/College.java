package com.example.co_listview.model;

/**
 * Created by Patrick Ian Co on 9/7/2017.
 */

public class College {
    private int logo;
    private String collegeName;
    private String collegeEst;

    public College(int logo, String collegeName, String collegeEst) {
        this.logo = logo;
        this.collegeName = collegeName;
        this.collegeEst = collegeEst;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeEst() {
        return collegeEst;
    }

    public void setCollegeEst(String collegeEst) {
        this.collegeEst = collegeEst;
    }
}
