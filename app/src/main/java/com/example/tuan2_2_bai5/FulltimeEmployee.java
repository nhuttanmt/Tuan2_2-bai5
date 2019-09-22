package com.example.tuan2_2_bai5;

public class FulltimeEmployee extends Employee {
    @Override
    public double tinhtien() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString()+ " --> tien luong: " +tinhtien();
    }
}
