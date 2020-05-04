package com.huwenjun.pojo;

public class Fruit {
    private  String name;
    private int imageId;
    private  String neiRong;

    public Fruit(){

    }

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getNeiRong() {
        return neiRong;
    }

    public void setNeiRong(String neiRong) {
        this.neiRong = neiRong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
