package com.mirea.sumachev.viewmodel;

import android.os.Handler;

import androidx.lifecycle.MutableLiveData;

public class ProgressViewModel {

    private static MutableLiveData<Boolean> isShowProgress = new MutableLiveData<>();
    // Показать прогресс в течении 10 сек.
    void showProgress() {
        isShowProgress.postValue(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isShowProgress.postValue(false);
            }
        }, 10000);
    }
    // Возвращает состояние прогресс?
    MutableLiveData<Boolean> getProgressState() {
        return isShowProgress;
    }
}
