package com.itheima.game.domain;

public class Hero {
    private String name; // 名称
    private String occ;  //职业
    private String price;  //价格
    private String type;  //类型

    public Hero() {
    }

    public Hero(String name, String occ, String price, String type) {
        this.name = name;
        this.occ = occ;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
