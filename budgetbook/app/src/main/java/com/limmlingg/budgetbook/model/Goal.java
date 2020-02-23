package com.limmlingg.budgetbook.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Goal {

    @PrimaryKey
    public int id;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "start_date")
    public String startDate;
    @ColumnInfo(name = "end_date")
    public String endDate;
    @ColumnInfo(name = "target_amount")
    public double targetAmount;
    @ColumnInfo(name = "current_amount")
    public double currentAmount;
}
