package com.limmlingg.budgetbook.model;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModel extends AndroidViewModel {
    private GoalRepository mRepository;

    private LiveData<List<Goal>> mAllGoals;

    public ViewModel (Application application) {
        super(application);
        mRepository = new GoalRepository(application);
        mAllGoals = mRepository.getAllGoals();
    }

    LiveData<List<Goal>> getAllGoals() { return mAllGoals; }

    public void insert(Goal Goal) { mRepository.insert(Goal); }
}
