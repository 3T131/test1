package com.yjs.entity;

import oracle.sql.DATE;

import java.util.Date;

/*
* 房屋信息表
* */
public class House {
    private int id; //房屋信息
    private String title; //标题
    private String description;//描述
    private int price;//出租价格
    private Date pubdate;//发布时间
    private int floorage;//面积
    private String contact;//联系人
    private int user_id;//用户编号
    private int type_id;//类型编号
    private int street_id;//街道编号

    public House() {
    }

    public House(String title, int floorage) {
        this.title = title;
        this.floorage = floorage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public int getFloorage() {
        return floorage;
    }

    public void setFloorage(int floorage) {
        this.floorage = floorage;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getStreet_id() {
        return street_id;
    }

    public void setStreet_id(int street_id) {
        this.street_id = street_id;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", pubdate=" + pubdate +
                ", floorage=" + floorage +
                ", contact='" + contact + '\'' +
                ", user_id=" + user_id +
                ", type_id=" + type_id +
                ", street_id=" + street_id +
                '}';
    }
}
