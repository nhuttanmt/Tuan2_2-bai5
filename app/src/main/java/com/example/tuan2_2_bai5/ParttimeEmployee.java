package com.example.tuan2_2_bai5;

import androidx.annotation.NonNull;

public class ParttimeEmployee extends Employee {
    @Override
    public double tinhtien() {
        return 150;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString()+ " --> tien luong " +tinhtien();
    }
}
