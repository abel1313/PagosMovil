package com.example.pagomovil.Vista.Menu.ui.compra;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CompraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CompraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}