package com.tesseractinfosys.worldcup2018.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.tesseractinfosys.worldcup2018.data.model.Matches;

import java.util.List;

@Dao
public interface MatchesDao {

    @Query("SELECT * FROM matches")
    List<Matches> getAll();

}
