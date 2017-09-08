package com.example.jczachor.badencryptionapp;

import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jczachor on 08.09.2017.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;
    private BadEncrypter badEncrypter;

    public MainPresenterImpl(MainView mainView, BadEncrypter badEncrypter) {
        this.mainView = mainView;
        this.badEncrypter = badEncrypter;
    }

    @Override
    public void onReverseBtnClicked() {
    mainView.setEditText(badEncrypter.enc_reverse(getMainView().getEditText()));
    }

    @Override
    public void onLettersToDigitsBtnClicked() {
    mainView.setEditText(badEncrypter.enc_changeToDigits(getMainView().getEditText()));
    }


    public MainView getMainView() {
        return mainView;
    }
}
