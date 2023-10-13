package org.example.footballers.entities;

public abstract class User {

       private String name;
        private int age;


        //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFootball() {
        return football;
    }

    public void setFootball(boolean football) {
        this.football = football;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    private boolean football;

        private Sex sex;

}

