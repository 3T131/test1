package com.yjs.entity;
/*
* 街道表
* */
public class Street {
    private int id ; //街道编号
    private String  name;//街道名字
    private  int District_id ;//所属区县编号;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrict_id() {
        return District_id;
    }

    public void setDistrict_id(int district_id) {
        District_id = district_id;
    }
}
