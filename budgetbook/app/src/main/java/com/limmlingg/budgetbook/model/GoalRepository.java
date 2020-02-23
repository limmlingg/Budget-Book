package com.limmlingg.budgetbook.model;

import android.app.Application;
import androidx.lifecycle.LiveData;

import java.util.List;

public class GoalRepository {
    private GoalDao mGoalDao;
    private LiveData<List<Goal>> mAllGoals;

    // Note that in order to unit test the GoalRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    GoalRepository(Application application) {
        RoomDatabase db = RoomDatabase.getDatabase(application);
        mGoalDao = db.GoalDao();
        mAllGoals = mGoalDao.getAll();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Goal>> getAllGoals() {
        return mAllGoals;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Goal Goal) {
        RoomDatabase.databaseWriteExecutor.execute(() -> {
            mGoalDao.insert(Goal);
        });
    }
}
