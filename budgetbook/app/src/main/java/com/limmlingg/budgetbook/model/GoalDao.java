package com.limmlingg.budgetbook.model;

import androidx.lifecycle.LiveData;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GoalDao {
    @Query("SELECT * FROM Goal")
    LiveData<List<Goal>> getAll();

    @Query("SELECT * FROM Goal WHERE id IN (:GoalIds)")
    LiveData<List<Goal>> loadAllByIds(int[] GoalIds);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Goal goal);

    @Delete
    void delete(Goal goal);
}
