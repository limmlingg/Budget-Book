package com.limmlingg.budgetbook.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Item {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "item_type")
    private int itemType;
    private Date date;
    private double price;
    private String description;

    public Item(int id, int itemType, Date date, double price, String description) {
        this.id = id;
        this.itemType = itemType;
        this.date = date;
        this.price = price;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getItemType() {
        return itemType;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
