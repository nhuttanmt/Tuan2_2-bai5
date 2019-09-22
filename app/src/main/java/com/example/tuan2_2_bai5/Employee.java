package com.example.tuan2_2_bai5;

import androidx.annotation.NonNull;

public abstract class Employee {
    private String id;
    private String name;

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
    public abstract double tinhtien();


    @Override
    public String toString() {
        return "Nhan vien: " +id +" " +name ;
    }
}
