package com.example.inshta.Models;

public class editProfileModel {

    String country;
    String profession;
    String relation;
    String gender;
    String birthday;


    public editProfileModel(String country, String profession, String relation,String birthday, String gender) {
        this.country = country;
        this.profession = profession;
        this.relation = relation;
        this.birthday = birthday;
        this.gender = gender;
    }


    public editProfileModel() {
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
