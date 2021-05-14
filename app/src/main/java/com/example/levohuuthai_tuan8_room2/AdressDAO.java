package com.example.levohuuthai_tuan8_room2;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AdressDAO {
    @Insert
    void insertAdress(Adress adress);

    @Query("SELECT * FROM adress")
    List<Adress> getListAdress();
}
