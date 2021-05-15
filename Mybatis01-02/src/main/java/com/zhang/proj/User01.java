package com.zhang.proj;

public class User01 {
    private String id;
    private String name;
    private int passwrod;

    public User01(){

    }

    public User01(String id, String name, int passwrod) {
        this.id = id;
        this.name = name;
        this.passwrod = passwrod;
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

    public int getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(int passwrod) {
        this.passwrod = passwrod;
    }

    @Override
    public String toString() {
        return "User01{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", passwrod=" + passwrod +
                '}';
    }
}
