package ru.JRush.level6;

public class User {
    private String Name;

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return Name;
    }

    public int getAge() {
        return age;
    }

    private int age;
}
