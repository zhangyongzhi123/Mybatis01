package com.zhang.proj;

public class User01 {
    private String id;
    private String name;
    private int pwd;

    public User01(){

    }

    public User01(String id, String name, int pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User01{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
