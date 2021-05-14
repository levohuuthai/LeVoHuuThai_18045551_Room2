package com.example.levohuuthai_tuan8_room2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Adress.class},version = 1)
public abstract class AdressDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "ADRESS.db";
    private static AdressDatabase instance;

    public static synchronized AdressDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),AdressDatabase.class,DATABASE_NAME)
                    .allowMainThreadQueries().build();
        }
        return instance;
    }
    public abstract AdressDAO adressDAO();
}
