package com.example.jczachor.badencryptionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {
    private EditText editText;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.reverse).setOnClickListener(this);
        editText = (EditText) findViewById(R.id.password);
        presenter = new MainPresenterImpl(this, new BadEncrypterImpl());
    }




    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public String getEditText() {
        return editText.getText().toString();
    }

    @Override
    public void setEditText(String s) {
        editText.setText(s);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.reverse:
                presenter.onReverseBtnClicked();
                break;
            case R.id.todigits:
                presenter.onLettersToDigitsBtnClicked();
                break;
        }
    }
}
