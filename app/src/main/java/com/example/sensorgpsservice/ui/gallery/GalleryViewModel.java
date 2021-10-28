package com.example.sensorgpsservice.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("1. Sign Up with a google account.\n" +
                "2. Fill the mandatory form according to your valid info.\n" +
                "3. Allow the permission asked by the app, such as: GPS and others.\n" +
                "4. Keep the app running in the background for participating on this survey.\n" +
                "5. If you want to change the email, then use the exit button and sign up with a new one. Otherwise don't need to use the exit button.\n\n" +
                "       Thank You for your co-operation on this survey. Have a good day! \n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}