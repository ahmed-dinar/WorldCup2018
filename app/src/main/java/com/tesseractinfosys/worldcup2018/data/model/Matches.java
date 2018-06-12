package com.tesseractinfosys.worldcup2018.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "matches")
public class Matches {

    @PrimaryKey
    private int id;

    public int getId(){
        return id;
    }

}
