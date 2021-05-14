package com.example.levohuuthai_tuan8_room2;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "adress")
public class Adress {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
